
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
public class Needy extends javax.swing.JFrame {

    /**
     * Creates new form Needy
     */
    public Needy() {
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
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        showneedytable = new javax.swing.JTable();
        showneedy = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Nsearch = new javax.swing.JTextField();
        Nok = new javax.swing.JButton();
        searchbyneedy = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        showneedytable.setBackground(new java.awt.Color(153, 153, 153));
        showneedytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N_id", "N_name", "N_dob", "N_presentaddress", "N_permanentaddress", "N_nationality", "N_gender", "N_mail", "N_phone", "N_occupation", "N_annualincome"
            }
        ));
        showneedytable.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jScrollPane2.setViewportView(showneedytable);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 1080, 320));

        showneedy.setBackground(new java.awt.Color(153, 153, 153));
        showneedy.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        showneedy.setText("Show All Data");
        showneedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showneedyActionPerformed(evt);
            }
        });
        getContentPane().add(showneedy, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 190, 40));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 490, 1290, 40));

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("             Seeker");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 390, 80));

        Nsearch.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        getContentPane().add(Nsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 290, 40));

        Nok.setBackground(new java.awt.Color(153, 153, 153));
        Nok.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        Nok.setText("OK");
        Nok.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 2, true));
        Nok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NokActionPerformed(evt);
            }
        });
        getContentPane().add(Nok, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 70, 40));

        searchbyneedy.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        searchbyneedy.setMaximumRowCount(3);
        searchbyneedy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Search By Name", "Search By Taken Products", "Search By Annual Income" }));
        searchbyneedy.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        searchbyneedy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbyneedyActionPerformed(evt);
            }
        });
        getContentPane().add(searchbyneedy, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 190, 40));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Clear Table");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 100, 30));

        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton3.setText("Log Out");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 3, true));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 100, 40));

        jButton5.setBackground(new java.awt.Color(102, 102, 102));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 30, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showneedyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showneedyActionPerformed
      try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet rs = statement
                    .executeQuery("SELECT N_id,N_name,N_dob,N_presentaddress,N_permanentaddress,N_nationality,N_gender,N_mail,N_phone,N_occupation,N_annualincome FROM needyDetails");
            
            
            while (rs.next()) {
                String N_id=String.valueOf(rs.getInt("N_id"));
                String N_name=rs.getString("N_name");
                String N_dob=String.valueOf(rs.getInt("N_dob"));

                String N_presentaddress=rs.getString("N_presentaddress");               
                String N_permanentaddress=rs.getString("N_permanentaddress");
                String N_nationality=rs.getString("N_nationality");
                String N_gender=rs.getString("N_gender");
                String N_mail=rs.getString("N_mail");
                
                String N_phone=String.valueOf(rs.getInt("N_phone"));
                
                
                String N_occupation=rs.getString("N_occupation");
                String N_annualincome=String.valueOf(rs.getInt("N_annualincome"));
                
                
                                    
                        
                  String tbData[]={N_id,N_name,N_dob,N_presentaddress,N_permanentaddress,N_nationality,N_gender,N_mail,N_phone,N_occupation,N_annualincome};
                   
                  DefaultTableModel tblModel=(DefaultTableModel)showneedytable.getModel();
                  tblModel.addRow(tbData);
                 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_showneedyActionPerformed

    private void NokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NokActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            String value = (String) searchbyneedy.getSelectedItem();
            String ida = Nsearch.getText();
            System.out.println(ida);
            if (value.equals("Search By Name")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("SELECT * from needydetails WHERE N_name ='" + ida + "' ");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("N_id"));
                    String D_name = rs.getString("N_name");
                    String D_dob = String.valueOf(rs.getInt("N_dob"));

                    String D_presentaddress = rs.getString("N_presentaddress");
                    String D_permanentaddress = rs.getString("N_permanentaddress");
                    String D_nationality = rs.getString("N_nationality");
                    String D_gender = rs.getString("N_gender");
                    String D_mail = rs.getString("N_mail");

                    String D_phone = String.valueOf(rs.getInt("N_phone"));

                    String D_occupation = rs.getString("N_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("N_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showneedytable.getModel();
                    tblModel.addRow(tbData);

                }
            }
            
            if (value.equals("Search By Taken Products")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("select * from needydetails where N_id in \n" +
"    (select N_id from records group by N_id having count(sl)='" + ida + "')");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("N_id"));
                    String D_name = rs.getString("N_name");
                    String D_dob = String.valueOf(rs.getInt("N_dob"));

                    String D_presentaddress = rs.getString("N_presentaddress");
                    String D_permanentaddress = rs.getString("N_permanentaddress");
                    String D_nationality = rs.getString("N_nationality");
                    String D_gender = rs.getString("N_gender");
                    String D_mail = rs.getString("N_mail");

                    String D_phone = String.valueOf(rs.getInt("N_phone"));

                    String D_occupation = rs.getString("N_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("N_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showneedytable.getModel();
                    tblModel.addRow(tbData);

                }
            }
            
            if (value.equals("Search By Annual Income")) {

                Statement statement = connection.createStatement();
                ResultSet rs = statement
                        .executeQuery("select * from needyDetails e1 where e1.N_annualincome <\n" +
"(select N_annualincome from needyDetails e2 where e1.N_annualincome<e2.N_annualincome and e2.N_name = '" + ida + "')");

                while (rs.next()) {

                    String D_id = String.valueOf(rs.getInt("N_id"));
                    String D_name = rs.getString("N_name");
                    String D_dob = String.valueOf(rs.getInt("N_dob"));

                    String D_presentaddress = rs.getString("N_presentaddress");
                    String D_permanentaddress = rs.getString("N_permanentaddress");
                    String D_nationality = rs.getString("N_nationality");
                    String D_gender = rs.getString("N_gender");
                    String D_mail = rs.getString("N_mail");

                    String D_phone = String.valueOf(rs.getInt("N_phone"));

                    String D_occupation = rs.getString("N_occupation");
                    String D_annualincome = String.valueOf(rs.getInt("N_annualincome"));

                    String tbData[] = {D_id, D_name, D_dob, D_presentaddress, D_permanentaddress, D_nationality, D_gender, D_mail, D_phone, D_occupation, D_annualincome};

                    DefaultTableModel tblModel = (DefaultTableModel) showneedytable.getModel();
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
    }//GEN-LAST:event_NokActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showneedytable.setModel(new DefaultTableModel(null,new String [] {"N_ID","N_Name","N_dob","N_presentaddress","N_permanentaddress","N_nationality","N_gender","N_mail",
             "N_phone","N_occupation","N_annualincome"}));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void searchbyneedyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbyneedyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchbyneedyActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AdminTop d=new AdminTop();
        d.show();
        dispose();
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
            java.util.logging.Logger.getLogger(Needy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Needy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Needy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Needy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Needy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nok;
    private javax.swing.JTextField Nsearch;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> searchbyneedy;
    private javax.swing.JButton showneedy;
    private javax.swing.JTable showneedytable;
    // End of variables declaration//GEN-END:variables
}
