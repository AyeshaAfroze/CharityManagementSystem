
import connectmssql.ConnectMSSQL;
import java.awt.TextField;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class Login extends javax.swing.JFrame {

    String u, e, A_name, A_pass, A_mail;
    char a[];
    //public String nd;
    public String nd;

    /**
     * Creates new form Login
     */
    public Login() {

        //String nd;
        //String nd;  
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

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        LOGIN = new javax.swing.JButton();
        passwordtext = new javax.swing.JPasswordField();
        EmailText = new javax.swing.JTextField();
        userText = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        admin_donor_needy = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 153, 255));
        jButton2.setText("Sign Up");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 3, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 490, 130, 50));

        LOGIN.setBackground(new java.awt.Color(51, 0, 204));
        LOGIN.setFont(new java.awt.Font("Footlight MT Light", 1, 24)); // NOI18N
        LOGIN.setForeground(new java.awt.Color(255, 255, 255));
        LOGIN.setText("Log In");
        LOGIN.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        LOGIN.setBorderPainted(false);
        LOGIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGINActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 490, 110, 50));

        passwordtext.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        passwordtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtextActionPerformed(evt);
            }
        });
        jPanel1.add(passwordtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 350, 270, 40));

        EmailText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        EmailText.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        EmailText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailTextActionPerformed(evt);
            }
        });
        jPanel1.add(EmailText, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, 270, 40));

        userText.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        userText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTextActionPerformed(evt);
            }
        });
        jPanel1.add(userText, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 270, 40));

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Login as-");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 420, 130, 30));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("Email :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 280, 80, 40));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 102));
        jLabel1.setText("UserName : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, -1, 40));

        admin_donor_needy.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        admin_donor_needy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Donor", "Needy", " ", " " }));
        admin_donor_needy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_donor_needyActionPerformed(evt);
            }
        });
        jPanel1.add(admin_donor_needy, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 100, 30));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText(" Log In Page");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 60, 290, 100));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 580, 620));

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHARITY");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 90));

        jLabel21.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MANAGEMENT");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 280, 100));

        jLabel20.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("SYSTEM");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, 90));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 620));

        jLabel7.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Password : ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 130, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1090, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void userTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_userTextActionPerformed

    private void EmailTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailTextActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_EmailTextActionPerformed

    private void passwordtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordtextActionPerformed

    private void LOGINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGINActionPerformed
        // TODO add your handling code here:
        boolean f=true;

        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();

            u = userText.getText();
            e = EmailText.getText();
            a = passwordtext.getPassword();
            String p = new String(a);
            String A_name, A_pass, A_mail;
            String value = (String) admin_donor_needy.getSelectedItem();

            if (value.equals("Admin")) {
                ResultSet rs = statement
                        .executeQuery("SELECT * FROM loginAdmin");

                while (rs.next()) {

                    A_name = rs.getString("A_name");
                    A_pass = rs.getString("A_pass");
                    A_mail = rs.getString("A_mail");

                    if (u.equals(A_name) && e.equals(A_mail) && p.equals(A_pass)) {
                          f=false;

                        AdminTop A = new AdminTop();
                        A.show();
                        dispose(); //admin page a jbe

                    }

                }
                
                  if(f==true)
                    JOptionPane.showMessageDialog(null,"Login Failed!");
                
               //  JOptionPane.showMessageDialog(null,"Login Failed!");
            } else if (value.equals("Needy")) {
                ResultSet rs = statement
                        .executeQuery("SELECT N_id,N_name,N_mail,N_password FROM needydetails");

                while (rs.next()) {

                    A_name = rs.getString("N_name");
                    A_pass = rs.getString("N_password");
                    A_mail = rs.getString("N_mail");

                    if (u.equals(A_name) && e.equals(A_mail) && p.equals(A_pass)) {
                          f=false;

//Login l=new Login();  
                        nd = String.valueOf(rs.getInt("N_id"));
                        System.out.println(nd);
                        NeedyTop A = new NeedyTop(nd);
                        A.setVisible(true);
                        setVisible(false);
                       

                    } else {

                    }

                    //  System.out.println("wrong info");
                }
                
                 if(f==true)
                    JOptionPane.showMessageDialog(null,"Login Failed!");
                
               //  JOptionPane.showMessageDialog(null,"Login Failed!");
            } else if (value.equals("Donor")) {
                ResultSet rs = statement
                        .executeQuery("SELECT D_id,D_name,D_mail,D_password FROM donordetails");

                while (rs.next()) {

                    A_name = rs.getString("D_name");
                    A_pass = rs.getString("D_password");
                    A_mail = rs.getString("D_mail");                  

                    if (u.equals(A_name) && e.equals(A_mail) && p.equals(A_pass)) {
                        nd = String.valueOf(rs.getInt("D_id"));
                        System.out.println(nd);
                        f=false;

                        // u=String.valueOf(rs.getInt("Order_Id"));
                        DonorTop A = new DonorTop(nd);
                        A.setVisible(true);
                        setVisible(false);
                      // break;
                        //admin page a jbe

                    } //else {           
                      //   JOptionPane.showMessageDialog(null,"Login Failed!");
                       //   break;
                         
                        
                          

                   // }

                }
                
              //    JOptionPane.showMessageDialog(null,"Login Failed!");
                if(f==true)
                    JOptionPane.showMessageDialog(null,"Login Failed!");
                    
               
            }
             

        } catch (Exception e) {
            e.printStackTrace();


    }//GEN-LAST:event_LOGINActionPerformed
    }
    private void admin_donor_needyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_donor_needyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_admin_donor_needyActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        CreateAccount d = new CreateAccount();
        d.show();
        dispose();


    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     *
     * }
     *
     *
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField EmailText;
    private javax.swing.JButton LOGIN;
    private javax.swing.JComboBox<String> admin_donor_needy;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordtext;
    private javax.swing.JTextField userText;
    // End of variables declaration//GEN-END:variables
}
