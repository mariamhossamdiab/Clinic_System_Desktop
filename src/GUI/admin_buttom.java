package GUI;

import Class.*;
import Collage_main.*;
import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Mariam Hossam
 */
public class admin_buttom extends javax.swing.JFrame {

    long doctor_id;
    int treat_id;
    String key_add;
    String what;

    //doctor (update) 
    public admin_buttom(long d_id) {
        initComponents();
        doctor_id = d_id;
        what = "update doctor";
        but_action.setText("update");
    }

    //treatment (update)
    public admin_buttom(int t_id) {
        initComponents();
        treat_id = t_id;
        what = "update treatment";
        info_panal.setVisible(false);
        lab1.setText("Name");
        lab2.setText("Cost");
        but_action.setText("update");

    }

    //add doctor or treat 
    public admin_buttom(String k) {
        initComponents();
        key_add = k;

        if (key_add.equals("doctor")) {                         // add doctor
            but_action.setText("Submit");
            what = "add doctor";
        /*    
        } else if (key_add.equals("patient")) {                        // add patient
            lab1.setText("Symptom");
            lab2.setVisible(false);
            ta2.setVisible(false);
            but_action.setText("Submit");
            what = "add patient";
            */
        } else if (key_add.equals("treatment")) {                   //add treatment
          
            info_panal.setVisible(false);
            lab1.setText("Name");
            lab2.setText("Cost");
            but_action.setText("Submit");
            co_panal.setLocation(10, 10);
            co_panal.setPreferredSize(new Dimension(1100, 490));
           what = "add treat";
        }
    }

    //error
    public admin_buttom() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        info_panal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_tf = new javax.swing.JTextField();
        add_tf = new javax.swing.JTextField();
        ph_tf = new javax.swing.JTextField();
        em_tf = new javax.swing.JTextField();
        na_tf = new javax.swing.JTextField();
        ag_tf = new javax.swing.JTextField();
        salary_tf1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        co_panal = new javax.swing.JPanel();
        lab1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ta1 = new javax.swing.JTextArea();
        lab2 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        ta2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        back_btn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        but_action = new javax.swing.JButton();

        jScrollPane3.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New Doctor");

