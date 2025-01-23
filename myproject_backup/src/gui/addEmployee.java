package gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import component.TableActionCellEditor;
import component.TableActionCellRender;
import component.TableActionEvent;
import java.awt.Color;
import java.awt.Cursor;
import model.mySql;
import java.sql.ResultSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import raven.toast.Notifications;

public class addEmployee extends javax.swing.JFrame {

    private HashMap<String, String> genderHashMap = new HashMap<>();
    private HashMap<String, String> hotelHashMap = new HashMap<>();
    private HashMap<String, String> typeHashMap = new HashMap<>();
    Notifications notifi;
    boolean update = false;

    public addEmployee() {
        initComponents();
        notifi = new Notifications();
        notifi.setJFrame(this);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {

                setUpdateEmployee(row);

            }

            @Override
            public void onDelete(int row) {
                if (jTable2.isEditing()) {
                    jTable2.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                System.out.println("Delete Row" + row);
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println();
                new Employeedetails(String.valueOf(jTable2.getValueAt(row, 1))).setVisible(true);
            }

        };
        jTable2.getColumnModel().getColumn(2).setCellRenderer(new TableActionCellRender());
        jTable2.getColumnModel().getColumn(2).setCellEditor(new TableActionCellEditor(event));

        genderloading();
        hotelloading();
        typeloading();
        tabledataloading();
        Reset();
        countDashboard();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        setImage3 = new component.setImage();
        jPanel3 = new javax.swing.JPanel();
        cards1 = new component.Cards();
        jPanel1 = new javax.swing.JPanel();
        cards2 = new component.Cards();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cards3 = new component.Cards();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cards4 = new component.Cards();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cards5 = new component.Cards();
        jPanel4 = new javax.swing.JPanel();
        textField1 = new component.TextField();
        textField2 = new component.TextField();
        textField3 = new component.TextField();
        jLabel12 = new javax.swing.JLabel();
        passwordField1 = new component.PasswordField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        roundedImage1 = new component.roundedImage();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        button2 = new component.Button();
        cards6 = new component.Cards();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        setImage1 = new component.setImage();
        jLabel1 = new javax.swing.JLabel();
        setImage2 = new component.setImage();
        jLabel13 = new javax.swing.JLabel();
        button1 = new component.Button();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        setImage3.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/green.jpeg"))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cards1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cards2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/male.png"))); // NOI18N
        cards2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, 40));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Male Count");
        cards2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 119, 30));

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Count");
        cards2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jPanel1.add(cards2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 140, 120));

        cards3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/user.png"))); // NOI18N
        cards3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Count");
        cards3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 50, 20));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Count");
        cards3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 120, 30));

        jPanel1.add(cards3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 140, 120));

        cards4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/female.png"))); // NOI18N
        cards4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 12, 40, 40));

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Female Count");
        cards4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 119, 30));

        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Count");
        cards4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 50, -1));

        jPanel1.add(cards4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 140, 120));

        cards1.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, 150));

        jPanel4.setOpaque(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textField1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        textField1.setHint("First Name");
        jPanel4.add(textField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 141, -1));

        textField2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        textField2.setHint("Last Name");
        jPanel4.add(textField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 174, -1));

        textField3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        textField3.setHint("Email");
        jPanel4.add(textField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 333, -1));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/eye.png"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel12MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, -1, -1));

        passwordField1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        passwordField1.setHint("Password");
        jPanel4.add(passwordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 162, -1));

        jComboBox1.setBackground(new Color(0, 0, 0, 0));
        jComboBox1.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gender", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 170, 38));

        jComboBox2.setBackground(new java.awt.Color(204, 204, 204 ,10));
        jComboBox2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee Type", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 370, 180, 37));

        roundedImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/d1.jpeg"))); // NOI18N
        jPanel4.add(roundedImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, 107, 107));

        jComboBox3.setBackground(new java.awt.Color(255, 255, 255, 10)
        );
        jComboBox3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hotel", "Item 2", "Item 3", "Item 4" }));
        jPanel4.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, 170, 37));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Add Employee");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 300, -1));

        button2.setBackground(new java.awt.Color(255, 255, 0));
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Add Employee");
        button2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        jPanel4.add(button2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 170, 60));

        javax.swing.GroupLayout cards5Layout = new javax.swing.GroupLayout(cards5);
        cards5.setLayout(cards5Layout);
        cards5Layout.setHorizontalGroup(
            cards5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards5Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        cards5Layout.setVerticalGroup(
            cards5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards5Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Email", "More"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setRowHeight(50);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout cards6Layout = new javax.swing.GroupLayout(cards6);
        cards6.setLayout(cards6Layout);
        cards6Layout.setHorizontalGroup(
            cards6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 627, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        cards6Layout.setVerticalGroup(
            cards6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        setImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/login_background.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Manegment");

        setImage2.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Employee Email");

        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Home");
        button1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(setImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(260, 260, 260)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(setImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout setImage3Layout = new javax.swing.GroupLayout(setImage3);
        setImage3.setLayout(setImage3Layout);
        setImage3Layout.setHorizontalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage3Layout.createSequentialGroup()
                .addGap(1276, 1282, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(setImage3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cards1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cards6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(120, 120, 120)
                .addComponent(cards5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(setImage3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        setImage3Layout.setVerticalGroup(
            setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(setImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(setImage3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage3Layout.createSequentialGroup()
                        .addComponent(cards1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(cards6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cards5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseEntered
        jLabel12.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel12MouseEntered

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        if (evt.getButton() == 1) {
            passwordField1.setEchoChar(passwordField1.getEchoChar() == '\u0000' ? '*' : '\u0000');
        }
    }//GEN-LAST:event_jLabel12MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed

        boolean Validation = false;

        String fname = textField1.getText();
        String lname = textField2.getText();
        String email = textField3.getText();
        String password = String.valueOf(passwordField1.getPassword());
        String gender = String.valueOf(jComboBox1.getSelectedItem());
        String hotel = String.valueOf(jComboBox2.getSelectedItem());
        String role = String.valueOf(jComboBox3.getSelectedItem());

        if (fname.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "First Name is Empty");
        } else if (lname.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Last Name is Empty");
        } else if (email.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Email is Empty");
        } else if (!email.matches("^(?=.{1,64}@)[A-Za-z0-9\\+_-]+(\\.[A-Za-z0-9\\+_-]+)*@[^-][A-Za-z0-9\\+-]+(\\.[A-Za-z0-9\\+-]+)*(\\.[A-Za-z]{2,})$")) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Email Is Not Valid");
        } else if (password.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Password is Empty");
        } else if (gender.equals("Select")) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Select Gender");
        } else if (hotel.equals("Select")) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Select Hotel");
        } else if (role.equals("Select")) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Select Employee Role");
        } else {
            Validation = true;
        }
        if (!update) {

            if (Validation) {
                try {
                    ResultSet rs = mySql.executeSearch("SELECT * FROM `employee` WHERE `email` ='" + email + "'");
                    if (!rs.next()) {
                        mySql.executeIUD("INSERT INTO `employee` (`first_name`,`last_name`,`email`,`password`,`hotel_id`,`gender_id`,`employee_type_id`)"
                                + " VALUES ('" + fname + "','" + lname + "','" + email + "','" + password + "','" + hotelHashMap.get(hotel) + "'"
                                + ",'" + genderHashMap.get(gender) + "','" + typeHashMap.get(role) + "')");
                        Reset();
                        tabledataloading();
                        countDashboard();
                        notifi.show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Employee Registration Completed");
                    } else {
                        notifi.show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "This Email is already Registred");
                    }

                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
        try {
            if (update) {

                if (Validation) {

                   mySql.executeIUD("UPDATE `employee` SET `first_name` = '" + fname + "', `last_name` = '" + lname + "', `password` = '" + password + "', `hotel_id` = '" + hotelHashMap.get(hotel) + "', `gender_id` = '" + genderHashMap.get(gender) + "', `employee_type_id` = '" + typeHashMap.get(role) + "' WHERE `email` = '" + email + "'");
                    Reset();
                    tabledataloading();
                    countDashboard();
                    setAddEmployee();
                    notifi.show(Notifications.Type.SUCCESS, Notifications.Location.TOP_CENTER, "Employee Updated SucessFully");

                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_button2ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
       this.dispose();
       new Home1().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    public static void main(String args[]) {
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        UIManager.put("ProgressBar.arc", 999);
        UIManager.put("TextComponent.arc", 999);
        FlatLaf.registerCustomDefaultsSource("gui.addEmployee");
        FlatLaf.setGlobalExtraDefaults(Collections.singletonMap("@accentColor", "#26c03d"));

        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button button1;
    private component.Button button2;
    private component.Cards cards1;
    private component.Cards cards2;
    private component.Cards cards3;
    private component.Cards cards4;
    private component.Cards cards5;
    private component.Cards cards6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private component.PasswordField passwordField1;
    private component.roundedImage roundedImage1;
    private component.setImage setImage1;
    private component.setImage setImage2;
    private component.setImage setImage3;
    private component.TextField textField1;
    private component.TextField textField2;
    private component.TextField textField3;
    // End of variables declaration//GEN-END:variables

    private void tabledataloading() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `employee`");
            DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector<String> vector = new Vector<>();
                vector.add(rs.getString("first_name") + " " + rs.getString("last_name"));
                vector.add(rs.getString("email"));
                vector.add("More");
                model.addRow(vector);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void Reset() {
        textField1.setText("");
        textField2.setText("");
        textField3.setText("");
        passwordField1.setText("");
        jComboBox1.setSelectedItem("Select Gender");
        jComboBox2.setSelectedItem("Select Hotel");
        jComboBox3.setSelectedItem("Select Type");
    }

    private void countDashboard() {
        int maleCount = 0, femaleCount = 0;

        try {

            ResultSet rsMale = mySql.executeSearch("SELECT COUNT(*) FROM `employee` WHERE `gender_id`='" + genderHashMap.get("Male") + "'");
            if (rsMale.next()) {
                maleCount = rsMale.getInt(1);
            }
            ResultSet rsFemale = mySql.executeSearch("SELECT COUNT(*) FROM `employee` WHERE `gender_id`='" + genderHashMap.get("Female") + "'");
            if (rsFemale.next()) {
                femaleCount = rsFemale.getInt(1);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        int allCount = maleCount + femaleCount;
        jLabel3.setText(String.valueOf(allCount));
        jLabel5.setText(String.valueOf(maleCount));
        jLabel6.setText(String.valueOf(femaleCount));
    }

    private void genderloading() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `gender`");
            Vector vec = new Vector();
            vec.add("Select Gender");
            while (rs.next()) {
                vec.add(rs.getString("name"));
                genderHashMap.put(rs.getString("name"), rs.getString("id"));

            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(vec);
            jComboBox1.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void hotelloading() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `hotel`");
            Vector vec = new Vector();
            vec.add("Select Hotel");
            while (rs.next()) {
                vec.add(rs.getString("hotel_name"));
                hotelHashMap.put(rs.getString("hotel_name"), rs.getString("id"));
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(vec);
            jComboBox2.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void typeloading() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `employee_type`");
            Vector vec = new Vector();
            vec.add("Select Type");
            while (rs.next()) {
                vec.add(rs.getString("type_name"));
                typeHashMap.put(rs.getString("type_name"), rs.getString("id"));
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(vec);
            jComboBox3.setModel(model);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setUpdateEmployee(int row) {
        String email = String.valueOf(jTable2.getValueAt(row, 1));

        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `employee`INNER JOIN `gender`"
                    + "ON `employee`.`gender_id` = `gender`.`id` "
                    + "INNER JOIN `hotel` ON `employee`.`hotel_id` = `hotel`.`id`"
                    + "INNER JOIN `employee_type` ON `employee`.`employee_type_id` = `employee_type`.`id`"
                    + "   WHERE `email` = '" + email + "'");
            if (rs.next()) {
                String full_name = String.valueOf(jTable2.getValueAt(row, 0));
                String[] name = full_name.split(" ", 2);
                jLabel11.setText("Update Employee");
                button2.setText("Update Employee");
                textField1.setText(name[0]);
                textField2.setText(name[1]);
                textField3.setText(email);
                update = true;
                textField3.setEditable(false);
                textField3.setForeground(Color.DARK_GRAY);
                passwordField1.setText(rs.getString("password"));
                jComboBox1.setSelectedItem(rs.getString("gender.name"));
                jComboBox2.setSelectedItem(rs.getString("hotel.hotel_name"));
                jComboBox3.setSelectedItem(rs.getString("employee_type.type_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setAddEmployee() {

        Reset();
        jLabel11.setText("Add Employee");
        button2.setText("Add Employee");
        textField3.setEditable(true);
        textField3.setForeground(Color.WHITE);
    }

}
