/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lasercodes.mavenproject1;
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
