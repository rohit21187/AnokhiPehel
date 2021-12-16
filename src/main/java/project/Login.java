/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Login implements Serializable {
    private String username,password;

    public Login(String username, String password) {
        this.username= username;
        this.password= password;
    }
    public void setuser(String s)
    {
        this.username=s;
    }
    public void setpassword(String s)
    {
        this.password=s;
    }
    protected String getUser()
    {
        return this.username;
    }
    protected String getPassword()
    {
        return this.password;
    }
    
}
