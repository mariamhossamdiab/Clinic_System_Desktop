
package Function_database;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Login_function {
 
    
    public  dbconnection connector = null; 
    public  Statement stm = null;
    public  ResultSet rs = null;

    
    public boolean login_doctor(String ID , String pass_word) throws SQLException
    {
        if(pass_word.equals("123")){
            String sql = "SELECT * FROM doctor WHERE doctor.National_id='"+ ID + "'";
            rs = stm.executeQuery(sql);
            if(rs.next()){return true;}
            else{return false;}
        }else{return false;}
    }
    
    
    public  boolean login_con(String ID) throws SQLException
    {            
        
        Connection conn = connector.conn();
        stm = conn.createStatement();
        String sql = "SELECT * FROM patient WHERE patient.National_id='"+ ID + "'";
        rs = stm.executeQuery(sql);
        if(rs.next())
            return true;
        else
            return false;
    }
    
    
    public  boolean login_admin(String user ,String pass ) throws SQLException
    {            
        return (user.equals("admin")&&pass.equals("123"));
    }

    
    
}
