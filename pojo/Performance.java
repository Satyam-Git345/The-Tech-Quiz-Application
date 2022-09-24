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
public class Performance {
    
    private String userid;
    private String examid;
    private int  right;
    private int  wrong;
    private int  unattempted;
    private int per;
    private String language;

    public String getUserid() {
        return userid;
    }

    public String getExamid() {
        return examid;
    }

    public int getRight() {
        return right;
    }

    public int getWrong() {
        return wrong;
    }

    public int getUnattempted() {
        return unattempted;
    }

    public int getPer() {
        return per;
    }

    public String getLanguage() {
        return language;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public void setExamid(String examid) {
        this.examid = examid;
    }

    public void setRight(int right) {
        this.right = right;
    }

    public void setWrong(int wrong) {
        this.wrong = wrong;
    }

    public void setUnattempted(int unattempted) {
        this.unattempted = unattempted;
    }

    public void setPer(int per) {
        this.per = per;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Performance(String userid, String examid, int right, int wrong, int unattempted, int per, String language) {
        this.userid = userid;
        this.examid = examid;
        this.right = right;
        this.wrong = wrong;
        this.unattempted = unattempted;
        this.per = per;
        this.language = language;
    }
}
