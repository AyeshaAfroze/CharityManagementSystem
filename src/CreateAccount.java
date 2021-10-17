
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
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
public class CreateAccount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAccount
     */
    public CreateAccount() {
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

        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        username = new javax.swing.JTextField();
        birthdate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        presentaddress = new javax.swing.JTextField();
        permanentaddress = new javax.swing.JTextField();
        nationality = new javax.swing.JTextField();
        gender = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        occupation = new javax.swing.JTextField();
        annualincome = new javax.swing.JTextField();
        password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        createaccount = new javax.swing.JButton();
        needy_donor = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel12.setText("jLabel12");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/light-blue-background.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        username.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 20, 290, 30));

        birthdate.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        birthdate.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(birthdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 60, 290, 30));

        jLabel8.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 0, 102));
        jLabel8.setText("Nationality");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 180, 100, 40));

        jLabel4.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 102));
        jLabel4.setText("Mail");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 260, 60, 40));

        presentaddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        presentaddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(presentaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 100, 290, 30));

        permanentaddress.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        permanentaddress.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel1.add(permanentaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 140, 290, 30));

        nationality.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(nationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 180, 290, 30));

        gender.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 220, 290, 30));

        mail.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel1.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 290, 30));

        phone.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 290, 30));

        occupation.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        occupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                occupationActionPerformed(evt);
            }
        });
        jPanel1.add(occupation, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 340, 290, 30));

        annualincome.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(annualincome, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 380, 290, 30));

        password.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jPanel1.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 290, 30));

        jLabel3.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 0, 102));
        jLabel3.setText("Date of Birth");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, 120, 40));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 102));
        jLabel2.setText("User Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, 110, 40));

        jLabel6.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 102));
        jLabel6.setText("Present Address");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 150, 40));

        jLabel7.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 0, 102));
        jLabel7.setText("Permanent Address ");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 170, 40));

        jLabel5.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 102));
        jLabel5.setText("Gender");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 70, 40));

        jLabel9.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 102));
        jLabel9.setText("Phone");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 300, 70, 40));

        jLabel10.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 102));
        jLabel10.setText("Occupation");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, 100, 40));

        jLabel11.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 102));
        jLabel11.setText("Annual Income");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 380, 130, 40));

        jLabel13.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 102));
        jLabel13.setText("Password");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 90, 30));

        createaccount.setBackground(new java.awt.Color(0, 51, 102));
        createaccount.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        createaccount.setForeground(new java.awt.Color(255, 255, 255));
        createaccount.setText("Sign Up");
        createaccount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 0, 153), 3, true));
        createaccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createaccountActionPerformed(evt);
            }
        });
        jPanel1.add(createaccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 530, 200, 30));

        needy_donor.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        needy_donor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Needy", "Donor", " " }));
        needy_donor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        needy_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                needy_donorActionPerformed(evt);
            }
        });
        jPanel1.add(needy_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 280, 40));

        jLabel16.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("CHARITY");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 180, 90));

        jButton1.setBackground(new java.awt.Color(204, 204, 255));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 51, 102));
        jButton1.setText("Log In");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 590, 160, 30));

        jLabel18.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(51, 0, 102));
        jLabel18.setText("Already have an account?");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 590, 230, -1));

        jLabel19.setFont(new java.awt.Font("Sylfaen", 3, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(51, 0, 102));
        jLabel19.setText("Create account as a-");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        jLabel20.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("SYSTEM");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 160, 90));

        jLabel21.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("MANAGEMENT");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 280, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/light-blue-background.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 1290, 640));

        jLabel22.setFont(new java.awt.Font("Candara", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("JOIN US BY CREATING AN ACCOUNT");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, 410, 100));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel14.setText("Create Account As a-");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 640));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void occupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_occupationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_occupationActionPerformed

    private void createaccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createaccountActionPerformed
        // TODO add your handling code here:
        
        
           try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
           
            
            {
               String value= (String)needy_donor.getSelectedItem();
              //  System.out.println(value);
               
               if( value.equals("Donor"))
               {
                
               // String A_id=String.valueOf(rs.getInt("A_id"));
               String d_name=username.getText();
               
               String d_birthdate=birthdate.getText();
               String d_presentaddress=presentaddress.getText();
               String d_permanentaddress=permanentaddress.getText();
               String d_nationality=nationality.getText();
               String d_gender=gender.getText();
               String d_mail=mail.getText();
               String d_phone=phone.getText();
               String d_occupation=occupation.getText();
               String d_annualincome=annualincome.getText();
               char d_password[] =password.getPassword();
                String ppn =new String(d_password);
                System.out.println(d_name);
                
              
               
           //     ResultSet rs = statement
                statement.executeUpdate("insert into donordetails (D_name,D_dob,D_presentaddress,D_permanentaddress,D_nationality,D_gender,D_mail,D_phone,D_occupation,D_annualincome,D_password)"
                        + " values ('"+d_name+"','"+d_birthdate+"','"+d_presentaddress+"','"+d_permanentaddress+"','"+d_nationality+"','"+d_gender+"','"+d_mail+"','"+d_phone+"','"+d_occupation+"','"+d_annualincome+"','"+ppn+"')");
               
               JOptionPane.showMessageDialog(null,"Account Created Sucessfully!");
               
               
               
               } 
               else if(value.equals("Needy"))
                       {
                            String n_name=username.getText();
                           
               
                           

                          String n_birthdate=birthdate.getText();
                          //String n_birthdate = String.valueOf(birthdate.getText());
                            String n_presentaddress=presentaddress.getText();
                            String n_permanentaddress=permanentaddress.getText();
                            String n_nationality=nationality.getText();
                            String n_gender=gender.getText();
                            String n_mail=mail.getText();
                            String n_phone=phone.getText();
                            String n_occupation=occupation.getText();
                            String n_annualincome=annualincome.getText();
                            char n_password[] =password.getPassword();
                            String pn =new String(n_password);
                            System.out.println(pn);
                            
                            statement.executeUpdate("insert into needydetails (N_name,N_dob,N_presentaddress,N_permanentaddress,N_nationality,N_gender,N_mail,N_phone,N_occupation,N_annualincome,N_password)"
                        + " values ('"+n_name+"','"+n_birthdate+"','"+n_presentaddress+"','"+n_permanentaddress+"','"+n_nationality+"','"+n_gender+"','"+n_mail+"','"+n_phone+"','"+n_occupation+"','"+n_annualincome+"','"+pn+"')");
                           
                           

                              JOptionPane.showMessageDialog(null,"Account Created Sucessfully!");


                       }// statement.executeUpdate("insert into donordetails"
                    //+"values ('hhh',d_birthdate,d_pressentaddress,d_permanentaddress,d_nationality,d_gender,d_mail,d_phone,d_occupation,d_annualincome)");
       
              //   PreparedStatement preparedStmt = connection.prepareStatement(insert);
              //  preparedStmt.execute();
                                    
                        
               //   String tbData[]={A_id,A_name,A_mail,A_gender,A_dob,A_address,A_phoneNo};
                   
               //   DefaultTableModel tblModel=(DefaultTableModel)admindetailstable.getModel();
                //  tblModel.addRow(tbData);
                 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_createaccountActionPerformed

    private void needy_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_needy_donorActionPerformed
        // TODO add your handling code here:
        
        //String  s=
    }//GEN-LAST:event_needy_donorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Login d=new Login();
        d.show();
        dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAccount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAccount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField annualincome;
    private javax.swing.JTextField birthdate;
    private javax.swing.JButton createaccount;
    private javax.swing.JTextField gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nationality;
    private javax.swing.JComboBox<String> needy_donor;
    private javax.swing.JTextField occupation;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField permanentaddress;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField presentaddress;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
