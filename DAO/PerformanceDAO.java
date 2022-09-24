/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TechQuizApp.DAO;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.Performance;
import TechQuizApp.pojo.StudentScore;
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
public class PerformanceDAO 
{

    public static ArrayList<String> getAllExamId(String username) throws SQLException {
        String qry = "select userid from Performance where examid=?";
        ArrayList<String> examIdList = new ArrayList<>();
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);
        ps.setString(1, username);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String id = rs.getString(1);
            examIdList.add(id);
        }

        return examIdList;
    }

    public static void addPerformance(Performance P) throws SQLException {
        String qry="insert into Performance values(?,?,?,?,?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);

        ps.setString(1, P.getUserid());

        ps.setString(2, P.getExamid());

        ps.setInt(3, P.getRight());

        ps.setInt(4, P.getWrong());

        ps.setInt(5,P.getUnattempted());

        ps.setInt(6,P.getPer());

        ps.setString(7,P.getLanguage());
        ps.executeUpdate();
  }

    public static ArrayList<Performance> getAllData() throws SQLException {
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ArrayList<Performance> perlist = new ArrayList<>();
        ResultSet rs = st.executeQuery("Select * from Performance");
        while (rs.next()) {
            String userid = rs.getString(1);
            String examid = rs.getString(2);
            int right = rs.getInt(3);
            int wrong = rs.getInt(4);
            int unattempted = rs.getInt(5);
            int per = rs.getInt(6);
            String language = rs.getString(7);
            Performance P = new Performance(userid, examid, right, wrong, unattempted, per, language);
            perlist.add(P);
        }
        return perlist;
    }

    public static ArrayList<String> getallstudentid() throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps;
        ps = conn.prepareStatement("Select distinct userid from Performance");
        ArrayList<String> studentlist = new ArrayList<>();
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String id = rs.getString(1);
            studentlist.add(id);
        }
        return studentlist;
    }

    public static ArrayList <String> getallExamid (String userid) throws SQLException 
    {
        Connection conn=DBConnection.getConnection();
       
        PreparedStatement ps=conn.prepareStatement("select examid from performance where userid=?");
        
        ps.setString(1,userid);  
        ResultSet rs=ps.executeQuery();
        ArrayList <String> examList=new ArrayList<>();
        while(rs.next())
        {
           
            examList.add(rs.getString(1));
        }
        return examList;
        
    }

    public static StudentScore getScore(String studentId, String examId) throws SQLException {
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement("select language,per from Performance where userid=? and examid=?");

        ps.setString(1, studentId);
        ps.setString(2, examId);

        ResultSet rs = ps.executeQuery();

        
        StudentScore obj = new StudentScore();
        while(rs.next()){
        obj.setLanguage(rs.getString(1));
        obj.setPer(rs.getString(2));
        }
        return obj;
    }
}
