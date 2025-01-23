
package gui;

import javax.swing.JDialog;
import model.mySql;
import java.sql.ResultSet;


public class Employeedetails extends JDialog {
String email ;
    public Employeedetails(String email) {
        initComponents();
        
        loaduserdata();
        this.email=email;
    }
 private void loaduserdata() {
    try {
       ResultSet rs = mySql.executeSearch("SELECT * FROM `employee` WHERE `email` ='"+email+"' ");
        if (rs.next()) {
            jLabel2.setText(email);
            String fullname=rs.getString("first_name") +" "+ rs.getString("last_name");
            jLabel11.setText(fullname);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
            }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setImage1 = new component.setImage();
        jLabel1 = new javax.swing.JLabel();
        setImage2 = new component.setImage();
        setBackground1 = new component.setBackground();
        cards1 = new component.Cards();
        roundedImage1 = new component.roundedImage();
        jLabel11 = new javax.swing.JLabel();
        dialogform1 = new component.dialogform();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dialogform6 = new component.dialogform();
        jLabel7 = new javax.swing.JLabel();
        dialogform2 = new component.dialogform();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dialogform7 = new component.dialogform();
        jLabel8 = new javax.swing.JLabel();
        dialogform3 = new component.dialogform();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        dialogform8 = new component.dialogform();
        jLabel9 = new javax.swing.JLabel();
        dialogform4 = new component.dialogform();
        jLabel16 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dialogform9 = new component.dialogform();
        jLabel10 = new javax.swing.JLabel();
        dialogform5 = new component.dialogform();
        jLabel15 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dialogform10 = new component.dialogform();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/login_background.jpeg"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Employee Manegment");
        setImage1.add(jLabel1);
        jLabel1.setBounds(170, 20, 430, 60);

        setImage2.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/logo.png"))); // NOI18N
        setImage1.add(setImage2);
        setImage2.setBounds(40, 10, 110, 80);

        getContentPane().add(setImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 120));

