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
public class Registration implements Serializable  {
    private String first_name,last_name,password,gender,username, registration_number,mobile;
    private String year;
    Registration(){
        
    }
    Registration(String first_name,String last_name,String r_num,String mobile,String year, String gender){
        this.first_name=first_name;
        this.last_name=last_name;
        this.registration_number=r_num;
        this.mobile=mobile;
        this.year=year;
        this.gender=gender;
        this.password="Dont be oversmart";
    }
    public void setfirstname(String s)
    {
        this.first_name=s;
    }
    public void setlastname(String s)
    {
        this.last_name=s;
    }
    public void setpassword(String s)
    {
        this.password=s;
    }
    public void setgender(String s)
    {
        this.gender=s;
    }
    public void setmobile(String s)
    {
        this.mobile=s;
    }
    public void setusername(String s)
    {
        this.username=s;
    }
    public void setregnum(String rn)
    {
        this.registration_number=rn;
    }
    public void setyear(String year)
    {
        this.year=year;
    }
    public String getfirstname()
    {
        return first_name;
    }
    public String getlastname()
    {
        return last_name;}
    
    public String getpassword()
    {
        return password;
    }
    public String getgender()
    {
        return gender;
    }
    public String getusername()
    {
       return username;
    }
    public String getregnum()
    {
        return registration_number;
    }
    public String getyear()
    {
        return year;
    }
     public String getmobile()
     {
         return mobile;
     }
    
}
