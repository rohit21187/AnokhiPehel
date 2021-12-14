/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author rohit
 */
import java.net.*;
import java.lang.*;
import java.util.*;
import java.io.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author rohit
 */
public class MainServer {
    
    public static void main(String[] args){
        
        try{
            ServerSocket ss= new ServerSocket(3001);
            while(true){
                System.out.println("waiting");
                Socket client= ss.accept();
                System.out.println("Client added");
                ClientHandler cl = new ClientHandler(client); 
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
class ClientHandler  implements Runnable{
    
    public static Queue<String> q = new LinkedList<String>();
    Thread t;
    Socket s;
    public ClientHandler(Socket s){
        this.s=s;
        t= new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        
        PrintWriter write=null;
        BufferedReader reader=null;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        try(Connection cn=My_Connection.getconnection();){
            // add a timer to thread which kills it if client takes more than 20 seconds
            //write = new PrintWriter(s.getOutputStream(),true);
            //reader =new BufferedReader(new InputStreamReader(s.getInputStream()));
            System.out.println("val");
            
            ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());System.out.println("val");
            os.flush();
            ObjectInputStream oi = new ObjectInputStream(s.getInputStream());
            PreparedStatement st=null;
            ResultSet rs=null;
            do{
                int val= (int)oi.readInt();
                System.out.println("found");
                if(val==1){
                    try{
                        String username=(String)oi.readUTF();
                        String password=(String)oi.readUTF();
                        
                        String query="select * from users WHERE UserName=? AND Password=?";
                        st=cn.prepareStatement(query);
                        st.setString(1,username);
                        st.setString(2,password);
                        rs=st.executeQuery();
                        if(rs.next()){
                      //show a new form 
                        //JOptionPane.showMessageDialog(null,"correct details","Login sucess",2);
                            System.out.println("correct");
                            os.writeUTF("correct");
                            os.flush();
                        }
                        else{
                            //show error
                            //JOptionPane.showMessageDialog(null,"Invalid Username/Password","Login Error",2);
                            System.out.println("wrong");
                            os.writeUTF("wrong");
                            os.flush();

                        }
                    }
                    catch (Exception e){
                        e.printStackTrace();
                    }
                //invoke ClientClient 
            }
            else if(val==2){
                String adre= (String)oi.readUTF();
                System.out.println(adre+" server");
                q.add(adre);
                //invoke ClientSocket
            }
            //s.close();
        }while(!rs.next());
            s.close();
        }
        catch(Exception ep){
            ep.printStackTrace();
        }
        
        finally{
            //os.flush();
        }
    }
    
}