        cards1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roundedImage1.setImage(new javax.swing.ImageIcon(getClass().getResource("/assets/d1.jpeg"))); // NOI18N
        cards1.add(roundedImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 107, 107));

        jLabel11.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Name");
        cards1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 300, -1));

        dialogform1.setBasicStroke(4);

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Test@gmail.com");

        jLabel12.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Email  :");

        dialogform6.setColor1(new java.awt.Color(227, 227, 227));
        dialogform6.setColor2(new java.awt.Color(255, 255, 255));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/email.png"))); // NOI18N

        javax.swing.GroupLayout dialogform6Layout = new javax.swing.GroupLayout(dialogform6);
        dialogform6.setLayout(dialogform6Layout);
        dialogform6Layout.setHorizontalGroup(
            dialogform6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogform6Layout.setVerticalGroup(
            dialogform6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogform1Layout = new javax.swing.GroupLayout(dialogform1);
        dialogform1.setLayout(dialogform1Layout);
        dialogform1Layout.setHorizontalGroup(
            dialogform1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(dialogform6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        dialogform1Layout.setVerticalGroup(
            dialogform1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dialogform1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(dialogform1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogform6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards1.add(dialogform1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 510, 60));

        dialogform2.setBasicStroke(4);

        jLabel13.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Mobile   :");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("011*******");

        dialogform7.setColor1(new java.awt.Color(204, 204, 204));
        dialogform7.setColor2(new java.awt.Color(255, 255, 255));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/phone.png"))); // NOI18N

        javax.swing.GroupLayout dialogform7Layout = new javax.swing.GroupLayout(dialogform7);
        dialogform7.setLayout(dialogform7Layout);
        dialogform7Layout.setHorizontalGroup(
            dialogform7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogform7Layout.setVerticalGroup(
            dialogform7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogform2Layout = new javax.swing.GroupLayout(dialogform2);
        dialogform2.setLayout(dialogform2Layout);
        dialogform2Layout.setHorizontalGroup(
            dialogform2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(dialogform7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        dialogform2Layout.setVerticalGroup(
            dialogform2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dialogform2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12))
            .addGroup(dialogform2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogform7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards1.add(dialogform2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 510, -1));

        dialogform3.setBasicStroke(4);

        jLabel14.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Joined Date  :");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("2024/10/1");

        dialogform8.setColor1(new java.awt.Color(204, 204, 204));
        dialogform8.setColor2(new java.awt.Color(255, 255, 255));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/calendar.png"))); // NOI18N

        javax.swing.GroupLayout dialogform8Layout = new javax.swing.GroupLayout(dialogform8);
        dialogform8.setLayout(dialogform8Layout);
        dialogform8Layout.setHorizontalGroup(
            dialogform8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        dialogform8Layout.setVerticalGroup(
            dialogform8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout dialogform3Layout = new javax.swing.GroupLayout(dialogform3);
        dialogform3.setLayout(dialogform3Layout);
        dialogform3Layout.setHorizontalGroup(
            dialogform3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(dialogform8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addGap(36, 36, 36))
        );
        dialogform3Layout.setVerticalGroup(
            dialogform3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(dialogform3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogform8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards1.add(dialogform3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 510, 60));

        dialogform4.setBasicStroke(4);

        jLabel16.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Address  :");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("No 56 Dibbadida Rd");

        dialogform9.setColor1(new java.awt.Color(204, 204, 204));
        dialogform9.setColor2(new java.awt.Color(255, 255, 255));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/address.png"))); // NOI18N

        javax.swing.GroupLayout dialogform9Layout = new javax.swing.GroupLayout(dialogform9);
        dialogform9.setLayout(dialogform9Layout);
        dialogform9Layout.setHorizontalGroup(
            dialogform9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogform9Layout.setVerticalGroup(
            dialogform9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogform4Layout = new javax.swing.GroupLayout(dialogform4);
        dialogform4.setLayout(dialogform4Layout);
        dialogform4Layout.setHorizontalGroup(
            dialogform4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform4Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(dialogform9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        dialogform4Layout.setVerticalGroup(
            dialogform4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(dialogform4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogform9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards1.add(dialogform4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        dialogform5.setBasicStroke(4);

        jLabel15.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Notes  :");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("More.........");

        dialogform10.setColor1(new java.awt.Color(204, 204, 204));
        dialogform10.setColor2(new java.awt.Color(255, 255, 255));
        dialogform10.setPreferredSize(new java.awt.Dimension(50, 51));

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/notes.png"))); // NOI18N

        javax.swing.GroupLayout dialogform10Layout = new javax.swing.GroupLayout(dialogform10);
        dialogform10.setLayout(dialogform10Layout);
        dialogform10Layout.setHorizontalGroup(
            dialogform10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );
        dialogform10Layout.setVerticalGroup(
            dialogform10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout dialogform5Layout = new javax.swing.GroupLayout(dialogform5);
        dialogform5.setLayout(dialogform5Layout);
        dialogform5Layout.setHorizontalGroup(
            dialogform5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform5Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(dialogform10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        dialogform5Layout.setVerticalGroup(
            dialogform5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogform5Layout.createSequentialGroup()
                .addContainerGap(15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(dialogform5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogform5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dialogform10, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        cards1.add(dialogform5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 510, -1, 60));

        setBackground1.add(cards1);
        cards1.setBounds(60, 20, 550, 590);

        getContentPane().add(setBackground1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 650, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Employeedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employeedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employeedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employeedetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new Employeedetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private component.Cards cards1;
    private component.dialogform dialogform1;
    private component.dialogform dialogform10;
    private component.dialogform dialogform2;
    private component.dialogform dialogform3;
    private component.dialogform dialogform4;
    private component.dialogform dialogform5;
    private component.dialogform dialogform6;
    private component.dialogform dialogform7;
    private component.dialogform dialogform8;
    private component.dialogform dialogform9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private component.roundedImage roundedImage1;
    private component.setBackground setBackground1;
    private component.setImage setImage1;
    private component.setImage setImage2;
    // End of variables declaration//GEN-END:variables

   
}
