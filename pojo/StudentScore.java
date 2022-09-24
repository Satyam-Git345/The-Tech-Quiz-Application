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
public class StudentScore {

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPer(String per) {
        this.per = per;
    }

    public String getLanguage() {
        return language;
    }

    public String getPer() {
        return per;
    }
    
     private String language;
     private String per;
    
}