        jPanel1.setBackground(new java.awt.Color(185, 219, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Address");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Phone");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("E-mail");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("National id");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Age");

        add_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_tfActionPerformed(evt);
            }
        });

        em_tf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                em_tfActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("salary");

        javax.swing.GroupLayout info_panalLayout = new javax.swing.GroupLayout(info_panal);
        info_panal.setLayout(info_panalLayout);
        info_panalLayout.setHorizontalGroup(
            info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ag_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(na_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(em_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ph_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(add_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(info_panalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(salary_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(55, 55, 55))
        );
        info_panalLayout.setVerticalGroup(
            info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(info_panalLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(name_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(add_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ph_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(em_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(na_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ag_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(info_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(salary_tf1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        lab1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab1.setText("Specially");

        ta1.setColumns(20);
        ta1.setRows(5);
        jScrollPane4.setViewportView(ta1);

        lab2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lab2.setText("Studying");

        ta2.setColumns(20);
        ta2.setRows(5);
        jScrollPane5.setViewportView(ta2);

        javax.swing.GroupLayout co_panalLayout = new javax.swing.GroupLayout(co_panal);
        co_panal.setLayout(co_panalLayout);
        co_panalLayout.setHorizontalGroup(
            co_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(co_panalLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(co_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab2)
                    .addComponent(lab1)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        co_panalLayout.setVerticalGroup(
            co_panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(co_panalLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lab1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lab2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );

        exit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 51, 51));
        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        back_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 102, 102));
        back_btn.setText("Back");
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(back_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        but_action.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        but_action.setText("Submit");
        but_action.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 29, 201)));
        but_action.setMaximumSize(new java.awt.Dimension(59, 25));
        but_action.setMinimumSize(new java.awt.Dimension(59, 25));
        but_action.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                but_actionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(but_action, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(but_action, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(info_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addComponent(co_panal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
            .addComponent(jSeparator2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(info_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(co_panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void but_actionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_but_actionActionPerformed
        admin_fun d = new admin_fun();
////////    up
        if (what.equals("update doctor")) {
            Doctor doc = new Doctor();
            doc.name = name_tf.getText();
            doc.address = add_tf.getText();
            doc.phone = ph_tf.getText();
            doc.email = em_tf.getText();
            doc.national_id = na_tf.getText();
            doc.age = Integer.valueOf(ag_tf.getText());
            doc.specially = ta1.getText();
            doc.studying = ta2.getText();
            try {
                d.update_doctor(doc, (int) doctor_id);
            } catch (SQLException ex) {
             Logger.getLogger(admin_buttom.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            
////////////////     up 
        else if (what.equals("update treatment")) {
            treatment t = new treatment();
            t.name = ta1.getText();
            t.cost = Integer.valueOf(ta2.getText());
            try {
                d.update_treat(t, treat_id);
            } catch (SQLException ex) {
         Logger.getLogger(admin_buttom.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
//////////   add
        else if (what.equals("add doctor")) {
             if (!name_tf.getText().equals("")||!add_tf.getText().equals("")||!ph_tf.getText().equals("")
                    ||!em_tf.getText().equals("")||!na_tf.getText().equals("")||!ag_tf.getText().equals("")
                 ||!ta1.getText().equals("")   ){
            Doctor doc = new Doctor();
            doc.name = name_tf.getText();
            doc.address = add_tf.getText();
            doc.phone = ph_tf.getText();
            doc.email = em_tf.getText();
            doc.national_id = na_tf.getText();
            doc.age = Integer.parseInt(ag_tf.getText());
            doc.specially = ta1.getText();
            doc.studying = ta2.getText();
            doc.salary =Integer.parseInt(salary_tf1.getText());
           
              
          try {
                d.add_doctor(doc);
            
          }catch (SQLException ex) {
                Logger.getLogger(admin_buttom.class.getName()).log(Level.SEVERE, null, ex);
          }} else { JOptionPane.showConfirmDialog(this, "Make sure that all information is right!");}
   
        }
        /*
///////// add
        else if (what.equals("add patient")) {
            if (!name_tf.getText().equals("")||!add_tf.getText().equals("")||!ph_tf.getText().equals("")
                    ||!em_tf.getText().equals("")||!na_tf.getText().equals("")||!ag_tf.getText().equals("")
                 ||!ta1.getText().equals("")     ){
            Patient p = new Patient();
            p.name = name_tf.getText();
            p.address = add_tf.getText();
            p.phone = ph_tf.getText();
            p.email = em_tf.getText();
            p.national_id = na_tf.getText();
            p.age = Integer.valueOf(ag_tf.getText());
            p.symptom = ta1.getText();
           
            
            try{
                d.add_patient(p);
            } catch (SQLException ex) {
              Logger.getLogger(admin_buttom.class.getName()).log(Level.SEVERE, null, ex);
        }}else { JOptionPane.showConfirmDialog(this, "Make sure that all information is right!");}
        }
        
        */
        
//////// add
        else if (what.equals("add treat")) {
            if (!ta1.getText().equals("") || !ta2.getText().equals("")) {
                
            
            treatment t = new treatment();
            t.name = ta1.getText();
            t.cost = Integer.valueOf(ta2.getText());
            try{
            
            d.add_treat(t);
            }
            catch (SQLException ex) 
            {
            Logger.getLogger(admin_buttom.class.getName()).log(Level.SEVERE, null, ex);
            }
            }else {JOptionPane.showConfirmDialog(null, "Make sure that all information is right!");}
         
        }
       
        
        
    }//GEN-LAST:event_but_actionActionPerformed
    
    private void em_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_em_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_em_tfActionPerformed

    private void add_tfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_tfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_tfActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        exit ex = new exit();
        try {
            ex.exit();
            this.setVisible(false);
        } catch (InterruptedException ex1) {
            Logger.getLogger(Consoltation_page.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_exitActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        admin d =new admin();
        d.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_back_btnActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin_buttom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_buttom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_buttom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_buttom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_buttom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField add_tf;
    private javax.swing.JTextField ag_tf;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton but_action;
    private javax.swing.JPanel co_panal;
    private javax.swing.JTextField em_tf;
    private javax.swing.JButton exit;
    private javax.swing.JPanel info_panal;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lab1;
    private javax.swing.JLabel lab2;
    private javax.swing.JTextField na_tf;
    private javax.swing.JTextField name_tf;
    private javax.swing.JTextField ph_tf;
    private javax.swing.JTextField salary_tf1;
    private javax.swing.JTextArea ta1;
    private javax.swing.JTextArea ta2;
    // End of variables declaration//GEN-END:variables
}
