
package Collage_main;
import java.sql.Connection;
import java.sql.SQLException;
import Class.*;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import Function_database.dbconnection;
import java.sql.ResultSet;



public class consultation {
    //public
      Patient p =new Patient();
     
      
      
     ///// show info  ( patient & doctor name & dignosis name )  
    public Patient show_info_patient(int na_id ,Doctor d ,diagnosis di,treatment t) throws SQLException{
    
    p.national_id =String.valueOf(na_id);
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
   
       
     //
      PreparedStatement stmt = conn.prepareStatement("select patient.name,phone,e_mail,address,age,national_id,symptom"
        + "doctor.name ,diagnosis.date ,diagnosis.info_about_illness ,treatment.name,treatment.cost ,patient.patient_id "
        + "from patient inner join doctor on patient.doctor_id = doctor.id"
        + " inner join diagnosis on patient.patient_id = diagnosis.patient_id"
        + "inner join treatment on patient.treat_id = treatment.treat_id"
        + " where patient.national_id='"+ p.national_id + "';");
      ResultSet set = stmt.executeQuery();
      p.name=set.getString(1);
      p.phone=set.getString(2);
      p.email=set.getString(3);
      p.address=set.getString(4);
      p.age=set.getInt(5);
      p.national_id=set.getString(6);
      p.symptom=set.getString(7);
      d.name=set.getString(8);
      di.date=set.getString(9);
      di.info_ill=set.getString(10);
      t.name=set.getString(11);
      t.cost=set.getInt(12);
      p.patient_id=set.getInt(13);
      return p;
     
     }
    
    
     
     //updata patient // class patient 
  public void updata_patient(Patient p_ ) throws SQLException{
      Patient p1 =p_;
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
    
       
      PreparedStatement stmt = conn.prepareStatement("update patient set name=?,phone=?,e_mail=?"
              + ",address=?,age=?,national_id=?,symptom=? where  patient_id'"+ p.patient_id + "';");
     stmt.setString(1,p1.name);
     stmt.setString(3,p1.phone);
     stmt.setString(4,p1.email);
     stmt.setString(2,p1.address);
     stmt.setInt(5,p1.age);
     stmt.setString(6,p1.national_id);
     stmt.setString(7,p1.symptom);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
}    
  
  //delet patient  
  public void delet_patient() throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    
    PreparedStatement stmt = conn.prepareStatement("delet from patient where patien.patient_id="
            + "'"+p.patient_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }

  
}
