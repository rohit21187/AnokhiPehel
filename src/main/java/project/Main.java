/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
import java.net.Socket;
import java.sql.*;

/**
 *
 * @author rohit
 */
public class Main {
    public static void main(String args[])throws SQLException{
        try{
        Socket s = new Socket("localhost",3001);
        //write.print("host");
        System.out.println("before main");
        ObjectInputStream oi = new ObjectInputStream(s.getInputStream());
        ObjectOutputStream os = new ObjectOutputStream(s.getOutputStream());
        //System.out.println("in main");
        NewJFrame njf= new NewJFrame(s,oi,os);
        System.out.println("in main");
        njf.setVisible(true);
        
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
