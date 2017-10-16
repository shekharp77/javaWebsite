
package com;

import java.util.List;


public class ProfileBean {
    private static String username,fullname,email,gender,address="";
    static private int age=0;
    static List li;
    // Getter Methods
    public String getUsername(){
        return username;
    }
    public String getFullname(){
        System.out.println(fullname+"=========");
        return fullname;
    }
    public String getEmail(){
        return email;
    }
    public String getGender(){
        return gender;
    }
    public String getAddress(){
        return address;
    }
    public int getAge(){
        return age;
    }
    public List getList(){
        return li;
    }
    
    // Setter Methods
    public void setUsername(String username){
        ProfileBean.username= username;
    }
    public void setFullname(String fullname){
        System.out.println(fullname+"777777777");
        ProfileBean.fullname= fullname;
    }
    public void setEmail(String email){
        ProfileBean.email= email;
    }
    public void setGender(String gender){
        ProfileBean.gender= gender;
    }
    public void setAddress(String address){
        ProfileBean.address= address;
    }
    public void setAge(int age){
        ProfileBean.age= age;
    }
    public void setList(List li){
        ProfileBean.li= li;
    }
}
