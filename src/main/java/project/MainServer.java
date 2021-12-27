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
import java.sql.Statement;
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
    public static ArrayList<ClientHandler> clienthandler=new ArrayList<>();
    private Vector<String> Reg_num=new Vector<>();
    //public static Queue<String> q = new LinkedList<String>();
    private Thread t;
    private Socket s;
    private int VerificationTimes=0,loginVerified=0,cls;
    private boolean verified=false;
    private Registration std;
    private String otp;
    private String ClientUsername,username;
    private ObjectOutputStream os;
    private ObjectInputStream oi;
    
    public ClientHandler(Socket s){
        try
        {
        this.s=s;
        
        this.os=new ObjectOutputStream(s.getOutputStream());
        this.oi=new ObjectInputStream(s.getInputStream());
        //this.ClientUsername=oi.readUTF();
        clienthandler.add(this);
        t= new Thread(this);
        t.start();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
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
        try{
        String query="INSERT INTO users (`First_Name`, `Last_Name`, `Registration_Number`, `Mobile`, `Gender`, `Image`, `UserName`, `Password`,`year`) VALUES (?,?,?,?,?,?,?,?,?)";
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
        ps.setString(9,std1.getyear());
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
        catch(Exception e){
            return 0;
        }
    }
    private void OTPSetter(){
         Random rnd = new Random();
        int number = rnd.nextInt(999999);
        this.otp=String.format("%06d", number);
        System.out.println(this.otp);
    }
    private int OTPChecker(String s) {
        if(s.equals(this.otp)){
            return 1;
        }
        return 0;
    }
    private int RegisterStudentInDB(Student std1, Connection cn) throws SQLException {
        try{
        String query="INSERT INTO StudentDetail (`RegNo`,`Name`, `Mobile`, `Address`, `School`,`Class`) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps=null;
        ResultSet rs=null;    
        ps=cn.prepareStatement(query);
        ps.setString(1,CreateRegNo(cn,std1.getCls()));
        ps.setString(2,std1.getName());
        ps.setString(3,std1.getMobile());
        ps.setString(4,std1.getAdd());
        ps.setString(5,std1.getSchool());
        ps.setString(6,std1.getCls());
            System.out.println("Statemend prepared");

            if(ps.executeUpdate()!=0){
               return 1;
            }
            else{
                return 0;

            }
        }
        catch(Exception e){
            return 0;
        }
    }
    private String CreateRegNo(Connection cn,String cls)throws SQLException {
        String query="SELECT COUNT(*) FROM StudentDetail WHERE Class = "+cls;
        PreparedStatement ps=null;
        ResultSet rs=null;    
        ps=cn.prepareStatement(query);
        rs = ps.executeQuery(query);
      //Retrieving the result
        rs.next();
        int count = rs.getInt(1); 
        count++;
        String ans=cls+count;
        return ans;
    }
    private Vector<Student> StudentsInClass(Connection cn) throws SQLException {
        Vector<Student> Stud = new Vector<Student>();
      
        String query="SELECT * FROM StudentDetail WHERE Class = "+this.cls;
        PreparedStatement ps=null;
        ResultSet rs=null;    
        ps=cn.prepareStatement(query);
        rs = ps.executeQuery(query);
        while(rs.next()){
            Student s= new Student(rs.getString("RegNo"),rs.getString("Name"),rs.getString("Mobile"),rs.getString("Address"),rs.getString("School"),rs.getString("Class"));
            Stud.add(s);
        }
        return Stud;
    }
    
    private String getEmail(String first_name,Connection cn)throws SQLException
    {
        String query="select UserName where First_Name="+first_name;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps=cn.prepareStatement(query);
        rs = ps.executeQuery(query);
        rs.next();
        return rs.getString(1);
    }
    private String getRegistrationNumber(String username,Connection cn1)throws SQLException
    {      
                String query="select Registration_Number from users where UserName="+username;
                PreparedStatement ps=null;
                ResultSet rs=null;
                    ps=cn1.prepareStatement(query);
                    rs = ps.executeQuery(query);
                    rs.next();
               return rs.getString(1);
           
    }
    private int tableExist(String tableName,Connection cn)throws SQLException 
    {
        String query="select * from "+tableName;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps=cn.prepareStatement(query);
        rs=ps.executeQuery();
        if(rs.next())    
        {
           return 1; 
        }
        return 0;
        
    }
    private void insertIntoTable(String Table_Name,String from,String to,Connection cn1,String messagefromclient)throws SQLException 
    {                   String query="insert into "+Table_Name+" values(?,?,?)";
                        PreparedStatement st1=null;
                        st1=cn1.prepareStatement(query);
                        st1.setString(1,to);
                        st1.setString(2,from);
                        st1.setString(3,messagefromclient);
                          int a=st1.executeUpdate();
                          System.out.println(a+" row affected");
        
    }
    private void createTable(String Table_Name,Connection cn1)throws SQLException 
    {
        String query="create table "+Table_Name+"(To VARCHAR(255) not null,From VARCHAR(255) not null ,Message VARCHAR(8000) not null)";
        PreparedStatement st1=null;
         st1=cn1.prepareStatement(query);
         st1.executeUpdate();
        
    }
    private Vector<String> fetchUsername(Connection cn)throws SQLException 
    {   Vector<String> list=new Vector<>();
        PreparedStatement ps=null;
        ResultSet rs=null;
        String query="select First_Name from users";
        ps=cn.prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {
            list.add(rs.getString(1));
        }
        return list;
        
    }
   
    private Registration ProfileDetails(Connection cn) throws SQLException {
        System.out.println("in Profile details");
        Registration user = null;
        PreparedStatement ps=null;
        ResultSet rs=null;  
        String query="select * from users WHERE UserName=?";
        ps=cn.prepareStatement(query);
        ps.setString(1, this.ClientUsername);  
        rs = ps.executeQuery();
        while(rs.next()){
            user= new Registration(rs.getString("First_Name"),rs.getString("Last_Name"),rs.getString("Registration_Number"),rs.getString("Mobile"),rs.getString("Year"),rs.getString("Gender"));
            //String first_name,String last_name,String r_num,String mobile,int year, String gender)
            return user;
        }
        System.out.println("out  Profile details");
        return user;

    }
    private void messageStoreInDB(Connection cn1,String messagefromclient) throws SQLException
    {
        for(ClientHandler clienthandler1:clienthandler)
                 {
                      if(!clienthandler1.ClientUsername.equals(this.ClientUsername))
                     {
                        
                      String Table_Name=getTableName(this.ClientUsername,clienthandler1.ClientUsername);
                     
                      
                      if(tableExist(Table_Name,cn1)==1)
                      {
                         insertIntoTable(Table_Name,this.ClientUsername,clienthandler1.ClientUsername,cn1,messagefromclient);
                      }
                      else
                      {       createTable(Table_Name,cn1);
                      insertIntoTable(Table_Name,this.ClientUsername,clienthandler1.ClientUsername,cn1,messagefromclient);
                      }
                             
                      }
                       }     
                     
    }
    private void resetPassword(String pass,Connection cn) throws SQLException
    {
        String query="update users set password=? where UserName=?";
        PreparedStatement ps=null;
        ps=cn.prepareStatement(query);
        ps.setString(1,pass);
        ps.setString(2,this.ClientUsername);
        ps.executeUpdate();
        
    }
    

    @Override
    public void run() {
        String messagefromclient;
        Connection cn1=null;
        try(Connection cn=My_Connection.getconnection();){
            // add a timer to thread which kills it if client takes more than 20 seconds
            //write = new PrintWriter(s.getOutputStream(),true);
            //reader =new BufferedReader(new InputStreamReader(s.getInputStream()));
    
            //System.out.println("val");
            System.out.println("val");
            os.flush();
            PreparedStatement st=null,st1=null;
            ResultSet rs=null,rs1=null;
            cn1=My_Connection2.getconnection();
            
            
            do{
                System.out.print("val: ");
                int val= (int)oi.readInt();
                System.out.println(val);
                if(val==1){ //check login
                    try{
                        Login lg =(Login)oi.readObject();
                        int check= LoginVerify(lg,cn);
                        if(check==1){
                            System.out.println("correct");
                            os.writeUTF("correct");os.flush();
                            this.verified=true;
                            this.ClientUsername=lg.getUser();//set ClientUsername here using get methord
                            Registration reg=(Registration) this.ProfileDetails(cn);
                            System.out.println(reg.getfirstname());
                            this.username=(String) reg.getfirstname();
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
            }
            else if(val==2){ //register user in  db
                this.std = (Registration)oi.readObject(); //reading user details//System.out.println("read reg obj");
                int cu= CheckUserName(this.std.getusername());
                if(cu==1){//System.out.println("checked user");
                    os.writeInt(1);
                    os.flush();//System.out.println("registering"); 
                    this.VerificationTimes=3;
                    OTPSetter(); //sets the otp
                    new Email_Verify(this.std.getusername(),this.otp);//email sent
                }
                else{
                    os.writeInt(0);
                    os.flush();
                }
            }
            else if(val==3){ //verify emial otp
                this.VerificationTimes--;
                if(this.VerificationTimes>0){
                    String s=oi.readUTF();
                    if(OTPChecker(s)==1){
                        os.writeInt(RegisterUserInDB(this.std,cn));//System.out.println("Registered");
                        os.flush();
                    }
                    else{
                        os.writeInt(2);
                        os.flush();
                    }
                }
                else{
                    os.writeInt(-1); //no more chances left
                    os.flush();
                }
                
            }
            else if(val==4){
                // chatting started
                try{
                    
                    messagefromclient=(String)oi.readUTF();
                    broadcastmessage(messagefromclient,this.oi,this.os); 
                    //messageStoreInDB(cn1,messagefromclient);
                    
                }
                 
                catch(IOException e){
                    e.printStackTrace();
                    break;
                }
            }
            else if(val==5){// insert a new student in db
                if(this.verified==true){
                    os.writeInt(1);os.flush();
                    Student student = (Student)oi.readObject();
                    System.out.println("Read object");
                    os.writeInt(RegisterStudentInDB(student,cn));
                    os.flush();
                }
                else{
                    os.writeInt(0);
                }
                
            }
            else if(val==6){//to fetch details of a class
                this.cls=(int)oi.readInt();
                if(this.verified==true){
                    os.writeInt(1);
                    os.writeObject(StudentsInClass(cn));
                    os.flush();
                    System.out.println("out of 6");
                }
                else{
                    os.writeInt(0);
                }
                
            }
            else if(val ==9){//fetch profile details
                if(this.verified==true){
                    os.writeInt(1);
                    System.out.println("verified");
                    os.writeObject(ProfileDetails(cn));
                    os.flush();
                }
                else{
                    os.writeInt(0);
                }
            }
            else if(val ==10){//logout
                if(this.verified==true){
                    os.writeInt(1);
                    System.out.println("verified");
                    os.flush();
                    break;
                }
                else{
                    os.writeInt(0);
                }
            }
            else if(val==7)
            {
                os.writeObject(fetchUsername(cn));
                os.flush();
                System.out.println("wrote");
      
            }
            else if(val==8)
            {
                String senderUsername=(String)oi.readUTF();
                String mail=getEmail(senderUsername,cn);
                String Table_Name=getTableName(this.ClientUsername,mail);
                Vector<String> message=getMessages(Table_Name,cn1,cn);
                os.writeObject(message);
                
            }
            else if(val==12)
            {
                this.ClientUsername=(String) oi.readUTF();
                int i=CheckUserName(this.ClientUsername);
                if(i==0)
                {
                   os.writeInt(1);
                   os.flush();
                    this.VerificationTimes=3;
                    OTPSetter(); //sets the otp
                    new Email_Verify(this.ClientUsername,this.otp);//email sent
                }
                else{
                    os.writeInt(0);
                    os.flush();
                }
                
                
            }
            else if(val==13)
            {
                String password=(String) oi.readUTF();
                resetPassword(password,cn);
                
            }
                else if(val==14){ //verify emial otp
                this.VerificationTimes--;
                if(this.VerificationTimes>0){
                    String s=oi.readUTF();
                    if(OTPChecker(s)==1){
                        os.writeInt(1);//System.out.println("Registered");
                        os.flush();
                    }
                    else{
                        os.writeInt(2);
                        os.flush();
                    }
                }
                else{
                    os.writeInt(-1); //no more chances left
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
            this.ClientUsername="";
            this.verified=false;
            try {
                this.s.close();
            } catch (IOException ex) {
                Logger.getLogger(ClientHandler.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private String getName(String from,Connection cn)throws SQLException  
    {
        String query="select First_Name from users where UserName="+from;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps=cn.prepareStatement(query);
        rs=ps.executeQuery();
        rs.next();
        return rs.getString(1);
    }
    private Vector<String> getMessages(String Table_Name,Connection cn1,Connection cn) throws SQLException 
    {Vector<String> message=new Vector<>();
        String query="select From,Message from "+Table_Name;
        PreparedStatement ps=null;
        ResultSet rs=null;
        ps=cn1.prepareStatement(query);
        rs=ps.executeQuery();
        while(rs.next())
        {   
           String from=rs.getString(1),msg=rs.getString(2);
           if(from==this.ClientUsername)
           {
               message.add("Me :"+msg);
           }
           else
           {
               message.add(getName(from,cn)+" :"+msg);
           }
        }
        return message;
    }
    private String getTableName(String r1,String r2)
    {
        if(r1.compareTo(r2)<0)
        {
            return r1+"_"+r2;
        }
        return r2+"_"+r1;
        
       
    }
    private void broadcastmessage(String messagetosend,ObjectInputStream oi,ObjectOutputStream os){
        for(ClientHandler clienthandler1:clienthandler)
        {
            try
            {
                if(!clienthandler1.ClientUsername.equals(this.ClientUsername))
                {//String send=this.username+": "+messagetosend;
                System.out.println(this.username);
                    
                    clienthandler1.os.writeUTF(this.username+":"+messagetosend);
                    clienthandler1.os.flush();
                }
            }catch(Exception e)
            {
                e.printStackTrace();
            }
        }

    }    
  
}
