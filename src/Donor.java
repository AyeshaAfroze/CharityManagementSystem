
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class Donor extends javax.swing.JFrame {

    /**
     * Creates new form Donor
     */
    public Donor() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        showdonor = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        Dsearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        Dok = new javax.swing.JButton();
        searchbydonor = new javax.swing.JComboBox<>();
        cleardonor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showdonor.setBackground(new java.awt.Color(204, 204, 204));
        showdonor.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        showdonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D_ID", "D_Name", "D_dob", "D_presentaddress", "D_permanentaddress", "D_nationality", "D_gender", "D_mail", "D_phone", "D_occupation", "D_annualincome"
            }
        ));
        showdonor.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setViewportView(showdonor);
        if (showdonor.getColumnModel().getColumnCount() > 0) {
            showdonor.getColumnModel().getColumn(2).setResizable(false);
            showdonor.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 1080, 340));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Show All Data");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 170, 40));

        Dsearch.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        Dsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DsearchActionPerformed(evt);
            }
        });
        getContentPane().add(Dsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 280, 40));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton4.setText("Log Out");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 110, 30));

        Dok.setBackground(new java.awt.Color(153, 153, 153));
        Dok.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        Dok.setText("OK");
        Dok.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        Dok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DokActionPerformed(evt);
            }
        });
        getContentPane().add(Dok, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 200, 120, 40));

        searchbydonor.setBackground(new java.awt.Color(153, 153, 153));
        searchbydonor.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        searchbydonor.setMaximumRowCount(3);
        searchbydonor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Name", "Search By Donated Products", "Search By Annual Income" }));
        searchbydonor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        getContentPane().add(searchbydonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 40));

        cleardonor.setBackground(new java.awt.Color(153, 153, 153));
        cleardonor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        cleardonor.setText("Clear Table");
        cleardonor.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        cleardonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleardonorActionPerformed(evt);
            }
        });
        getContentPane().add(cleardonor, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 170, 40));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1217, 745, -1, -1));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 20, -1, -1));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("Algerian", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("donor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 190, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet rs = statement
                    .executeQuery("SELECT D_id,D_name,D_dob,D_presentaddress,D_permanentaddress,D_nationality,D_gender,D_mail,D_phone,D_occupation,D_annualincome FROM donorDetails");

            while (rs.next()) {
                String D_id = String.valueOf(rs.getInt("D_id"));
                String D_name = rs.getString("D_name");
                String D_dob = String.valueOf(rs.getInt("D_dob"));

                String D_presentaddress = rs.getString("D_presentaddress");
                String D_permanentaddress = rs.getString("D_permanentaddress");
                String D_nationality = rs.getString("D_nationality");
                String D_gender = rs.getString("D_gender");
                String D_mail = rs.getString("D_mail");

                String D_phone = String.valueOf(rs.getInt("D_phone"));

                String D_occupation = rs.getString("D_occupation");
                String D_annualincome = String.valueOf(rs.getInt("D_annualincome"));

                String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                DefaultTableModel tblModel = (DefaultTableModel) showdonor.getModel();
                tblModel.addRow(tbData);

            }

        } catch (Exception e) {
            e.printStackTrace();
        } // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void DsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DsearchActionPerformed

    private void DokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DokActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            String value = (String) searchbydonor.getSelectedItem();
            String ida = Dsearch.getText();
            System.out.println(ida);
            if (value.equals("Search By Name")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("SELECT * from donordetails WHERE D_name ='" + ida + "' ");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("D_id"));
                    String D_name = rs.getString("D_name");
                    String D_dob = String.valueOf(rs.getInt("D_dob"));

                    String D_presentaddress = rs.getString("D_presentaddress");
                    String D_permanentaddress = rs.getString("D_permanentaddress");
                    String D_nationality = rs.getString("D_nationality");
                    String D_gender = rs.getString("D_gender");
                    String D_mail = rs.getString("D_mail");

                    String D_phone = String.valueOf(rs.getInt("D_phone"));

                    String D_occupation = rs.getString("D_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("D_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showdonor.getModel();
                    tblModel.addRow(tbData);

                }
            }
            
            if (value.equals("Search By Donated Products")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("select * from Donordetails where d_id in \n" +
"    (select D_id from records group by d_id having count(sl)='" + ida + "')");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("D_id"));
                    String D_name = rs.getString("D_name");
                    String D_dob = String.valueOf(rs.getInt("D_dob"));

                    String D_presentaddress = rs.getString("D_presentaddress");
                    String D_permanentaddress = rs.getString("D_permanentaddress");
                    String D_nationality = rs.getString("D_nationality");
                    String D_gender = rs.getString("D_gender");
                    String D_mail = rs.getString("D_mail");

                    String D_phone = String.valueOf(rs.getInt("D_phone"));

                    String D_occupation = rs.getString("D_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("D_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showdonor.getModel();
                    tblModel.addRow(tbData);

                }
            }
            
            if (value.equals("Search By Annual Income")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("select * from DonorDetails e1 where e1.D_annualincome >\n" +
"(select D_annualincome from DonorDetails e2 where e1.D_annualincome>e2.D_annualincome and e2.D_name = '" + ida + "')");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("D_id"));
                    String D_name = rs.getString("D_name");
                    String D_dob = String.valueOf(rs.getInt("D_dob"));

                    String D_presentaddress = rs.getString("D_presentaddress");
                    String D_permanentaddress = rs.getString("D_permanentaddress");
                    String D_nationality = rs.getString("D_nationality");
                    String D_gender = rs.getString("D_gender");
                    String D_mail = rs.getString("D_mail");

                    String D_phone = String.valueOf(rs.getInt("D_phone"));

                    String D_occupation = rs.getString("D_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("D_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showdonor.getModel();
                    tblModel.addRow(tbData);

                }
            }

                //  String productid=String.valueOf(rs.getInt("productid"));
                //  statement.executeUpdate("insert into records (D_id,productid)"
                //        + " values ('"+D_id+"','"+productid+"')");
                //    String tbData[]={N_id,N_name,N_dob,N_presentaddress,N_permanentaddress,N_nationality,N_gender,N_mail,N_phone,N_occupation,N_annualincome};
                //  DefaultTableModel tblModel=(DefaultTableModel)showneedytable.getModel();
                // tblModel.addRow(tbData);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_DokActionPerformed

    private void cleardonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleardonorActionPerformed
        // TODO add your handling code here:
         showdonor.setModel(new DefaultTableModel(null,new String [] {"D_ID","D_Name","D_dob","D_presentaddress","D_permanentaddress","D_nationality","D_gender","D_mail",
             "D_phone","D_occupation","D_annualincome"}));
    }//GEN-LAST:event_cleardonorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

       // String x= ID.getText();
     AdminTop A = new AdminTop();
        A.setVisible(true);
        setVisible(false);

    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Dok;
    private javax.swing.JTextField Dsearch;
    private javax.swing.JButton cleardonor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> searchbydonor;
    private javax.swing.JTable showdonor;
    // End of variables declaration//GEN-END:variables
}
