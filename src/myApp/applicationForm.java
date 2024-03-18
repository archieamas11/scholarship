/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myApp;


import config.dbconnector;
import internalPages.report;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

;

/**
 *
 * @author Hariell
 */
public class applicationForm extends javax.swing.JFrame {

    /**
     * Creates new form applicationForm
     */
    public applicationForm() {
        initComponents();
        loadCombo();

    }

    Connection con;
    public static String name = "";
    public String ads = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        gmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentId = new javax.swing.JTextField();
        course = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        scholarshipName = new javax.swing.JComboBox<>();
        scholardescrip = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        scholarID = new javax.swing.JTextField();
        scholarType = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JTextField();
        scholarstatus = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        idd = new javax.swing.JComboBox<>();
        jLabel35 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(204, 204, 204));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel33.setText("-");
        panel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, -1, 30));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        panel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("APPLICATION FORM");
        panel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 260, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scclogo.png"))); // NOI18N
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 320, 370));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Name");
        panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, 33));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Gmail");
        panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, -1, 33));

        gmail.setEditable(false);
        gmail.setPreferredSize(new java.awt.Dimension(28, 20));
        panel.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 200, 30));

        jLabel8.setBackground(new java.awt.Color(0, 0, 0));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Course");
        panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, 33));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 33));

        studentId.setEditable(false);
        panel.add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 200, 30));
        panel.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 200, 30));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Gender");
        panel.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, 33));

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Contact #");
        panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, 33));

        contact.setEditable(false);
        panel.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 200, 30));

        gender.setEditable(false);
        panel.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 200, 30));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Scholarship Description:");
        panel.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, -1, 29));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Scholarship Name:");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, 29));

        scholarshipName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scholarshipNameActionPerformed(evt);
            }
        });
        panel.add(scholarshipName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 200, 30));

        scholardescrip.setEditable(false);
        scholardescrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scholardescripActionPerformed(evt);
            }
        });
        panel.add(scholardescrip, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 200, 30));

        jLabel11.setBackground(new java.awt.Color(0, 0, 0));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Scholarship type:");
        panel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, -1, 29));

        jLabel14.setBackground(new java.awt.Color(0, 0, 0));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("Scholarship ID");
        panel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 120, 33));

        scholarID.setEditable(false);
        panel.add(scholarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 200, 30));

        scholarType.setEditable(false);
        panel.add(scholarType, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 200, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Scholarship Status:");
        panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, 29));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Student Status");
        panel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 110, 33));

        status.setEditable(false);
        panel.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 510, 200, 30));

        scholarstatus.setEditable(false);
        panel.add(scholarstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 510, 200, 30));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-add-45.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panel.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 140, 40));

        idd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iddActionPerformed(evt);
            }
        });
        panel.add(idd, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 200, 30));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -10, 750, 640));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("-");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 188, Short.MAX_VALUE)
                    .addComponent(jLabel35)
                    .addGap(0, 569, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 567, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked

        dashBoard db = new dashBoard();
        db.setVisible(true);
        this.hide();
        // db.nam= ads ;
        db.nam = ads;
    }//GEN-LAST:event_jLabel34MouseClicked

    private void scholarshipNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scholarshipNameActionPerformed

        try {
            dbconnector dbc = new dbconnector();
            PreparedStatement stamt = (PreparedStatement) con.prepareStatement("SELECT * FROM table_scholarship");
            ResultSet rs = stamt.executeQuery();

            while (rs.next()) {
                if (rs.getString("scholarship_name").equals(scholarshipName.getSelectedItem().toString())) {
                    int scholar_id = rs.getInt("scholarship_id");
                    scholarID.setText("" + scholar_id);
                    scholarstatus.setText("pending");
                    scholarType.setText(rs.getString("scholarship_type"));
                    scholardescrip.setText(rs.getString("scholarship_descrip"));
                }
            }

        } catch (SQLException ex) {
            Logger.getLogger(applicationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_scholarshipNameActionPerformed

    private void scholardescripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scholardescripActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_scholardescripActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        try {
            dbconnector dbc = new dbconnector();
            String sql = "INSERT INTO application_table (student_id, scholarship_id, status) VALUES( ?,?, ?)";
            PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);
           
            pst.setString(1, (String) idd.getSelectedItem());
            pst.setString(2, scholarID.getText());
            pst.setString(3, status.getText());

            pst.execute();
            report db = new report();
            db.setVisible(true);
            this.hide();
            db.ad = ads;
        } catch (Exception e) {
            System.out.println("" + e);
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void iddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iddActionPerformed
        try {
            dbconnector dbc = new dbconnector();
            PreparedStatement stmt = (PreparedStatement) con.prepareStatement("SELECT * FROM table_student");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                if (rs.getString("student_id").equals(idd.getSelectedItem().toString())) {
                    studentId.setText(rs.getString("name"));
                    gmail.setText(rs.getString("gmail"));
                    course.setText(rs.getString("student_course"));
                    contact.setText(rs.getString("student_contactnum"));
                    gender.setText(rs.getString("student_gender"));
                    status.setText(rs.getString("student_status"));
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(applicationForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_iddActionPerformed
    void loadCombo() {

        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarshipsystem", "root", "");
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM table_student ");
            ResultSet rst = dbc.getData("SELECT * FROM table_scholarship ");
            while (rs.next()) {
                idd.addItem(rs.getString("student_id"));
            }
            while (rst.next()) {
                scholarshipName.addItem(rst.getString("scholarship_name"));
//
            }

        } catch (SQLException e) {
            System.out.println("" + e);
        }
    }

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
            java.util.logging.Logger.getLogger(applicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(applicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(applicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(applicationForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new applicationForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contact;
    private javax.swing.JTextField course;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField gmail;
    public javax.swing.JComboBox<String> idd;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField scholarID;
    private javax.swing.JTextField scholarType;
    private javax.swing.JTextField scholardescrip;
    public javax.swing.JComboBox<String> scholarshipName;
    private javax.swing.JTextField scholarstatus;
    private javax.swing.JTextField status;
    private javax.swing.JTextField studentId;
    // End of variables declaration//GEN-END:variables
}