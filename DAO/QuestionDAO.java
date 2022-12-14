

package TechQuizApp.DAO;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.Question;
import TechQuizApp.pojo.QuestionStore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class QuestionDAO
{
    public static void addQuestions(QuestionStore ques)throws SQLException
     {
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement("insert into Questions values(?,?,?,?,?,?,?,?,?)");
         ArrayList<Question> questionsList=ques.getAllQuestions();
        for(Question q:questionsList)
        {
            ps.setString(1,q.getExamId());
            ps.setInt(2,q.getQno());
            ps.setString(3,q.getQuestion());
            ps.setString(4,q.getAnswer1());
            ps.setString(5,q.getAnswer2());
            ps.setString(6,q.getAnswer3());
            ps.setString(7,q.getAnswer4());
            ps.setString(8,q.getCorrectAnswer());
            ps.setString(9,q.getLanguage());
            ps.executeUpdate();
        }
     }     
    
    public static ArrayList <Question> getQuestionsByExamId(String examId)throws SQLException
            {
              String qry="select * from questions  where examid=? order by qno";
              ArrayList<Question> questionList=new ArrayList<>();
              Connection conn;
              conn = DBConnection.getConnection();
              PreparedStatement ps=conn.prepareStatement(qry);
              ps.setString(1,examId);
              ResultSet rs=ps.executeQuery();
           
           while(rs.next()){
               int qno=rs.getInt(2);
               String question=rs.getString(3);
               String option1=rs.getString(4);
               String option2=rs.getString(5);
               String option3=rs.getString(6);
               String option4=rs.getString(7);
               String correctAnswer=rs.getString(8);
               String language=rs.getString(9);
               Question obj=new Question(examId,qno,question,option1,option2,option3,option4,correctAnswer,language);
               questionList.add(obj);
               
           }
           return questionList;
        }
    
 }
    

