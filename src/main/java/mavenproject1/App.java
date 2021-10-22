/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mavenproject1;

import java.util.Properties;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author hp
 */
public class App {
    public static void main(String args[])
    {
//        System.out.println("preparing");
//        String message="Hello , dear this is message for security check";
//        String subject="CodesArea : Confirmation";
//        String to="minakshi.20190032@mnnit.ac.in";
//        String from="meenakshiparihar789@gmail.com";
       java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
       //sendEmail(message,subject,to,from);
        
    }
    private static void sendEmail(String message,String subject,String to ,String from)
    {
       String host="smtp.gmail.com";// gmail host
       // get the system property 
       Properties properties=System.getProperties();
       System.out.println("properties "+properties);
       
       properties.put("mail.smtp.host", host);
       properties.put("mail.smtp.port", "465");
       properties.put("mail.smtp.ssl.enable", "true");
       properties.put("mail.smtp.auth", "true");
       
       Session session=Session.getInstance(properties, new Authenticator()
               
       {
           @Override
           protected PasswordAuthentication getPasswordAuthentication()
           {
               return new PasswordAuthentication("meenakshiparihar789@gmail.com","Chilllite789");
           }
       }
       );
       session.setDebug(true);
       MimeMessage mime=new MimeMessage(session);
       
        try {
            mime.setFrom(from);
            
            mime.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mime.setSubject(subject);
            mime.setText(message);
            Transport.send(mime);
            
            System.out.println("send successfully");
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
