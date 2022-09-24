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
public class Exam {
    private String ExamId;
    private String  language;
    private int  totalQuestions;

    public Exam(String ExamId, String language, int totalQuestions) {
        this.ExamId = ExamId;
        this.language = language;
        this.totalQuestions = totalQuestions;
    }

    

    public String getExamId() {
        return ExamId;
    }

    public String getLanguage() {
        return language;
    }

    public int getTotalQuestions() {
        return totalQuestions;
    }

    public void setExamId(String ExamId) {
        this.ExamId = ExamId;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setTotalQuestions(int totalQuestions) {
        this.totalQuestions = totalQuestions;
    }
}
