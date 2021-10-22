/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.*;

/**
 *
 * @author rohit
 */
public class Main {
    public static void main(String args[])throws SQLException{
        System.out.print("start");
        //My_Connection.getconnection();
        System.out.print("end");
        try{
        PrintWriter write;
        BufferedReader reader;
        Socket s = new Socket("localhost",3001);
        write = new PrintWriter(s.getOutputStream(),true);
        reader =new BufferedReader(new InputStreamReader(s.getInputStream()));
        //write.print("host");
        NewJFrame njf= new NewJFrame(s,write,reader);
        njf.setVisible(true);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
