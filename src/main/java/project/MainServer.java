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
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

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
//create unicon to check whether username is already present in database
    
    
    
class ClientHandler  implements Runnable{
    
    //public static Queue<String> q = new LinkedList<String>();
    Thread t;
    Socket s;
    public ClientHandler(Socket s){
        this.s=s;
        t= new Thread(this);
        t.start();
    }
    private  int LoginVerify(Login lg,Connection cn) throws SQLException{
        PreparedStatement st=null;
        ResultSet rs=null;
        String query="select * from users WHERE UserName=? AND Password=?";
        st=cn.prepareStatement(query);
        st.setString(1,lg.getUser());
        st.setString(2,lg.getPassword());
        rs=st.executeQuery();
        if(rs.next()){
            return 1; //correct detail  
        }
        else{
            return 0; // incorrect detail;
        }
    }
    private int CheckUserName(String username) throws SQLException{
        PreparedStatement ps=null;
        ResultSet rs=null;
        int username_exist=1;
        try(Connection con=My_Connection.getconnection();){
            
            String query="select * from users where UserName=?";
            ps=con.prepareStatement(query);
            ps.setString(1, username);
            rs=ps.executeQuery();
            if(rs.next())
            {
               username_exist=0;
               //JOptionPane.showMessageDialog(null,"This UserName is Already Taken, Choose Another One","UserName Failed",2);
            }
            return username_exist; //returns 1 when not present
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return username_exist;
    }
    private int RegisterUserInDB(Registration std1,Connection cn) throws SQLException{
        String query="INSERT INTO users (`First_Name`, `Last_Name`, `Registration_Number`, `Mobile`, `Gender`, `Image`, `UserName`, `Password`) VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps=null;
        ResultSet rs=null;    
        ps=cn.prepareStatement(query);
        ps.setString(1,std1.getfirstname());
        ps.setString(2,std1.getlastname());
        ps.setString(3,std1.getregnum());
        ps.setString(4,std1.getmobile());
        ps.setString(5,std1.getgender());
        ps.setString(7,std1.getusername());
        ps.setString(8,std1.getpassword());
        ps.setNull(6,java.sql.Types.NULL);
        /*if(jLabel12.getText()!="Image Path")
        {
        InputStream image=new FileInputStream(new File(jLabel12.getText()));
        ps.setBlob(6,image);
        }
        else
        {
        ps.setNull(6,java.sql.Types.NULL);
        }*/
        if(ps.executeUpdate()!=0){
           return 1;
        }
        else{
            return 0;

        } 
    }
    
    @Override
    public void run() {
        
        //PrintWriter write=null;
        //BufferedReader reader=null;
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
                System.out.println("val");
                int val= (int)oi.readInt();
                System.out.println(val);
                if(val==1){
                    try{
                        Login lg =(Login)oi.readObject();
                        int check= LoginVerify(lg,cn);
                        if(check==1){
                            System.out.println("correct");
                            os.writeUTF("correct");
                            os.flush();
                        }
                        else{
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
                //String adre= (String)oi.readUTF();
                System.out.println(" server");
                Registration std= (Registration)oi.readObject();
                System.out.println("read reg obj");
                int cu= CheckUserName(std.getusername());
                if(cu==1){
                    System.out.println("checked user");
                    os.writeInt(1);
                    os.flush();
                    System.out.println("registering");
                    os.writeInt(RegisterUserInDB(std,cn));
                    System.out.println("Registered");
                    os.flush();
                    
                }
                else{
                    os.writeInt(0);
                    os.flush();
                }
            }
            //s.close();
        }while(true);
        }
        catch(Exception ep){
            ep.printStackTrace();
            try {
                s.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        finally{
            //os.flush();
        }
    }
    
}
