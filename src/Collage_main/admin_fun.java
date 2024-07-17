
package Collage_main;
import Class.*;
import java.sql.*;
import javax.swing.JOptionPane;
import Function_database.dbconnection;
import java.text.ParseException;
import javax.swing.table.DefaultTableModel;
public class admin_fun {
    //public member
    
    public Connection conn = null;
    public DefaultTableModel dm =null;
    PreparedStatement stm;
    
    //
    public int doctor_id;
    public int patient_id;
    public int treat_id;
    
    
    ///////////////////////////////////////////////////////////
    
    //search doctor
    public void Search_doctor( Object keySearch , String ColName ) throws SQLException, ParseException{
    DefaultTableModel dm = new DefaultTableModel();
    
    String SQL="select d.name,d.address,d.phone,d.e-mail,d.age,d.specially,d.studying"
              + "d.salary,d.national_id ,d.doctor_id from doctor as d ";
    
    SQL +="where d." + ColName + " like '%"+keySearch+"%';";
    
       //table colum
        Object[] colm = {"Name","Address","Phone","Email","Age","Specially","Studying",
            "Salary","National_id"};
        for (int i = 0; i < colm.length; i++) {
            dm.addColumn(colm[i]);
        }
        //table row
            try{            
            stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),
                rs.getString(6),rs.getString(7),rs.getInt(8),rs.getString(9) };
                //public member 
               this.doctor_id=rs.getInt(10);
               dm.addRow(row);
               }
            //end table model
            this.dm = dm;
            
            }catch(SQLException s)
            {JOptionPane.showMessageDialog(null, s);}
        stm.close();
        
    }
    
    
    //search patient 
    public void Search_patient( Object keySearch , String ColName ) throws SQLException, ParseException{
    DefaultTableModel dm = new DefaultTableModel();
    
    String SQL="select p.Name, p.Phone, p.Email, p.Address," +
    "p.age, p.National_id, p.Symptom ,p.patient_id from patient as p ";  
    SQL +="where p." + ColName + " like '%"+keySearch+"%';";
    
       //table colum
        Object[] colm = {"Name","Address","Phone","Email","Age","National_id","Symptom"};
        for (int i = 0; i < colm.length; i++) {
            dm.addColumn(colm[i]);
        }
        //table row
            try{            
            stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Object[] row = {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getInt(5),
                rs.getString(6),rs.getString(7) };
                //public member 
               this.patient_id=rs.getInt(7);
               
               dm.addRow(row);
               }
            //end table model
            this.dm = dm;
            
            }catch(SQLException s)
            {JOptionPane.showMessageDialog(null, s);}
        stm.close();
        
    }
    
    //search treatment
    public void Search_tratment( Object keySearch , String ColName ) throws SQLException, ParseException{
    DefaultTableModel dm = new DefaultTableModel();
    
    String SQL="select t.name, t.cost, t.treat_id from treatment as t ";  
    SQL +="where t." + ColName + " like '%"+keySearch+"%';";
    
       //table colum
        Object[] colm = {"Name","Cost"};
        for (int i = 0; i < colm.length; i++) {
            dm.addColumn(colm[i]);
        }
        //table row
            try{            
            stm = conn.prepareStatement(SQL);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                Object[] row = {rs.getString(1),rs.getInt(2) };
                
                //public member 
               this.treat_id=rs.getInt(3);
               
               dm.addRow(row);
               }
            //end table model
            this.dm = dm;
            
            }catch(SQLException s)
            {JOptionPane.showMessageDialog(null, s);}
        stm.close();
        
    }
    
    
    ////////////////////////////////////////////////////////////////

   ///update doctor  // class , doc id 
    public void update_doctor( Doctor doct , int select_doc_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc = doct;
    doc.doctor_id = select_doc_id;
    PreparedStatement stmt = conn.prepareStatement("update doctor set name=?,address=?,phone=?"
            + ",e-mail=?,age=?,specially=?,studying=?,salary=?,national_id=?,salary=?"
            + "where doctor_id='"+doc.doctor_id + "';");  
     stmt.setString(1,doc.name);
     stmt.setString (3,doc.phone);
     stmt.setString(4,doc.email);
     stmt.setString(2,doc.address);
     stmt.setInt(5,doc.age);
     stmt.setString(6,doc.specially);
     stmt.setString(7,doc.studying);
     stmt.setString(8,doc.national_id);
     stmt.setInt(9,doc.salary);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"update Successed");
    
    }
    
    
    ///update treat
    public void update_treat(treatment t_, int select_treat_id) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    treatment t =t_;
    t.treat_id=select_treat_id;
    PreparedStatement stmt = conn.prepareStatement("Update treatment set name=?,cost=?"
            + "where treat_id='"+t.treat_id + "';");  
     stmt.setString(1,t.name);
     stmt.setInt (2,t.cost);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Update Successed");
    
    
    
    }
    
    ///////////////////////////////////////////////////
    
    
    
    //insert doctor //class
    public void add_doctor( Doctor doct) throws SQLException{
    int x =JOptionPane.showConfirmDialog(null,"are you want to add");
    if(x == 0){
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc=doct;
    PreparedStatement stmt = conn.prepareStatement("INSERT INTO "
    + "`doctor`(`Name`, `Address`, `Phone`, `E-mail`, `Age`, `Specialty`, `Studying`,`salary`, `national_id`)"
    + "VALUES (?,?,?,?,?,?,?,?,?);");  
     stmt.setString(1,doc.name);
     stmt.setString(2,doc.address);
     stmt.setString(3,doc.phone);
     stmt.setString(4,doc.email);
     stmt.setInt(5,doc.age);
     stmt.setString(6,doc.specially);
     stmt.setString(7,doc.studying);
     stmt.setInt(8,doc.salary);
     stmt.setString(9,doc.national_id);
     stmt.executeUpdate();
     JOptionPane.showMessageDialog(null, "Submit Successed");
     }
    
    }
    
    
    
    //insert treatment / class 
     public void add_treat( treatment t_ ) throws SQLException{
      dbconnection con = new dbconnection() ; Connection conn = con.conn();
      treatment t =t_;
      PreparedStatement stmt = conn.prepareStatement("insert into treatment.name ,treatment.cost"
              + "from treatment value(?,?);");
      stmt.setString(1,t.name);
      stmt.setInt(2,t.cost);
      JOptionPane.showMessageDialog(null, "Submit Success");

     
     }
     
   /*  
     //insert patient
     public void add_patient( Patient p_) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Patient p=p_;
    PreparedStatement stmt = conn.prepareStatement("inset into  patient.name, patient.address"
            + ",patient.phone ,patient.e-mail ,patient.age ,patient.symptom"
            + ",patient.national_id"
            + "value (?,?,?,?,?,?,?,?,?);");  
     stmt.setString(1,p.name);
      stmt.setString(2,p.address);
     stmt.setString(3,p.phone);
     stmt.setString(4,p.email);
     stmt.setInt(5,p.age);
     stmt.setString(6,p.symptom);
    stmt.setString(9,p.national_id);
     stmt.executeUpdate();
      JOptionPane.showConfirmDialog(null,"Submit Successed");
    
    }
     */
     ////////////////////////////////////////////////////////
     
      //delet patient
     public void delet_patient(  int select_pat_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Patient p=new Patient();
    p.patient_id=select_pat_id;
    PreparedStatement stmt = conn.prepareStatement("delet from patient where patient_id="
            + "'"+ p.patient_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }
     
     //delet traetment
     public void delet_treat(  int select_tre_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    treatment t =new treatment();
    t.treat_id=select_tre_id;
    PreparedStatement stmt = conn.prepareStatement("delet from treatment where treat_id="
            + "'"+t.treat_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }
   
     //delet doctor /  doc id
     public void delet_doctor(  int select_doc_id ) throws SQLException{
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    Doctor doc=new Doctor();
    doc.doctor_id=select_doc_id;
    PreparedStatement stmt = conn.prepareStatement("delet from doctor where doctor_id="
            + "'"+doc.doctor_id + "';");  
        stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Delete Success");
    }
     
    
    
}
