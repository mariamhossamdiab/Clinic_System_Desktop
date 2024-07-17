package GUI;

import Collage_main.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class admin extends javax.swing.JFrame {

    public admin() {
        initComponents();
        String[] col;
        DefaultComboBoxModel com;
        col = new String[]{"Name", "Address", "Phone", "Email", "Age", "Specially", "Studying", "Salary", "National_id"};
        com = new DefaultComboBoxModel(col);
        cobm_select_item.setModel(com);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        person_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        cobm_select_item = new javax.swing.JComboBox<>();
        search_tf = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        Btn_add = new javax.swing.JButton();
        Btn_update = new javax.swing.JButton();
        Btn_delete = new javax.swing.JButton();
        Btnexit = new javax.swing.JButton();
        person_select = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        search_btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(185, 219, 237));

        person_table.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        person_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ".", ".", ".", ".", ".", "."
            }
        ));
        jScrollPane1.setViewportView(person_table);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Search :");

        cobm_select_item.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        search_tf.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        Btn_add.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_add.setText("Add");
        Btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_addActionPerformed(evt);
            }
        });

        Btn_update.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_update.setText("Update");
        Btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_updateActionPerformed(evt);
            }
        });

        Btn_delete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btn_delete.setText("Delete");
        Btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_deleteActionPerformed(evt);
            }
        });

        Btnexit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Btnexit.setText("Exit");
        Btnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnexitActionPerformed(evt);
            }
        });

        person_select.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        person_select.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "patient", "treatment" }));
        person_select.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                person_selectItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Select :");

        search_btn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        search_btn.setText("search");
        search_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(Btn_add)
                .addGap(241, 241, 241)
                .addComponent(Btn_update)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_delete)
                .addGap(190, 190, 190)
                .addComponent(Btnexit)
                .addGap(116, 116, 116))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(person_select, 0, 184, Short.MAX_VALUE)
                            .addComponent(cobm_select_item, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(search_btn))))
                    .addComponent(search_tf))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(person_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cobm_select_item, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addComponent(search_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(search_btn)))
                .addGap(60, 60, 60)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnexit)
                    .addComponent(Btn_delete)
                    .addComponent(Btn_update)
                    .addComponent(Btn_add))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_addActionPerformed
        Object person = person_select.getSelectedItem();

        if (person.equals("Doctor")) {
            admin_buttom d = new admin_buttom("doctor");
            d.setVisible(true);
            this.setVisible(false);
        } else if (person.equals("patient")) {
            
            JOptionPane.showConfirmDialog(this, "This option is not available!");
            
        } else if (person.equals("treatment")) {
            admin_buttom d = new admin_buttom("treatment");
            d.setVisible(true);
            this.setVisible(false);
        }


    }//GEN-LAST:event_Btn_addActionPerformed

    private void Btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_deleteActionPerformed
        admin_fun d = new admin_fun();
        Object person = person_select.getSelectedItem();   //combo person 
        int row_num = person_table.getSelectedRow();  //row (which one)?
        if (row_num != -1) {
            if (person.equals("Doctor")) {
                int doc_id = (int) person_table.getValueAt(row_num, 0); //row (which id)?
                try {
                    d.delet_doctor(doc_id);
                } catch (SQLException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (person.equals("patient")) {
                int pat_id = (int) person_table.getValueAt(row_num, 0); //row (which id)?
                try {
                    d.delet_patient(pat_id);
                } catch (SQLException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            } else if (person.equals("treatment")) {
                int treat_id = (int) person_table.getValueAt(row_num, 0); //row (which id)?
                try {
                    d.delet_treat(treat_id);
                } catch (SQLException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "no selected item");
        }
    }//GEN-LAST:event_Btn_deleteActionPerformed

    private void BtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnexitActionPerformed
        exit ex = new exit();
        try {
            ex.exit();
            this.setVisible(false);
        } catch (InterruptedException ex1) {
            Logger.getLogger(Consoltation_page.class.getName()).log(Level.SEVERE, null, ex1);
        }
    }//GEN-LAST:event_BtnexitActionPerformed

    private void search_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search_btnActionPerformed
        admin_fun ad = new admin_fun();
        Object person = person_select.getSelectedItem();   //combo person 
        Object item; //combo item
        String search = search_tf.getText();  //text search
        if (!(search.equals(""))) {
            if (person.equals("Doctor")) {
                item = cobm_select_item.getSelectedItem();
                try {
                    ad.Search_doctor(item, search);
                    person_table.setModel(ad.dm);
                } catch (SQLException | ParseException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }catch(NullPointerException e){
                JOptionPane.showMessageDialog(rootPane, "no result");
                }
            } else if (person.equals("patient")) {
                item = (String) cobm_select_item.getSelectedItem();
                try {
                    ad.Search_patient(item, search);
                    person_table.setModel(ad.dm);
                } catch (SQLException | ParseException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }catch(NullPointerException e){
                JOptionPane.showMessageDialog(rootPane, "no result");
                }
            } else if (person.equals("treatment")) {
                item = (String) cobm_select_item.getSelectedItem();
                try {
                    ad.Search_tratment(item, search);
                    person_table.setModel(ad.dm);
                } catch (SQLException | ParseException ex) {
                    Logger.getLogger(admin.class.getName()).log(Level.SEVERE, null, ex);
                }catch(NullPointerException e){
                JOptionPane.showMessageDialog(rootPane, "no result");
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "please enter keyword to serch ");
        }

    }//GEN-LAST:event_search_btnActionPerformed

    private void person_selectItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_person_selectItemStateChanged
        int index = person_select.getSelectedIndex();
        String[] col;
        DefaultComboBoxModel com;
        switch (index) {
            case 0: //doctor 
                col = new String[]{"Name", "Address", "Phone", "Email", "Age", "Specially", "Studying", "Salary", "National_id"};
                com = new DefaultComboBoxModel(col);
                cobm_select_item.setModel(com);
                break;
            case 1: //patient
                col = new String[]{"Name", "Address", "Phone", "Email", "Age", "National_id", "Symptom"};
                com = new DefaultComboBoxModel(col);
                cobm_select_item.setModel(com);
                break;
            case 2: //treatment 
                col = new String[]{"Name", "Cost"};
                com = new DefaultComboBoxModel(col);
                cobm_select_item.setModel(com);
                break;
        }
    }//GEN-LAST:event_person_selectItemStateChanged

    private void Btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_updateActionPerformed

        Object person = person_select.getSelectedItem();   //combo person 
        int row_num = person_table.getSelectedRow();  //row (which one)?
        if (row_num != -1) {
            if (person.equals("Doctor")) {
                long doc_id = (long) person_table.getValueAt(row_num, 0); //row (which id)?
                admin_buttom d = new admin_buttom(doc_id);
                d.setVisible(true);
                this.setVisible(false);
            } else if (person.equals("patient")) {
                int treat_id = (int) person_table.getValueAt(row_num, 0); //row (which id)?
                admin_buttom d = new admin_buttom(treat_id);
                d.setVisible(true);
                this.setVisible(false);

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "no selected item");
        }
    }//GEN-LAST:event_Btn_updateActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                admin ad = new admin();
                ad.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_add;
    private javax.swing.JButton Btn_delete;
    private javax.swing.JButton Btn_update;
    private javax.swing.JButton Btnexit;
    private javax.swing.JComboBox<String> cobm_select_item;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> person_select;
    private javax.swing.JTable person_table;
    private javax.swing.JButton search_btn;
    private javax.swing.JTextField search_tf;
    // End of variables declaration//GEN-END:variables
}
