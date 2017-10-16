
package com;

import java.util.List;


public class LoginBean {
    ProfileDow pd=new ProfileDow();
    private static List li;
    private static String username,password,status;
    // Getter Methods
    public String getUsernme(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getStatus(){
        return status;
    }
    public List getList(){
        return li;
    }
    // Setter methods
    public void setUsername(String username){
        LoginBean.username= username;
    }
    public void setPassord(String password){
        LoginBean.password= password;
    }
    public void setStatus(String status){
        LoginBean.status= status;
    }
    public void setList(List li){
        LoginBean.li= li;
    }
}
