/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myApp;

import com.mysql.jdbc.PreparedStatement;

import config.dbconnector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import org.mindrot.jbcrypt.BCrypt;
import java.io.File;
import java.awt.Image;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;

/**
 *
 * @author SCC_PC
 */
public class registerForm extends javax.swing.JFrame {

    /**
     * Creates new form registerForm
     */
    public byte[] imageBytes;
    File selectedFile;
    String path;
    String fileName = null;
    String imgPath = null;
    byte[] person_image = null;
    public String reference;

    public registerForm() {
        initComponents();
    }
    private Connection connection;

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    @SuppressWarnings("unchecked")

    int validation() {
        int result;
        if (name.getText().isEmpty() || emailadd.getText().isEmpty() || cont.getText().isEmpty() || pass.getText().isEmpty() || confirmpass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All Fields are Required");
            result = 0;
        } else {
            result = 1;
        }

        return result;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        confirmpass = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        emailadd = new javax.swing.JTextField();
        cont = new javax.swing.JTextField();
        pass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        user = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        ins = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Email Address:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(530, 500));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Confirm Password:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 410, 140, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText(" Name:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 140, 50, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("User Role:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 300, 70, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Password:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 350, 80, 30);

        confirmpass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(confirmpass);
        confirmpass.setBounds(160, 410, 270, 30);

        name.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(name);
        name.setBounds(160, 140, 270, 30);

        emailadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(emailadd);
        emailadd.setBounds(160, 200, 270, 30);

        cont.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(cont);
        cont.setBounds(160, 250, 270, 30);

        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        jPanel1.add(pass);
        pass.setBounds(160, 360, 270, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-register-48.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 450, 40, 50);

        jLabel7.setBackground(new java.awt.Color(0, 0, 0));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("-");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 0, 17, 30);

        jLabel34.setBackground(new java.awt.Color(0, 0, 0));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-close-30.png"))); // NOI18N
        jLabel34.setText("x");
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel34);
        jLabel34.setBounds(610, 0, 30, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Contact No.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 250, 90, 30);

        user.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "student", "admin" }));
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jPanel1.add(user);
        user.setBounds(160, 300, 270, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Email Address:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(30, 200, 110, 30);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uni.PNG"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(0, 0, 640, 100);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(510, 130, 100, 100);

        ins.setFont(new java.awt.Font("Tahoma", 1, 8)); // NOI18N
        ins.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-insert-raster-image-27.png"))); // NOI18N
        ins.setText("PHOTO");
        ins.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insActionPerformed(evt);
            }
        });
        jPanel1.add(ins);
        ins.setBounds(510, 240, 100, 30);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/scclogo.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(310, 280, 390, 380);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("    Register:");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(160, 460, 71, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 638, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void insertData(String sql) {
        try {

            PreparedStatement pstmt = (PreparedStatement) connection.prepareStatement(sql);
            pstmt.executeUpdate();
            System.out.println("Inserted Successfully!");
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Connection Error: " + e);
        }
    }

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
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int result = 0;
        int check = validation();
        logBoard lb = new logBoard();
        try {
            String rehashedPassword;
            String hashedpass;

            dbconnector dbc = new dbconnector();
            if (check == 1) {
                if (pass.getText().equals(confirmpass.getText())) {
                    String password = confirmpass.getText();
                    String hashedPass = BCrypt.hashpw(password, BCrypt.gensalt());
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/scholarshipsystem", "root", "");

                    String sql = "INSERT INTO user_table (username, email, contact, image, password, role) VALUES (?, ?, ?, ?, ?, ?)";
                    PreparedStatement pst = (PreparedStatement) con.prepareStatement(sql);

                    pst.setString(1, name.getText());
                    pst.setString(2, emailadd.getText());
                    pst.setString(3, cont.getText());
                    pst.setString(4, reference.replace("\\", "\\\\"));
                    pst.setString(5, hashedPass);
                    pst.setString(6, user.getSelectedItem().toString());

                    pst.execute();
                    result = 1;
                    Files.copy(selectedFile.toPath(), new File(reference).toPath(), StandardCopyOption.REPLACE_EXISTING);
                    JOptionPane.showMessageDialog(null, "Successfully Registered");
                    logBoard db = new logBoard();
                    db.setVisible(true);
//                    this.hide();
                } else {
                    JOptionPane.showMessageDialog(null, "Passwords do not match");
                }
            }
        } catch (Exception e) {
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked

        logBoard db = new logBoard();
        db.setVisible(true);
//        this.hide();


    }//GEN-LAST:event_jLabel34MouseClicked

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userActionPerformed

    private void insActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                reference = "src/images/" + selectedFile.getName();
                path = selectedFile.getAbsolutePath();

                if (FileExistenceChecker(path) == 1) {
                    JOptionPane.showMessageDialog(null, "File Already Exists, Rename or Choose Another!");
                    reference = "";
                    path = "";
                } else {
                    image.setIcon(ResizeImage(path, null));
                    //  byte[] buf = new byte[1024];
                    System.out.println("" + reference);
                    ins.setVisible(true);
                    ins.setText("REMOVE");
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_insActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField confirmpass;
    private javax.swing.JTextField cont;
    public javax.swing.JTextField emailadd;
    private javax.swing.JLabel image;
    private javax.swing.JButton ins;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JTextField name;
    private javax.swing.JTextField pass;
    private javax.swing.JComboBox<String> user;
    // End of variables declaration//GEN-END:variables
}
