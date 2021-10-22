/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
<<<<<<< HEAD:src/main/java/com/lasercodes/mavenproject1/My_Connection.java
package com.lasercodes.mavenproject1;
import mavenproject1.*;
=======
package project;
>>>>>>> 8a93db0ff776969f65e9f6051b0035524309796e:src/main/java/project/My_Connection.java
import java.sql.*;
/**
 *
 * @author hp
 */
public class My_Connection {
    
    public static Connection getconnection() throws SQLException
    {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/users_db","root","");
    }
    
    
}
