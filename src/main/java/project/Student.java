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
public class Student implements Serializable {
    private String name,mobile,address,school,cls;
    private String regno;
    Student(String name, String mobile,String Add,String sch,String cls){
        this.name=name;
        this.mobile=mobile;
        this.address=Add;
        this.school=sch;
        this.cls=cls;
    }
    Student(String regno,String name, String mobile,String Add,String sch,String cls){
        this.name=name;
        this.mobile=mobile;
        this.address=Add;
        this.school=sch;
        this.cls=cls;
        this.regno=regno;
    }

    Student() { //To change body of generated methods, choose Tools | Templates.
    }
   protected void setName(String name)
   {
       this.name=name;
   }
   protected void setMobile(String mobile)
   {
       this.mobile=mobile;
   }
   protected void setAddress(String address)
   {
       this.address=address;
   }
   protected void setRegNo(String no){
       this.regno=no;
   }
   protected void setClass(String cls){
       this.cls=cls;
   }
   public String setAddress()
   {
      return this.address;
   }
   public String setSchool()
   {
      return this.school;
   }
   public String getName(){
       return this.name;
   }
   public String getMobile(){
       return this.mobile;
   }
   public String getAdd(){
       return this.address;
   }
   public String getSchool(){
       return this.school;
   }
   public String getCls(){
       return this.cls;
   }
   protected String getRegNo(){
       return this.regno;
   } 
}
