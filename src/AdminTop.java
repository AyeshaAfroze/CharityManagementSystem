/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
public class AdminTop extends javax.swing.JFrame {

    /**
     * Creates new form AdminTop
     */
    public AdminTop() {
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

        viewnotrequested = new javax.swing.JButton();
        viewneedy = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        viewdonor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        ViewDonation = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        viewrecords = new javax.swing.JButton();
        viewrequest1 = new javax.swing.JButton();
        viewmonth1 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        viewnotrequested.setBackground(new java.awt.Color(102, 102, 102));
        viewnotrequested.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewnotrequested.setForeground(new java.awt.Color(255, 255, 255));
        viewnotrequested.setText("View Unrequested Products");
        viewnotrequested.setMaximumSize(new java.awt.Dimension(171, 39));
        viewnotrequested.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewnotrequestedActionPerformed(evt);
            }
        });
        getContentPane().add(viewnotrequested, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 470, 410, 40));

        viewneedy.setBackground(new java.awt.Color(102, 102, 102));
        viewneedy.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewneedy.setForeground(new java.awt.Color(255, 255, 255));
        viewneedy.setText("View Needy Details");
        viewneedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewneedyActionPerformed(evt);
            }
        });
        getContentPane().add(viewneedy, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 270, 410, 40));

        jButton6.setBackground(new java.awt.Color(102, 102, 102));
        jButton6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("View Admin Profile");
        jButton6.setMaximumSize(new java.awt.Dimension(171, 39));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 410, 40));

        viewdonor.setBackground(new java.awt.Color(102, 102, 102));
        viewdonor.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewdonor.setForeground(new java.awt.Color(255, 255, 255));
        viewdonor.setText("View Donor Details");
        viewdonor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        viewdonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewdonorActionPerformed(evt);
            }
        });
        getContentPane().add(viewdonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 410, 40));

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Log Out");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        ViewDonation.setBackground(new java.awt.Color(102, 102, 102));
        ViewDonation.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        ViewDonation.setForeground(new java.awt.Color(255, 255, 255));
        ViewDonation.setText("View Donations");
        ViewDonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewDonationActionPerformed(evt);
            }
        });
        getContentPane().add(ViewDonation, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 410, 40));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ADMIN HOME PAGE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, 490, 70));

        viewrecords.setBackground(new java.awt.Color(102, 102, 102));
        viewrecords.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewrecords.setForeground(new java.awt.Color(255, 255, 255));
        viewrecords.setText("View Records");
        viewrecords.setMaximumSize(new java.awt.Dimension(171, 39));
        viewrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrecordsActionPerformed(evt);
            }
        });
        getContentPane().add(viewrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 410, 40));

        viewrequest1.setBackground(new java.awt.Color(102, 102, 102));
        viewrequest1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewrequest1.setForeground(new java.awt.Color(255, 255, 255));
        viewrequest1.setText("View Requests");
        viewrequest1.setMaximumSize(new java.awt.Dimension(171, 39));
        viewrequest1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewrequest1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewrequest1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 190, 410, -1));

        viewmonth1.setBackground(new java.awt.Color(102, 102, 102));
        viewmonth1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        viewmonth1.setForeground(new java.awt.Color(255, 255, 255));
        viewmonth1.setText("View Monthly Report");
        viewmonth1.setMaximumSize(new java.awt.Dimension(171, 39));
        viewmonth1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewmonth1ActionPerformed(evt);
            }
        });
        getContentPane().add(viewmonth1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 410, 40));

        jButton9.setBackground(new java.awt.Color(102, 102, 102));
        jButton9.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("View Ratings");
        jButton9.setMaximumSize(new java.awt.Dimension(171, 39));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 430, 410, 40));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel3.setText("ADMIN HOME PAGE");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewneedyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewneedyActionPerformed
        Needy d=new Needy();
        d.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_viewneedyActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Admin d=new Admin();
        d.show();
        dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void viewdonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewdonorActionPerformed
        Donor d=new Donor();
        d.show();
        dispose();// TODO add your handling code here:
    }//GEN-LAST:event_viewdonorActionPerformed

    private void viewnotrequestedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewnotrequestedActionPerformed
        // TODO add your handling code here:
         nottaken d=new nottaken();
        d.show();
        dispose();
        
        
        
        
        
        
    }//GEN-LAST:event_viewnotrequestedActionPerformed

    private void viewrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrecordsActionPerformed
        // TODO add your handling code here:
        
        recordforadmin d=new recordforadmin();
        d.show();
        dispose();
    }//GEN-LAST:event_viewrecordsActionPerformed

    private void ViewDonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewDonationActionPerformed
        // TODO add your handling code here:
        donationdetails d=new donationdetails();
        d.show();
        dispose();
    }//GEN-LAST:event_ViewDonationActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
      
        Login d=new Login();
        d.show();
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void viewrequest1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewrequest1ActionPerformed
        // TODO add your handling code here:
           Request d=new Request();
        d.show();
        dispose();
        
    }//GEN-LAST:event_viewrequest1ActionPerformed

    private void viewmonth1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewmonth1ActionPerformed
        // TODO add your handling code here:
        
          MonthlyPerformance d=new MonthlyPerformance();
        d.show();
        dispose();
    }//GEN-LAST:event_viewmonth1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
           Ratings d=new Ratings();
        d.show();
        dispose();
    }//GEN-LAST:event_jButton9ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(AdminTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminTop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminTop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ViewDonation;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton viewdonor;
    private javax.swing.JButton viewmonth1;
    private javax.swing.JButton viewneedy;
    private javax.swing.JButton viewnotrequested;
    private javax.swing.JButton viewrecords;
    private javax.swing.JButton viewrequest1;
    // End of variables declaration//GEN-END:variables
}
