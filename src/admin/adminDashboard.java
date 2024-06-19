/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin;

import config.dbconnector;
import java.awt.Image;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import myApp.addScholarForm;
import myApp.addStudentForm;
import login.login;
import myApp.updateScholarForm;
import myApp.updateStudentForm;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author SCC-PC19
 */
public class adminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form adminDashboard
     */
    public byte[] imageBytes;

    public static String reference;
    public String uname = "";
    public String ads = "";

    public adminDashboard() {
        initComponents();
        displayData();
        scholarShip();
    }

    public void scholarShip() {

        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM table_scholarship");
            scholarship_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println("Error Message" + ex);
        }
    }

    public ImageIcon ResizeImage(String ImagePath, byte[] pic) {
        ImageIcon MyImage = null;
        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;
    }

    public void displayData() {

        try {
            dbconnector dbc = new dbconnector();
            ResultSet rs = dbc.getData("SELECT * FROM table_student");
            student_table.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (SQLException ex) {
            System.out.println("Error Message" + ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jToggleButton6 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        acc = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        position = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        studentId = new javax.swing.JTextField();
        jPanel15 = new javax.swing.JPanel();
        image = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student_table = new javax.swing.JTable();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        search = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        scholarship_table = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setPreferredSize(new java.awt.Dimension(630, 580));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(530, 600));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 190, 40));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 610, 190, 20));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN PAGE");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 240, 50));

        jToggleButton5.setText("Profile");
        jToggleButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 180, 40));

        jToggleButton6.setText("Manage student");
        jToggleButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton6ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 40));

        jToggleButton1.setText("Manage scholarship");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 40));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 700));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/books_icon.png"))); // NOI18N
        jLabel2.setText(" Scholarship Explorer");
        jPanel7.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 50));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 450, 50));

        tabs.setBackground(new java.awt.Color(255, 255, 255));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        acc.setBackground(new java.awt.Color(255, 255, 255));
        acc.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        acc.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        acc.setText("Account ID");
        jPanel4.add(acc, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        email1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        email1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        email1.setText("Username");
        jPanel4.add(email1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 80, 30));

        position.setBackground(new java.awt.Color(255, 255, 255));
        position.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        position.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        position.setText("Contact");
        jPanel4.add(position, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 50, 30));

        num.setEditable(false);
        num.setBackground(new java.awt.Color(255, 255, 255));
        num.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(num, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 180, 30));

        user.setEditable(false);
        user.setBackground(new java.awt.Color(255, 255, 255));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(user, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 180, 30));

        studentId.setEditable(false);
        studentId.setBackground(new java.awt.Color(255, 255, 255));
        studentId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.add(studentId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 180, 30));

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/uuser.png"))); // NOI18N
        image.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, 140, -1));

        tabs.addTab("profile", jPanel4);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        student_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        student_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(student_table);

        jPanel5.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 700, 460));

        jToggleButton2.setText("Add student");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, 30));

        jToggleButton3.setText("Edit");
        jToggleButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton3ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 30));

        jToggleButton4.setText("Delete");
        jToggleButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jToggleButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 30));

        search.setForeground(new java.awt.Color(153, 153, 153));
        search.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel5.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-25.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/t_1.png"))); // NOI18N
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        tabs.addTab("manage student", jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scholarship_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        scholarship_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                scholarship_tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(scholarship_table);

        jPanel6.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 700, 460));

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 100, 30));

        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 140, 100, 30));

        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 140, 100, 30));

        search1.setForeground(new java.awt.Color(153, 153, 153));
        search1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel6.add(search1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 30));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8-search-25.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 40, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/t_1.png"))); // NOI18N
        jPanel6.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        tabs.addTab("manage scholarship", jPanel6);

        jPanel2.add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 760, 700));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void imageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageMouseClicked
    }//GEN-LAST:event_imageMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
