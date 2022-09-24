/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.DAO;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.Exam;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class ExamDAO {
    public static String getExamid()throws SQLException
    {
       Connection conn= DBConnection.getConnection();
       Statement st=conn.createStatement();
       int count;
       ResultSet rs=st.executeQuery("Select count(*) from exam");
       rs.next();
       count=rs.getInt(1);
       String newid="EX-"+(count+1);
       return newid;
    }     
    
    public static boolean addExam(Exam exam)throws SQLException
    {
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement("insert into exam values(?,?,?)");
       ps.setString(1,exam.getExamId());
       ps.setString(2,exam.getLanguage());
       ps.setInt(3,exam.getTotalQuestions());
       int ans=ps.executeUpdate();
       return ans==1;
          
    }
    
    public static ArrayList<String> getExamIdBySubject(String subject)throws SQLException{
       String qry="Select examid from exam where language=?";
       Connection conn=DBConnection.getConnection();
       PreparedStatement ps=conn.prepareStatement(qry);
       ps.setString(1,subject);
       ResultSet rs=ps.executeQuery();
       ArrayList<String> examList=new ArrayList<>();
	while(rs.next()){
               examList.add(rs.getString(1));
           }
      return examList;
    }
    
    public static int getQuestionCountByExam(String examId)throws SQLException{
        String qry="select total_questions from Exam where examid=?";
        Connection conn=DBConnection.getConnection();
          PreparedStatement ps=conn.prepareStatement(qry);
          ps.setString(1,examId);
          ResultSet rs=ps.executeQuery();
	    rs.next();
          int rowCount=rs.getInt(1);
          return rowCount;
        }

     public static boolean isPaperSet(String subject)throws SQLException{
       String qry="Select examid from Exam where language=? ";       
           Connection conn=DBConnection.getConnection();
           PreparedStatement ps=conn.prepareStatement(qry);
           ps.setString(1,subject);
           ResultSet rs=ps.executeQuery();
           return rs.next();
        
      }
       public static ArrayList<String> getExamIdBySubject(String userid,String subject)throws SQLException
        {
         String qry="Select examid from Exam where language=? minus Select examid from Performance where userid=?";
         ArrayList<String> examList=new ArrayList<>();
         Connection conn=DBConnection.getConnection();
         PreparedStatement ps=conn.prepareStatement(qry);
         ps.setString(1,subject);
         ps.setString(2,userid);
         ResultSet rs=ps.executeQuery();
       while(rs.next())
        {
            examList.add(rs.getString(1));
        }
         return examList;        
    }

}
