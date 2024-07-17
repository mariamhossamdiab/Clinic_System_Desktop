
package Collage_main;
import java.sql.*;
import Class.Patient;
import javax.swing.JOptionPane;
import Function_database.dbconnection;


public class new_reveal_f {
     //submit new patient 
  public void new_reveal_submit(Patient pat) throws SQLException{
      
     
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
PreparedStatement stmt = conn.prepareStatement("insert into patient(name,phone,E-mail,"
        + "Address,symptom,Age,National_id,doctor_id)values(?,?,?,?,?,?,?,?);");      //edit
     Patient patient;
     patient=pat;
     stmt.setString(1,patient.name);
     stmt.setString(2,patient.phone);
     stmt.setString(3,patient.email);
     stmt.setString(4,patient.address);
     stmt.setString(5,patient.symptom);
     stmt.setInt(6,patient.age);
     stmt.setString(7,patient.national_id);
     stmt.setInt(8,patient.doctor_id);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
   }
    //show doctor name 
  
  public String [] show_doctor_name() throws SQLException{
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
        PreparedStatement stm = null;
        ResultSet s = null;
        
        //number of rows
        stm = conn.prepareStatement("select count(*) from doctor ;");  
        s = stm.executeQuery();
        s.next();
        int row = Integer.parseInt(s.getString(1));   
        stm.close();
        
        //get value at name colum 
        PreparedStatement stmt = conn.prepareStatement("select name from doctor ;");
        s = stmt.executeQuery();
        String []all = new String[row];
        int i = 0;
        while (s.next()) {            
            all[i] = s.getString(1);
            i++;
        }
        
        return all;
  }
    
}
