
package TechQuizApp.DAO;

import TechQuizApp.dbutil.DBConnection;
import TechQuizApp.pojo.UserPojo;
import TechQuizApp.pojo.users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserDAO {
   public static boolean validateUser(UserPojo user)throws SQLException
    {
        Connection conn=DBConnection.getConnection();
        String qry="Select * from users where userid=? and password=? and usertype=?";
        PreparedStatement ps=conn.prepareStatement(qry);
        ps.setString(1,user.getUserId());
        ps.setString(2,user.getPassword());
        ps.setString(3, user.getUserType());
        ResultSet rs=ps.executeQuery();
        return rs.next();
        
    }
  
   public static boolean adduser(users u) throws SQLException {
        String qry="insert into users values(?,?,?)";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);

        ps.setString(1,u.getUserid());
        ps.setString(2,u.getPassword());
        ps.setString(3,u.getUsertype());
        int count= ps.executeUpdate();
        if(count==1)
        {
           return true;   
        }
        else
           return false;
        
   }
        
    public static boolean changePassward(users u) throws SQLException {
         
        String qry=" update users  set password=?  where userid=? and usertype=?";
        Connection conn = DBConnection.getConnection();
        PreparedStatement ps = conn.prepareStatement(qry);

       
        ps.setString(1,u.getPassword());
        ps.setString(2,u.getUserid());
        ps.setString(3,u.getUsertype());
        int count=  ps.executeUpdate();
        
        if(count==1)
        {
           return true;   
        }
        else
           return false;
        
   }
}






