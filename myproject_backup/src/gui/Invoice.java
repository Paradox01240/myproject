package gui;

import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import component.Button;
import component.TextField;
import model.mySql;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRTableModelDataSource;
import net.sf.jasperreports.view.JasperViewer;
import raven.alerts.MessageAlerts;
import raven.popup.GlassPanePopup;
import raven.toast.Notifications;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrintManager;

public class Invoice extends javax.swing.JFrame {

    Notifications notifi;
    HashMap<String, String> roomsHashMap = new HashMap<>();

    public Invoice() {
        initComponents();
        GlassPanePopup.install(this);
        jLabel13.setText(login.email);
        notifi = new Notifications();
        notifi.setJFrame(this);
        button4.setEnabled(false);
        textField10.setText("#" + invoiceid());
        textField10.setEditable(false);
        roomloading();

    }

    private void roomloading() {
        try {
            ResultSet rs = mySql.executeSearch("SELECT * FROM `rooms`");
            while (rs.next()) {
                roomsHashMap.put(rs.getString("room_id"), rs.getString("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public TextField setBookingID() {
        return textField1;
    }

    public Button setButton() {
        return button2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        setImage1 = new component.setImage();
        jLabel1 = new javax.swing.JLabel();
        setImage2 = new component.setImage();
        jLabel13 = new javax.swing.JLabel();
        button1 = new component.Button();
        jPanel3 = new javax.swing.JPanel();
        setBackground1 = new component.setBackground();
        cards1 = new component.Cards();
        button3 = new component.Button();
        jLabel14 = new javax.swing.JLabel();
        textField1 = new component.TextField();
        button2 = new component.Button();
        cards2 = new component.Cards();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        textField3 = new component.TextField();
        textField4 = new component.TextField();
        jLabel11 = new javax.swing.JLabel();
        button4 = new component.Button();
        jLabel12 = new javax.swing.JLabel();
        textField5 = new component.TextField();
        button5 = new component.Button();
        jLabel16 = new javax.swing.JLabel();
        textField9 = new component.TextField();
        cards3 = new component.Cards();
        jLabel15 = new javax.swing.JLabel();
        textField2 = new component.TextField();
        textField6 = new component.TextField();
        textField7 = new component.TextField();
        textField8 = new component.TextField();
        button6 = new component.Button();
        textField10 = new component.TextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/login_background.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Invoice");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 362, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248)
                .addGroup(setImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
                        .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setImage1Layout.createSequentialGroup()
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
                .addContainerGap(52, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(setImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 142, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(setImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)))
        );

        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("ADD Booking ID");
        button3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Count");
        jLabel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        textField1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField1.setHint("Booking ID");
        textField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField1KeyReleased(evt);
            }
        });

        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("Search");
        button2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout cards1Layout = new javax.swing.GroupLayout(cards1);
        cards1.setLayout(cards1Layout);
        cards1Layout.setHorizontalGroup(
            cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(cards1Layout.createSequentialGroup()
                        .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(20, 20, 20)
                        .addComponent(button2, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE))
                    .addGroup(cards1Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(43, 43, 43))
        );
        cards1Layout.setVerticalGroup(
            cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(cards1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Room Id", "Room Type", "Room Price", "Booking Date", "Expire Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(35);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout cards2Layout = new javax.swing.GroupLayout(cards2);
        cards2.setLayout(cards2Layout);
        cards2Layout.setHorizontalGroup(
            cards2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        cards2Layout.setVerticalGroup(
            cards2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addGap(5, 5, 5))
        );

        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel7.setOpaque(false);

        jLabel10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Rooms Day Price");
        jLabel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        textField3.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        textField3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField3.setHint("PAYMENT");

        textField4.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        textField4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField4.setHint("PAYMENT");
        textField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textField4KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("PAYMENT AMOUNT");
        jLabel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        button4.setForeground(new java.awt.Color(255, 255, 255));
        button4.setText("Print Invoice");
        button4.setToolTipText("");
        button4.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        button4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button4ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Balance");
        jLabel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        textField5.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        textField5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField5.setHint("BALANCE");

        button5.setForeground(new java.awt.Color(255, 255, 255));
        button5.setText("Save Invoice");
        button5.setToolTipText("");
        button5.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        button5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button5ActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Total");
        jLabel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        textField9.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        textField9.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField9.setHint("TOTAL");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(button4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("ID");
        jLabel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        textField2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField2.setHint("Customer Name ");

        textField6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField6.setHint("Customer Email ");

        textField7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField7.setHint("Customer Mobile");

        textField8.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField8.setHint("NIC");

        javax.swing.GroupLayout cards3Layout = new javax.swing.GroupLayout(cards3);
        cards3.setLayout(cards3Layout);
        cards3Layout.setHorizontalGroup(
            cards3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(cards3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(cards3Layout.createSequentialGroup()
                        .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(cards3Layout.createSequentialGroup()
                        .addGroup(cards3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(84, 84, 84)))
                .addGap(42, 42, 42))
        );
        cards3Layout.setVerticalGroup(
            cards3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cards3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(cards3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        button6.setForeground(new java.awt.Color(255, 255, 255));
        button6.setText("Reset");
        button6.setFont(new java.awt.Font("Ebrima", 1, 24)); // NOI18N
        button6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button6ActionPerformed(evt);
            }
        });

        textField10.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        textField10.setHint("INVOICE ID");
        textField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textField10ActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("Invoice ID");
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        javax.swing.GroupLayout setBackground1Layout = new javax.swing.GroupLayout(setBackground1);
        setBackground1.setLayout(setBackground1Layout);
        setBackground1Layout.setHorizontalGroup(
            setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setBackground1Layout.createSequentialGroup()
                .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cards1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cards3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(textField10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(32, 32, 32))
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cards2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        setBackground1Layout.setVerticalGroup(
            setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setBackground1Layout.createSequentialGroup()
                .addGroup(setBackground1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(cards2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(setBackground1Layout.createSequentialGroup()
                        .addGap(0, 0, 0)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cards1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cards3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        this.dispose();
        new Home1().setVisible(true);
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
         
        String booking_id = textField1.getText();
        if (booking_id.isEmpty()) {
            MessageAlerts.getInstance().showMessage("Empty Booking Id", "Booking Id is needed", MessageAlerts.MessageType.ERROR);
        } else {
            try {
                ResultSet rs = mySql.executeSearch("SELECT * FROM `booking` WHERE `booking`.`booking_id` = '" + booking_id + "'");
                if (rs.next()) {
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    model.setRowCount(0);
                    ResultSet rs1 = mySql.executeSearch("SELECT * FROM `booking` INNER JOIN `rooms` ON `booking`.`rooms_id` = `rooms`.`id`"
                            + " INNER JOIN `room_type` ON `rooms`.`room_type_id`= `room_type`.`id` INNER JOIN `customer` ON `booking`.`customer_id` = `customer`.`id`"
                            + "  WHERE `booking`.`booking_id` = '" + booking_id + "'");

                    int count = 0;
                    double room_price = 0;
                    while (rs1.next()) {
                        textField2.setText(rs1.getString("customer.first_name") + " " + rs1.getString("customer.last_name"));
                        textField6.setText(rs1.getString("customer.email"));
                        textField7.setText(rs1.getString("customer.mobile"));
                        textField8.setText(rs1.getString("customer.nic"));
                        jLabel15.setText(rs1.getString("customer.id"));
                        Vector vec = new Vector();
                        vec.add(rs1.getString("booking.id"));
                        vec.add(rs1.getString("rooms.room_id"));
                        vec.add(rs1.getString("room_type.type"));
                        vec.add(rs1.getString("booking.price"));
                        vec.add(rs1.getString("booking.booking_date"));
                        vec.add(rs1.getString("booking.expire_date"));
                        model.addRow(vec);
                        room_price += Double.parseDouble(rs1.getString("booking.price"));
                        count++;
                    }
                    jLabel14.setText(String.valueOf(count));
                    textField3.setText(String.valueOf(room_price));
                    textField3.setEnabled(false);
                    int row_count = jTable1.getRowCount();
                    double allroomsprice = 0;
                    if (row_count != 0) {
                        for (int i = 0; i < row_count; i++) {

                            LocalDate startDate = LocalDate.parse(jTable1.getValueAt(i, 4).toString());
                            LocalDate endDate = LocalDate.parse(jTable1.getValueAt(i, 5).toString());

                            // Calculate the difference in days
                            long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);

                            double room_prices = Double.parseDouble(String.valueOf(jTable1.getValueAt(i, 3)));
                            double allroomPrice = room_prices * daysBetween;
                            allroomsprice = allroomsprice + allroomPrice;
                        }

                    }
                    textField9.setText(String.valueOf((allroomsprice)));

                    textField9.setEnabled(false);
                    textField2.setEnabled(false);
                    textField6.setEnabled(false);
                    textField7.setEnabled(false);
                    textField8.setEnabled(false);
                    bookingalreadysave();
                } else {
                    notifi.show(Notifications.Type.ERROR, Notifications.Location.TOP_CENTER, ERROR, booking_id + "Is Invalid");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        AllBookings booking = new AllBookings();
        booking.setInvoice(this);
        booking.setVisible(true);

    }//GEN-LAST:event_button3ActionPerformed

    private void textField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField4KeyReleased
        balance();
        textField5.setEnabled(false);
    }//GEN-LAST:event_textField4KeyReleased

    private void button5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button5ActionPerformed
        try {
            if (textField1.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Booking Id Is empty");
            } else if (textField1.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Customer Name Is empty");
            } else if (textField6.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Customer Email Is empty");
            } else if (textField7.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Customer Mobile Is empty");
            } else if (textField8.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "NIC Is empty");
            } else if (textField3.getText().isEmpty()) {
                notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Room price Is empty ");
            } else {

                System.out.println(Double.parseDouble(textField5.getText()));

                if (Double.parseDouble(textField5.getText()) == 0.0) {
                    button4.setEnabled(true);
                    dataload();

                } else if (Double.parseDouble(textField4.getText()) != 0.0) {
                    ImageIcon icon = new ImageIcon("src/assets/information.svg");
                    int option = JOptionPane.showConfirmDialog(
                            this,
                            "Would you like to proceed with this invoice? The total amount is " + textField9.getText() + " and the remaining balance is " + textField5.getText() + ".",
                            "Confirmation",
                            JOptionPane.YES_NO_OPTION,
                            JOptionPane.INFORMATION_MESSAGE, icon
                    );

                    if (option == JOptionPane.YES_OPTION) {
                        dataload();
                        button4.setEnabled(true);
                    } else if (option == JOptionPane.NO_OPTION) {
                        button4.setEnabled(false);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_button5ActionPerformed

    private void button4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button4ActionPerformed
        saveandinsert();
    }//GEN-LAST:event_button4ActionPerformed

    private void button6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button6ActionPerformed
        reset();
    }//GEN-LAST:event_button6ActionPerformed

    private void textField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textField10ActionPerformed

    }//GEN-LAST:event_textField10ActionPerformed

    private void textField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textField1KeyReleased
        button2.doClick();
    }//GEN-LAST:event_textField1KeyReleased

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
                new Invoice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Button button1;
    private component.Button button2;
    private component.Button button3;
    private component.Button button4;
    private component.Button button5;
    private component.Button button6;
    private component.Cards cards1;
    private component.Cards cards2;
    private component.Cards cards3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private component.setBackground setBackground1;
    private component.setImage setImage1;
    private component.setImage setImage2;
    private component.TextField textField1;
    private component.TextField textField10;
    private component.TextField textField2;
    private component.TextField textField3;
    private component.TextField textField4;
    private component.TextField textField5;
    private component.TextField textField6;
    private component.TextField textField7;
    private component.TextField textField8;
    private component.TextField textField9;
    // End of variables declaration//GEN-END:variables

    private void balance() {
        double balance = 0;

        if (!textField4.getText().isEmpty() && textField4.getText().matches("[0-9.]+")) {

            double total = Double.parseDouble(textField9.getText());
            balance = total - Double.parseDouble(textField4.getText());
        } else {
            notifi.show(Notifications.Type.WARNING, Notifications.Location.TOP_CENTER, "Wrong Payment Type");
        }

        textField5.setText(String.valueOf(balance));

    }

    private String invoiceid() {
        return String.valueOf(System.currentTimeMillis());
    }

    private void reset() {
        textField1.setText("");
        textField2.setText("");
        textField6.setText("");
        textField7.setText("");
        textField8.setText("");
        textField3.setText("");
        textField9.setText("");
        textField4.setText("");
        textField5.setText("");
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        button4.setEnabled(false);
        textField10.setText("#" + invoiceid());
        textField10.setEditable(false);
    }

    private void saveandinsert() {
        try {
            String balance = textField5.getText();
            String invoice_id = textField10.getText();
            String payment_type = null;

            if (Double.parseDouble(balance) == 0) {
                payment_type = "Fully Paid";
            } else if (Double.parseDouble(balance) > 0) {
                payment_type = "Half Paid";
            } else {
                payment_type = "Undefined Payment Type";
            }

            HashMap<String, Object> parameters = new HashMap<>();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            parameters.put("date", sdf.format(new Date()));
            parameters.put("emplyee", login.firstName + " " + login.lastName);
            parameters.put("invoice_id", invoice_id);
            parameters.put("room_prices", String.valueOf(textField3.getText()));
            parameters.put("payment", String.valueOf(textField4.getText()));
            parameters.put("balance", String.valueOf(textField5.getText()));
            parameters.put("total", String.valueOf(textField9.getText()));
            parameters.put("payment_type", payment_type);
            parameters.put("image", "src/assets/logo.png");
            parameters.put("client_name", String.valueOf(textField2.getText()));
            parameters.put("client_email", String.valueOf(textField6.getText()));
            parameters.put("client_mobile", String.valueOf(textField7.getText()));
            JRTableModelDataSource dataSource = new JRTableModelDataSource(jTable1.getModel());
            JasperPrint report = JasperFillManager.fillReport("src/report/invoice.jasper", parameters, dataSource);

            JasperViewer.viewReport(report, false);
            JasperPrintManager.printReport(report, true);
            JasperExportManager.exportReportToPdfFile(report, invoice_id + ".pdf");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void dataload() {
        if (jTable1.getRowCount() != 0) {
               Date date = new Date();
                SimpleDateFormat Dateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                try {
                    mySql.executeIUD("INSERT INTO `invoice` (`id`,`invoice_date`,`about`,`customer_id`,`employee_id`,`paid`,`payment_full_price`,`room_count`) VALUES"
                            + " ('" + textField10.getText().trim().substring(1) + "','" + Dateformat.format(date) + "','Payment Not Completed','" + jLabel15.getText() + "','" + login.Employee_id + "','"+textField4.getText()+"','"+textField9.getText()+"','"+jTable1.getRowCount()+"')");

                    for (int i = 0; i < jTable1.getRowCount(); i++) {
                        mySql.executeIUD("INSERT INTO `invoice_has_booking` (`invoice_id`,`booking_id`,`rooms_id`)VALUES ('" + textField10.getText().trim().substring(1) + "','" + jTable1.getValueAt(i, 0) + "','" + roomsHashMap.get(jTable1.getValueAt(i, 1)) + "')");
                    }
                } catch (Exception e) {
                    e.printStackTrace();

                }
            

        }

    }

    private void bookingalreadysave() {
        boolean found = false;
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            String value = String.valueOf(jTable1.getValueAt(i, 0));
            try {
                ResultSet Rs = mySql.executeSearch("SELECT * FROM `invoice_has_booking` WHERE `booking_id` = '" + value + "'");
                if (Rs.next()) {
                    found = true;
                    System.out.println("yes");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (found) {
            button5.setEnabled(false);
            button4.setEnabled(true);
          
            JOptionPane.showMessageDialog(this, "This Booking already Saved", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }
}
