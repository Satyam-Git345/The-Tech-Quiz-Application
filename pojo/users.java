/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.pojo;

/**
 *
 * @author Asus
 */
public class users {
    
     String userid;
     String password;
     String usertype;

    public users() {
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }
    

    public users(String userid, String password, String usertype) {
        this.userid = userid;
        this.password = password;
        this.usertype = usertype;
    }

    public String getUserid() {
        return userid;
    }

    public String getPassword() {
        return password;
    }

    public String getUsertype() {
        return usertype;
    }
    
    
}
