/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author hp
 */
public class Login {
    private String username,password;
    public void setuser(String s)
    {
        this.username=s;
    }
    public void setpassword(String s)
    {
        this.password=s;
    }
    public String getuser()
    {
        return this.username;
    }
    public String getpassword()
    {
        return this.password;
    }
    
}
