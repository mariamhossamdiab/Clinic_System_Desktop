
package Collage_main;

import Class.*;
import Function_database.dbconnection;
import java.sql.*;
import java.text.ParseException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class doctor_page_fun {
    public Connection conn = null;
    public String Symptom;
    public String tratment ;
    public diagnosis d;
    public DefaultTableModel dm =null;
    PreparedStatement stm;
    public boolean searchstatus ;
    public int []allindex;
    
    //national into id (doctor)
   public int get_doctor_id(int id) throws SQLException{
       dbconnection con = new dbconnection() ; Connection conn = con.conn();
   PreparedStatement stmt = conn.prepareStatement("select id from doctor "
           + "where national_id = '" + id  +"';");
   ResultSet set = stmt.executeQuery();
   
   return (set.getInt(id));
   } 
   
   //delet diag 
    public void delet_diag(int pati_id) throws SQLException{
   dbconnection con = new dbconnection() ; Connection conn = con.conn();
   Patient p =new Patient();
   p.patient_id = pati_id;
   PreparedStatement stmt = conn.prepareStatement("delet from diagnosis "
           + "inner join patient on diagnosis.dia_id = patient.patient_id"
           + "where patient.patient_id='"+p.patient_id+"';");
     stmt.executeUpdate();
    JOptionPane.showMessageDialog(null, "Delete Success");
    
    }
    
    //update diag & treat
    public void update_diag(int pati_id, diagnosis d , treatment t) throws SQLException{
   dbconnection con = new dbconnection() ; Connection conn = con.conn();
   Patient p =new Patient();
   p.patient_id = pati_id;
   PreparedStatement stmt = conn.prepareStatement("update diagnosis set diagnosis.date=? "
           + ",diagnosis.info_about_illness=?, patient.treat_id = ?"
           + "inner join patient on diagnosis.dia_id = patient.patient_id"      //inner
           + "where patient.patient_id='"+p.patient_id+"'");
     stmt.setString(1,d.date);
     stmt.setString(2,d.info_ill);
     stmt.setInt(3, t.treat_id);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Update Successed");
    
    }
    
   // submit diag & treat
    public void submit_dis_and_tratment(int p_id,diagnosis d_,treatment t_) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Patient p=new Patient();
    p.patient_id=p_id;
    PreparedStatement stmt = conn.prepareStatement("insert into diagnosis.date=? "
            + ",diagnosis.info_about_illness=? ,patient.treat_id value(?,?,?) "
            + "inner join patient on diagnosis.dia_id = patient.patient_id"
            + " whrere patient.patient_id='"+ p.patient_id+"';"); 
     stmt.setString(1,d_.date);
     stmt.setString(2,d_.info_ill);
     stmt.setInt(3,t_.treat_id);
     stmt.executeUpdate();
     JOptionPane.showMessageDialog(null, "Insertion Success");
    
    
    }
    
    //show patient info at table auto
    public DefaultTableModel  show_patient_info_at_doctor_in_table() throws SQLException{  
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    PreparedStatement stmt = conn.prepareStatement("select,name,phone,email,address,"
                 + " age,national_id  from  patient ; ");
    ResultSet set = stmt.executeQuery();
            DefaultTableModel dm = new DefaultTableModel();
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("E-mail");
            dm.addColumn("Address");
            dm.addColumn("Age");
            dm.addColumn("National id");
            
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3),
                    set.getString(4),set.getString(5), set.getString(6), set.getString(7)};
                dm.addRow(r);
            }
    
            return dm;
    }
    
    //// search
     public void Search( Object keySearch , String ColName , int doctor_id ) throws SQLException, ParseException{
    DefaultTableModel dm = new DefaultTableModel();
    
        String sql = "SELECT  p.Name, p.Phone, p.Email, p.Address," +
    "p.age, p.National_id, p.Symptom ,t.Name,dio.Date, dio.Info_about_illness  "+
    "FROM patient as p INNER JOIN diagnosis as dio on p.patient_id = dio.patient_id " +
    "INNER JOIN treatment as t on p.Treat_id = t.Treat_id ";
        
    if(ColName.equals("Patient_ID")){
     sql+="WHERE p.Patient_ID ="+keySearch+" and p.Doctor_ID ="+doctor_id;
    }else{
     sql +="WHERE p."+ColName+"  LIKE '%"+keySearch+"%' and p.Doctor_ID = "+doctor_id;
    }
       //table colum
        Object[] colm = {"Name","Phone","Email","Address","Age","National_id"};
        for (int i = 0; i < colm.length; i++) {
            dm.addColumn(colm[i]);
        }
        //table row
            try{            
            stm = conn.prepareStatement(sql);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),
                rs.getString(6) };
                
                //public member (text)
                this.Symptom = rs.getString(7);
                this.tratment = rs.getString(8);  //name
                this.d.date=rs.getString(9);
                this.d.info_ill = rs.getString(10);
  
                dm.addRow(row);
                
            }
                this.dm = dm;
            }catch(SQLException s)
            {JOptionPane.showMessageDialog(null, s);}
        stm.close();
        
    }
    
    //treat name at combo
    public String[] alltreat() throws SQLException{
        ResultSet rs = null;
        stm = conn.prepareStatement("SELECT count(*) FROM `treatment`");  //
        rs = stm.executeQuery();
        rs.next();
        
        int col = Integer.parseInt(rs.getString(1));
        stm.close();
        
        stm = conn.prepareStatement("SELECT Name,treat_id FROM `treatment`");
        rs = stm.executeQuery();
        allindex= new int[col];
        String []all = new String[col];
        int i = 0;
        while (rs.next()) {            
            all[i] = rs.getString(1);
            allindex[i]=rs.getInt(2);
            i++;
        }
        stm.close();
        return all;
    }
             
}
    
    
  
   
