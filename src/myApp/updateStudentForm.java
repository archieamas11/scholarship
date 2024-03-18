/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myApp;

import config.dbconnector;
import internalPages.admin;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Hariell
 */
public class updateStudentForm extends javax.swing.JFrame {

    public byte[] imageBytes;
    File selectedFile;
    String path;
    public String oldpath;
    String fileName = null;
    String imgPath = null;
    byte[] person_image = null;
    public static String reference = "";
    public static String name = "";
    public String ads = "";

    /**
     * Creates new form updateStudentForm
     */
    public updateStudentForm() {
        initComponents();
    }

    public static String gender;

    public void imageUpdater(String existingFilePath, String newFilePath) {
        File existingFile = new File(existingFilePath);
        if (existingFile.exists()) {
            String parentDirectory = existingFile.getParent();
            File newFile = new File(newFilePath);
            String newFileName = newFile.getName();
            File updatedFile = new File(parentDirectory, newFileName);
            existingFile.delete();
            try {
                Files.copy(newFile.toPath(), updatedFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Image updated successfully.");
            } catch (IOException e) {
                System.out.println("Error occurred while updating the image: ");
            }
        } else {
            try {
                Files.copy(selectedFile.toPath(), new File(reference).toPath(), StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println("Error on update!");
            }
        }
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
        jPanel20 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        update_id = new javax.swing.JTextField();
        gmail = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        status = new javax.swing.JComboBox<>();
        jLabel29 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        course = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        images = new javax.swing.JLabel();
        up = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel34.setBackground(new java.awt.Color(102, 102, 255));
        jPanel34.setPreferredSize(new java.awt.Dimension(543, 594));
        jPanel34.setLayout(null);

        jPanel21.setBackground(new java.awt.Color(204, 204, 204));
        jPanel21.setPreferredSize(new java.awt.Dimension(530, 770));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel18.setText(" UPDATE STUDENTS FORM");
        jPanel21.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 330, 40));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Student ID :");
        jPanel20.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 33));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Name :");
        jPanel20.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, 20));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Gmail :");
        jPanel20.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText(" Gender :");
        jPanel20.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 70, 33));

        update_id.setEditable(false);
        update_id.setBackground(new java.awt.Color(255, 255, 255));
        update_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(update_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 179, 28));

        gmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(gmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 179, 28));

        fname.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 178, 25));

        male.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        male.setText("  MALE");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel20.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 81, 30));

        female.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        female.setText(" FEMALE");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel20.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 90, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Status:");
        jPanel20.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 60, 33));

        status.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single\t", "Married", "Widowed", " " }));
        status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusActionPerformed(evt);
            }
        });
        jPanel20.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 180, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Course");
        jPanel20.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 60, 33));

        contact.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 179, 28));

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel31.setText("Contact :");
        jPanel20.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 70, 33));

        course.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel20.add(course, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 180, 179, 28));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-update-38.png"))); // NOI18N
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel20.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 120, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(images, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(images, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel20.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 120, -1));

        up.setText("Update New Photo");
        up.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upActionPerformed(evt);
            }
        });
        jPanel20.add(up, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 140, 30));

        jPanel21.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 610, 360));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        jLabel34.setText(" x");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, 30, -1));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel33.setText("-");
        jPanel21.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, -1, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/t_1.png"))); // NOI18N
        jPanel21.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setForeground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 110, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uni.PNG"))); // NOI18N
        jPanel21.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 650, 120));

        jPanel34.add(jPanel21);
        jPanel21.setBounds(0, 0, 750, 600);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, 750, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked

        admin db = new admin();
        db.setVisible(true);
        this.hide();
        db.ads = ads;
    }//GEN-LAST:event_jLabel34MouseClicked
    public int FileExistenceChecker(String path) {
        File file = new File(path);
        String fileName = file.getName();

        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);

        if (fileExists) {
            return 1;
        } else {
            return 0;
        }

    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        dbconnector dbc = new dbconnector();

        String imageUpdate = reference.isEmpty() ? "" : ", image='" + reference.replace("\\", "\\\\") + "'";

        int num = dbc.updateData("UPDATE table_student "
                + "SET name = '" + fname.getText() + "',"
                + " gmail='" + gmail.getText() + "',"
                + "student_course = '" + course.getText() + "', "
                + "student_contactnum ='" + contact.getText() + "',"
                + "student_gender ='" + gender + "'"
                + imageUpdate + ","
                + "student_status='" + status.getSelectedItem() + "' "
                + "WHERE student_id = '" + update_id.getText() + "'"
        );

        if (num == 1) {
            if (!reference.isEmpty() && !reference.equals(path)) {
                // Check if 'path' is not null before using it
                if (path != null) {
                    File existingFile = new File(path);
                    if (existingFile.exists()) {
                        existingFile.delete();
                    }
                }
            }

            if (!reference.isEmpty()) {
                // Check if 'path' is not null before using it
                if (path != null) {
                    imageUpdater(path, reference);
                    System.out.println("REFERENCE is not Empty!");
                } else {
                    System.err.println("Path is null. Image update skipped.");
                }
            }

            JOptionPane.showMessageDialog(null, "Updated Successfully!");
            studentPage db = new studentPage();
            db.setVisible(true);
            this.hide();
            db.ad = ads;
        } else {
            JOptionPane.showMessageDialog(null, "Failed to Update!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusActionPerformed

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed

        //        System.out.println(female.isSelected());
        if (female.isSelected()) {
            male.setSelected(false);
            gender = "Female";
        }
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        //System.out.println(male.isSelected());

        if (male.isSelected()) {
            female.setSelected(false);
            gender = "Male";
        }
    }//GEN-LAST:event_maleActionPerformed

    private void upActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_upActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                reference = "src/images/" + selectedFile.getName();
                path = selectedFile.getAbsolutePath();

                if (FileExistenceChecker(path) == 1) {
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    reference = "";
                    path = "";
                } else {
                    images.setIcon(ResizeImage(path, null));
                    byte[] buf = new byte[1024];
                    System.out.println("" + reference);
                    up.setVisible(true);
                    //  up.setText("REMOVE");
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_upActionPerformed
    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(images.getWidth(), images.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
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
            java.util.logging.Logger.getLogger(updateStudentForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateStudentForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateStudentForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateStudentForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateStudentForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField contact;
    public javax.swing.JTextField course;
    public javax.swing.JRadioButton female;
    public javax.swing.JTextField fname;
    public javax.swing.JTextField gmail;
    public javax.swing.JLabel images;
    public javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel34;
    public javax.swing.JRadioButton male;
    public javax.swing.JComboBox<String> status;
    private javax.swing.JButton up;
    public javax.swing.JTextField update_id;
    // End of variables declaration//GEN-END:variables

    Icon ResizeImage(String string, Object object, JLabel images) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
