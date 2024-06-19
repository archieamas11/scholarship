/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbconnector;
import javax.swing.JOptionPane;

/**
 *
 * @author Hariell
 */
public class updateScholarForm extends javax.swing.JFrame {

    /**
     * Creates new form updateScholarForm
     */

    public updateScholarForm() {
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

        jPanel34 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        save = new javax.swing.JButton();
        sc_id = new javax.swing.JTextField();
        sc_type = new javax.swing.JTextField();
        sc_name = new javax.swing.JTextField();
        sc_status = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        sc_des = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel34.setBackground(new java.awt.Color(102, 102, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(543, 594));
        jPanel34.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setForeground(new java.awt.Color(204, 204, 204));
        jPanel21.setPreferredSize(new java.awt.Dimension(530, 770));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("UPDATE SCHOLARSHIP FORM");
        jPanel21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 500, 30));

        save.setBackground(new java.awt.Color(221, 68, 112));
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("Save");
        save.setBorderPainted(false);
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        jPanel21.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 350, -1, 30));

        sc_id.setEditable(false);
        sc_id.setBackground(new java.awt.Color(255, 255, 255));
        sc_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scholarship ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel21.add(sc_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 270, 40));

        sc_type.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scholarship type", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        sc_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sc_typeActionPerformed(evt);
            }
        });
        jPanel21.add(sc_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 139, 270, 40));

        sc_name.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scholarship name", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel21.add(sc_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 270, 40));

        sc_status.setForeground(new java.awt.Color(0, 0, 0));
        sc_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Approved", "Declined", "Pending" }));
        jPanel21.add(sc_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 270, 40));

        jButton1.setText("Cancel");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel21.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, 70, 30));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Scholarship description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N

        sc_des.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane2.setViewportView(sc_des);

        jPanel21.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 270, 90));

        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Status");
        jPanel21.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 270, -1));

        jPanel34.add(jPanel21);
        jPanel21.setBounds(0, 0, 500, 400);

        getContentPane().add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        dbconnector dbc = new dbconnector();

        int num = dbc.updateData("UPDATE table_scholarship "
                + "SET scholarship_name = '" + sc_name.getText() + "',"
                + "scholarship_type='" + sc_type.getText() + "',"
                + "scholarship_descrip = '" + sc_des.getText() + "', "
                + "scholarship_status='" + sc_status.getSelectedItem() + "'"
                + "WHERE scholarship_id = '" + sc_id.getText() + "'");
        if (num == 0) {

        } else {
            JOptionPane.showMessageDialog(null, "Updated Successfully!");

            adminDashboard db = new adminDashboard();
            db.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_saveActionPerformed

    private void sc_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sc_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sc_typeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateScholarForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateScholarForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel34;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton save;
    public javax.swing.JEditorPane sc_des;
    public javax.swing.JTextField sc_id;
    public javax.swing.JTextField sc_name;
    public javax.swing.JComboBox<String> sc_status;
    public javax.swing.JTextField sc_type;
    // End of variables declaration//GEN-END:variables
}
