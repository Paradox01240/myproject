
package gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import component.TableActionCellEditor;
import component.TableActionCellRender;
import component.TableActionEvent;
import java.util.Collections;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.mySql;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import raven.alerts.MessageAlerts;
import raven.popup.GlassPanePopup;
import raven.toast.Notifications;

public class Rooms extends javax.swing.JFrame {

    HashMap<String, String> roomTypeHashMap = new HashMap<>();
    private Booking book;
    private Notifications notifi;
    

    public void setBook(Booking book) {
        this.book = book;
    }
       
    
    public Rooms() {
        initComponents();
        loadRooms();
        loadRoomType();
         GlassPanePopup.install(this);
        jLabel2.setText(login.email);
        notifi = new Notifications();
        notifi.setJFrame(this);
        TableActionEvent event = new TableActionEvent() {
            @Override
            public void onEdit(int row) {
                if (row != -1) {
                  textField1.setText(String.valueOf(jTable1.getValueAt(row, 0)));  
                  textField2.setText(String.valueOf(jTable1.getValueAt(row, 1)));
                  textField3.setText(String.valueOf(jTable1.getValueAt(row, 4)));
                  jComboBox1.setSelectedItem(String.valueOf(jTable1.getValueAt(row, 3)));
                }
                
            }

            @Override
            public void onDelete(int row) {
                if (jTable1.isEditing()) {
                    jTable1.getCellEditor().stopCellEditing();
                }
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                System.out.println("Delete Row" + row);
                model.removeRow(row);
            }

            @Override
            public void onView(int row) {
                System.out.println();
                new Employeedetails(String.valueOf(jTable1.getValueAt(row, 1))).setVisible(true);
            }

        };
        jTable1.getColumnModel().getColumn(6).setCellRenderer(new TableActionCellRender());
        jTable1.getColumnModel().getColumn(6).setCellEditor(new TableActionCellEditor(event));

    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        setImage1 = new component.setImage();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setImage2 = new component.setImage();
        button2 = new component.Button();
        jPanel3 = new javax.swing.JPanel();
        setBackground1 = new component.setBackground();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        dialogform1 = new component.dialogform();
        jLabel3 = new javax.swing.JLabel();
        cards1 = new component.Cards();
        jLabel4 = new javax.swing.JLabel();
        textField1 = new component.TextField();
        textField2 = new component.TextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        button1 = new component.Button();
        jLabel5 = new javax.swing.JLabel();
        textField3 = new component.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/login_background.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Room Managment");
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Employee Email");

        setImage2.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N

        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Home");
        button2.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout setImage1Layout = new javax.swing.GroupLayout(setImage1);
        setImage1.setLayout(setImage1Layout);
        setImage1Layout.setHorizontalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(setImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addGap(421, 421, 421)
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        setImage1Layout.setVerticalGroup(
            setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setImage1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(setImage2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setImage1Layout.createSequentialGroup()
                        .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel4.setOpaque(false);

        jTable1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Room Number", "Room Name", "Hotel Name", "Room Type", "Room Price", "More"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(45);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(15);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(40);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(80);
        }

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("HOTEL NAME");

        javax.swing.GroupLayout dialogform1Layout = new javax.swing.GroupLayout(dialogform1);
        dialogform1.setLayout(dialogform1Layout);
        dialogform1Layout.setHorizontalGroup(
            dialogform1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogform1Layout.setVerticalGroup(
            dialogform1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Add Room ");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));

        textField1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField1.setHint("Room ID");

        textField2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField2.setHint("Room Name");

        jComboBox1.setBackground(new java.awt.Color(246, 246, 246, 10));
        jComboBox1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        button1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        button1.setForeground(new java.awt.Color(255, 255, 255));
        button1.setText("Add New Room");
        button1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Room Type");
        jLabel5.setToolTipText("");

        textField3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField3.setHint("Room Price");

        javax.swing.GroupLayout cards1Layout = new javax.swing.GroupLayout(cards1);
        cards1.setLayout(cards1Layout);
        cards1Layout.setHorizontalGroup(
            cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, cards1Layout.createSequentialGroup()
                        .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(cards1Layout.createSequentialGroup()
                                .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, cards1Layout.createSequentialGroup()
                                .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                        .addGap(26, 26, 26))))
        );
        cards1Layout.setVerticalGroup(
            cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout setBackground1Layout = new javax.swing.GroupLayout(setBackground1);
        setBackground1.setLayout(setBackground1Layout);
        setBackground1Layout.setHorizontalGroup(
            setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(360, 360, 360)
                        .addComponent(dialogform1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(cards1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        setBackground1Layout.setVerticalGroup(
            setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(setBackground1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addComponent(dialogform1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cards1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(setBackground1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        String Room_id = textField1.getText();
        String Room_name = textField2.getText();
        String price = textField3.getText();
        String Room_type = String.valueOf(jComboBox1.getSelectedItem());
        if (Room_id.isEmpty()) {
            notifi.show(Notifications.Type.INFO, Notifications.Location.TOP_CENTER, "Fill Room ID Field");
        } else if (Room_name.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Enter Room Name");
        } else if (Room_type.equals("Select")) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Select Room Type");
        } else if (price.isEmpty()) {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Price Is Empty");
        } else {
            try {
                ResultSet rs = mySql.executeSearch("SELECT * FROM `rooms` WHERE `room_id`='"+Room_id+"'");
                if (rs.next()) {
                   notifi.show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, "Already Room Id In");  
                }else{
                     mySql.executeIUD("INSERT INTO `rooms` (`room_id`,`hotel_id`,`room_type_id`,`room_price`,`room_name`) VALUES ('" + Room_id + "','" + login.Hotel_id + "','" + roomTypeHashMap.get(Room_type) + "','" + price + "','" + Room_name + "') ");
                    loadRooms();
                    reset();
                     MessageAlerts.getInstance().showMessage("Title", "Added Sucess", MessageAlerts.MessageType.SUCCESS);
                }
                     } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_button1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        if (book != null) {
            if (evt.getClickCount() == 1) {
                int row = jTable1.getSelectedRow();
                if (row != -1) {
                    book.settextField1().setText(String.valueOf(jTable1.getValueAt(row, 1)));
                    book.setroomtype().setText(String.valueOf(jTable1.getValueAt(row, 4)));
                    book.sethotelname().setText(String.valueOf(jTable1.getValueAt(row, 3)));
                    book.setPrice().setText(String.valueOf(jTable1.getValueAt(row, 5)));
                    book.setRoomPID().setText(String.valueOf(jTable1.getValueAt(row, 0)));
                    this.dispose();
                }

            }

        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
       this.dispose();
       new Home1().setVisible(true);
    }//GEN-LAST:event_button2ActionPerformed


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
                new Rooms().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button button1;
    private component.Button button2;
    private component.Cards cards1;
    private component.dialogform dialogform1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private component.setBackground setBackground1;
    private component.setImage setImage1;
    private component.setImage setImage2;
    private component.TextField textField1;
    private component.TextField textField2;
    private component.TextField textField3;
    // End of variables declaration//GEN-END:variables

    private void loadRooms() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `rooms` INNER JOIN `room_type` ON `rooms`.`room_type_id` = `room_type`.`id` "
                    + "INNER JOIN `hotel` ON `rooms`.`hotel_id`= `hotel`.`id`");
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            while (rs.next()) {
                Vector vec = new Vector();
                vec.add(rs.getString("rooms.id"));
                vec.add(rs.getString("rooms.room_id"));
                vec.add(rs.getString("rooms.room_name"));
                vec.add(rs.getString("hotel.hotel_name"));
                vec.add(rs.getString("room_type.type"));
                vec.add(rs.getString("rooms.room_price"));
                vec.add("more");
                model.addRow(vec);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadRoomType() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `room_type`");
            Vector vec = new Vector();
            vec.add("Select");
            while (rs.next()) {

                vec.add(rs.getString("type"));
                roomTypeHashMap.put(rs.getString("type"), rs.getString("id"));

            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(vec);
            jComboBox1.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void reset() {
      textField1.setText("");
      textField2.setText("");
      textField3.setText("");
      jTable1.clearSelection();
      jComboBox1.setSelectedIndex(0);
    }
}