//        JFrame mainJFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
//        mainJFrame.dispose();
        login lb = new login();
        lb.setVisible(true);
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jToggleButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton5ActionPerformed
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_jToggleButton5ActionPerformed

    private void jToggleButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton6ActionPerformed
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_jToggleButton6ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        tabs.setSelectedIndex(2);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton3ActionPerformed
        int rowIndex = student_table.getSelectedRow();
        login lb = new login();

        Connection conn;
        String newImage = null;

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = student_table.getModel();
            updateStudentForm stf = new updateStudentForm();

            try {
                dbconnector dbc = new dbconnector();
                ResultSet rs = dbc.getData("SELECT * FROM table_student WHERE student_id =" + model.getValueAt(rowIndex, 0));

                if (rs.next()) {
                    stf.update_id.setText("" + rs.getString("student_id"));
                    stf.fname.setText("" + rs.getString("name"));
                    stf.gmail.setText("" + rs.getString("gmail"));
                    stf.course.setText(rs.getString("student_course"));
                    stf.contact.setText(rs.getString("student_contactnum"));
                    stf.gender = rs.getString("student_gender");
                    images = rs.getString("image");

                    ImageIcon imageIcon = new ImageIcon(images);
                    Image icon = imageIcon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
                    ImageIcon in = new ImageIcon(icon);

                    stf.images.setIcon(in);
                    byte[] buf = new byte[1024];

                    stf.setVisible(true);
                    this.hide();
                    stf.ads = ad;
                }

            } catch (SQLException e) {
                System.out.println("Database Error Connection!");

            }

        }
    }//GEN-LAST:event_jToggleButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel model = (DefaultTableModel) student_table.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        student_table.setRowSorter(obj);
        obj.setRowFilter(javax.swing.RowFilter.regexFilter(search.getText()));
    }//GEN-LAST:event_jButton4ActionPerformed
    public static String images;
    public String ad = "";
    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        addStudentForm sf = new addStudentForm();
        sf.setVisible(true);
        sf.nms = uname;
        this.hide();
        sf.ads = ad;
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jToggleButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton4ActionPerformed
        int rowIndex = student_table.getSelectedRow();
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a data first");
        } else {
            TableModel model = student_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                dbconnector dbc = new dbconnector();
                dbc.deleteStudent(Integer.parseInt(id));
                displayData();
            }
        }
    }//GEN-LAST:event_jToggleButton4ActionPerformed

    private void student_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_tableMouseClicked

        int rowIndex = student_table.getSelectedRow();
        if (rowIndex < 0) {

        } else {

            TableModel model = student_table.getModel();
            addStudentForm st = new addStudentForm();
            st.id.setText("" + model.getValueAt(rowIndex, 0));
            st.fname.setText("" + model.getValueAt(rowIndex, 1));
            st.gmail.setText("" + model.getValueAt(rowIndex, 2));
            st.course.setText("" + model.getValueAt(rowIndex, 3));
            st.contact.setText("" + model.getValueAt(rowIndex, 4));
            st.gender = model.getValueAt(rowIndex, 5).toString();
            st.status.setSelectedItem("" + model.getValueAt(rowIndex, 6));
            st.ads = ad;
        }
    }//GEN-LAST:event_student_tableMouseClicked

    private void scholarship_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_scholarship_tableMouseClicked
        int rowIndex = scholarship_table.getSelectedRow();
        if (rowIndex < 0) {

        } else {

            TableModel model = scholarship_table.getModel();
            updateScholarForm usf = new updateScholarForm();
            usf.sc_id.setText("" + model.getValueAt(rowIndex, 0));
            usf.sc_name.setText("" + model.getValueAt(rowIndex, 1));
            usf.sc_type.setText("" + model.getValueAt(rowIndex, 2));
            usf.sc_des.setText("" + model.getValueAt(rowIndex, 3));
            usf.sc_status.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
        }
    }//GEN-LAST:event_scholarship_tableMouseClicked

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int rowIndex = scholarship_table.getSelectedRow();

        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a data first");
        } else {
            TableModel model = scholarship_table.getModel();
            Object value = model.getValueAt(rowIndex, 0);
            String id = value.toString();
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
            if (a == JOptionPane.YES_OPTION) {
                dbconnector dbc = new dbconnector();
                dbc.deleteScholar(Integer.parseInt(id));
                displayData();

            }

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int rowIndex = scholarship_table.getSelectedRow();
        login lb = new login();
        adminDashboard ad = new adminDashboard();
        String email = lb.email;
        String img = lb.reference;
        Connection conn;
        String newImage = null;
        if (rowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please Select an Item!");
        } else {
            TableModel model = scholarship_table.getModel();
            updateScholarForm usf = new updateScholarForm();
            usf.sc_id.setText("" + model.getValueAt(rowIndex, 0));
            usf.sc_name.setText("" + model.getValueAt(rowIndex, 1));
            usf.sc_type.setText("" + model.getValueAt(rowIndex, 2));
            usf.sc_des.setText("" + model.getValueAt(rowIndex, 3));
            usf.sc_status.setSelectedItem(model.getValueAt(rowIndex, 4).toString());
            usf.setVisible(true);
            this.hide();
            usf.ads = ads;
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        addScholarForm sf = new addScholarForm();
        sf.setVisible(true);
        this.hide();
        sf.ads = ads;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acc;
    private javax.swing.JLabel email1;
    public javax.swing.JLabel image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JToggleButton jToggleButton6;
    public javax.swing.JTextField num;
    private javax.swing.JLabel position;
    private javax.swing.JTable scholarship_table;
    private javax.swing.JTextField search;
    private javax.swing.JTextField search1;
    public javax.swing.JTextField studentId;
    private javax.swing.JTable student_table;
    private javax.swing.JTabbedPane tabs;
    public javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}