/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package form;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author saurabhshanbhag
 */
public class Manager extends javax.swing.JFrame {

    /** Creates new form Manager */
    public Manager() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        manageHotel = new javax.swing.JButton();
        manageStaff = new javax.swing.JButton();
        manageRooms = new javax.swing.JButton();
        generateReport = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Home = new javax.swing.JButton();
        Logout = new javax.swing.JButton();
        addService = new javax.swing.JButton();
        manageRoomPrice = new javax.swing.JButton();

        jLabel2.setText("Please Choose Task:");

        jLabel1.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel1.setText("Wolf Inns");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        manageHotel.setText("Manage Hotels");
        buttonGroup1.add(manageHotel);
        manageHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageHotelActionPerformed(evt);
            }
        });

        manageStaff.setText("Manage Staff");
        buttonGroup1.add(manageStaff);
        manageStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageStaffActionPerformed(evt);
            }
        });

        manageRooms.setText("Manage Rooms");
        buttonGroup1.add(manageRooms);
        manageRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomsActionPerformed(evt);
            }
        });

        generateReport.setText("Generate Report");
        buttonGroup1.add(generateReport);
        generateReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateReportActionPerformed(evt);
            }
        });

        jLabel3.setText("Please Choose Task:");

        jLabel4.setFont(new java.awt.Font("Silom", 2, 24)); // NOI18N
        jLabel4.setText("Wolf Inns");

        Home.setText("Home");
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        Logout.setText("Logout");
        Logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutActionPerformed(evt);
            }
        });

        addService.setText("Manage Service Type");
        buttonGroup1.add(addService);
        addService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceActionPerformed(evt);
            }
        });

        manageRoomPrice.setText("Manage RoomPrice");
        buttonGroup1.add(manageRoomPrice);
        manageRoomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRoomPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(Home)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Logout)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(190, 190, 190))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(addService, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(manageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(manageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(manageHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 361, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageHotel, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageRooms, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateReport, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addService, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageRoomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Home)
                    .addComponent(Logout))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void manageHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageHotelActionPerformed
        // TODO add your handling code here:
       
            //open add record form
            ManageHotel mh = new ManageHotel();
            sysExit();
            mh.setVisible(true);
      
            //open update record form
            
       
            //open delete record form
            
      
    }//GEN-LAST:event_manageHotelActionPerformed

    private void manageStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageStaffActionPerformed
        // TODO add your handling code here:
            ManageStaff ms = new ManageStaff();
            sysExit();
            ms.setVisible(true);
            
    }//GEN-LAST:event_manageStaffActionPerformed

    private void manageRoomsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomsActionPerformed
        // TODO add your handling code here:
            ManageRoom mr = new ManageRoom();
            sysExit();
            mr.setVisible(true);
    }//GEN-LAST:event_manageRoomsActionPerformed

    private void generateReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateReportActionPerformed
        // TODO add your handling code here:

        Reports gr = new Reports();
        sysExit();
            gr.setVisible(true);
    }//GEN-LAST:event_generateReportActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        // TODO add your handling code here:
        Manager mng = new Manager();
        sysExit();
        mng.setVisible(true);
    }//GEN-LAST:event_HomeActionPerformed

    private void LogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutActionPerformed
        // TODO add your handling code here:
        Login l = new Login();
        sysExit();
        l.setVisible(true);
    }//GEN-LAST:event_LogoutActionPerformed

    private void addServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addServiceActionPerformed
        // TODO add your handling code here:
        ManageNewService l = new ManageNewService();
        sysExit();
        l.setVisible(true);
        
    }//GEN-LAST:event_addServiceActionPerformed

    private void manageRoomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRoomPriceActionPerformed
        
        ManageRoomPrice l = new ManageRoomPrice();
        sysExit();
        l.setVisible(true);
        
        
        
    }//GEN-LAST:event_manageRoomPriceActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }
    
                                    

    
    public void sysExit(){
        WindowEvent winClosing = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosing);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Home;
    private javax.swing.JButton Logout;
    private javax.swing.JButton addService;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton generateReport;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton manageHotel;
    private javax.swing.JButton manageRoomPrice;
    private javax.swing.JButton manageRooms;
    private javax.swing.JButton manageStaff;
    // End of variables declaration//GEN-END:variables

}
