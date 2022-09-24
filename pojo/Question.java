
package TechQuizApp.pojo;


public class Question {

    @Override
    public String toString() {
        return "Question{" + "examId=" + examId + ", qno=" + qno + ", language=" + language + ", answer1=" + answer1 + ", answer2=" + answer2 + ", answer3=" + answer3 + ", answer4=" + answer4 + ", correctAnswer=" + correctAnswer + ", question=" + question + '}';
    }
    private String examId;
    private int qno;
    private String language;
    private String answer1,answer2,answer3,answer4;
    private String correctAnswer;
    private String question;

    public Question(String examId, int qno, String question, String answer1, String answer2, String answer3, String answer4, String correctAnswer, String language) {
        this.examId = examId;
        this.qno = qno;
        this.language = language;
        this.answer1 = answer1;
        this.answer2 = answer2;
        this.answer3 = answer3;
        this.answer4 = answer4;
        this.correctAnswer = correctAnswer;
        this.question = question;
    }

    public String getExamId() {
        return examId;
    }

    public int getQno() {
        return qno;
    }

    public String getLanguage() {
        return language;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getQuestion() {
        return question;
    }
    

    public void setExamId(String examId) {
        this.examId = examId;
    }

    public void setQno(int qno) {
        this.qno = qno;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public void setAnswer2(String answer2) {
        this.answer2 = answer2;
    }

    public void setAnswer3(String answer3) {
        this.answer3 = answer3;
    }

    public void setAnswer4(String answer4) {
        this.answer4 = answer4;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}
