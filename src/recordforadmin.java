
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
 * @author 1a
 */
public class recordforadmin extends javax.swing.JFrame {

    /**
     * Creates new form recordforadmin
     */
    public recordforadmin() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        record = new javax.swing.JTable();
        showrecords = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        needydonor = new javax.swing.JTable();
        pid = new javax.swing.JTextField();
        enterpid = new javax.swing.JButton();
        showTransactions = new javax.swing.JButton();
        clr = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        record.setBackground(new java.awt.Color(204, 204, 204));
        record.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        record.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SerailNo", "DonorId", "NeedyId", "ProductId", "Quantity", "ProductName", "Unit"
            }
        ));
        jScrollPane2.setViewportView(record);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 600, 290));

        showrecords.setBackground(new java.awt.Color(153, 153, 153));
        showrecords.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        showrecords.setText("Show All Data");
        showrecords.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showrecordsActionPerformed(evt);
            }
        });
        getContentPane().add(showrecords, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 290, 40));

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

        needydonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "D_id", "D_name", "N_id", "N_name", "productName"
            }
        ));
        jScrollPane1.setViewportView(needydonor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 480, 290));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 270, 100, 30));

        enterpid.setBackground(new java.awt.Color(153, 153, 153));
        enterpid.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        enterpid.setText("Enter a product id");
        enterpid.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        enterpid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpidActionPerformed(evt);
            }
        });
        getContentPane().add(enterpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 270, 160, 30));

        showTransactions.setBackground(new java.awt.Color(153, 153, 153));
        showTransactions.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        showTransactions.setText("Show All Transactions");
        showTransactions.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 2, true));
        showTransactions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showTransactionsActionPerformed(evt);
            }
        });
        getContentPane().add(showTransactions, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 190, 290, 30));

        clr.setBackground(new java.awt.Color(153, 153, 153));
        clr.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        clr.setText("Clear ");
        clr.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        clr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrActionPerformed(evt);
            }
        });
        getContentPane().add(clr, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 60, 30));

        jLabel7.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("RECORDS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 20, 180, 90));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setText("Clear ");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 51, 102), 1, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 310, 60, 30));

        jLabel3.setFont(new java.awt.Font("Algerian", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nevy3.jpg"))); // NOI18N
        jLabel3.setText("          Records");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showrecordsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showrecordsActionPerformed
            try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet rs = statement
                    .executeQuery("SELECT * FROM records");
            
            
            while (rs.next()) {
                String SL=String.valueOf(rs.getInt("SL"));
                System.out.println(SL);
                 String D_id=String.valueOf(rs.getInt("D_id"));
                  String N_id=String.valueOf(rs.getInt("N_id"));
                   String P_id=String.valueOf(rs.getInt("P_id"));
                   
                   String q=String.valueOf(rs.getInt("R_quantity"));
                   
                String pname=rs.getString("R_productname");
                String unit=rs.getString("unit");
               // String A_mail=rs.getString("N_id");

               // String A_gender=rs.getString("P_id");               
               // String A_dob=rs.getString("A_DOB");
               // String A_address=rs.getString("A_address");
               // String A_phoneNo=rs.getString("A_phoneNo");
                
                
                    /// Statement statement5 = connection.createStatement();
        //    statement5.executeUpdate("insert into donationcount select distinct D_id,count(distinct N_id) from records group by D_id");
         
                             
                        
                  String tbData[]={SL,D_id,N_id,P_id,q,pname,unit};
                   
                  DefaultTableModel tblModel=(DefaultTableModel)record.getModel();
                  tblModel.addRow(tbData);
                 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            

 // TODO add your handling code here:
    }//GEN-LAST:event_showrecordsActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:

        AdminTop d=new AdminTop();
        d.show();
        dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void enterpidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpidActionPerformed
                // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());
            String p_id=pid.getText();
            Statement statement = connection.createStatement();
            ResultSet rs = statement
                    .executeQuery("select d.D_id,d.D_name ,N.N_id,N.N_name,r.R_productName from DonorDetails d inner join records r\n" +
                     "on d.D_id= r.D_id inner join NeedyDetails N on N.N_id=r.N_id where r.P_id='"+p_id+"'");

            
            while (rs.next()) {
                String D_id=String.valueOf(rs.getInt("D_id"));
                String D_name=rs.getString("D_name");
                //System.out.println(SL);
                 String N_id=String.valueOf(rs.getInt("N_id"));
                  String N_name=rs.getString("N_name");
                   
                String pname=rs.getString("R_productname");
                  String tbData[]={D_id,D_name,N_id,N_name,pname};
                   
                  DefaultTableModel tblModel=(DefaultTableModel)needydonor.getModel();
                  tblModel.addRow(tbData);
                 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_enterpidActionPerformed

    private void showTransactionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showTransactionsActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=charity_management;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement = connection.createStatement();
            ResultSet rs = statement
                    .executeQuery("select d.D_id,d.D_name ,N.N_id,N.N_name,r.R_productName from DonorDetails d inner join records r\n" +
"on d.D_id= r.D_id inner join NeedyDetails N on N.N_id=r.N_id");
            
            
            while (rs.next()) {
                String D_id=String.valueOf(rs.getInt("D_id"));
                String D_name=rs.getString("D_name");
                //System.out.println(SL);
                 String N_id=String.valueOf(rs.getInt("N_id"));
                  String N_name=rs.getString("N_name");
                   
                String pname=rs.getString("R_productname");
               
               // String A_mail=rs.getString("N_id");

               // String A_gender=rs.getString("P_id");               
               // String A_dob=rs.getString("A_DOB");
               // String A_address=rs.getString("A_address");
               // String A_phoneNo=rs.getString("A_phoneNo");
                
                
                    /// Statement statement5 = connection.createStatement();
        //    statement5.executeUpdate("insert into donationcount select distinct D_id,count(distinct N_id) from records group by D_id");
         
                             
                        
                  String tbData[]={D_id,D_name,N_id,N_name,pname};
                   
                  DefaultTableModel tblModel=(DefaultTableModel)needydonor.getModel();
                  tblModel.addRow(tbData);
                 
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }//GEN-LAST:event_showTransactionsActionPerformed

    private void clrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrActionPerformed
        // TODO add your handling code here:
        record.setModel(new DefaultTableModel(null,new String [] {"SerialNo","DonorId","NeedyId","ProductId","ProductName","Quantity","Unit"}));
    }//GEN-LAST:event_clrActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
         needydonor.setModel(new DefaultTableModel(null,new String [] {"D_id","D_name","N_id","N_name","productName"}));
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(recordforadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(recordforadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(recordforadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(recordforadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new recordforadmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clr;
    private javax.swing.JButton enterpid;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable needydonor;
    private javax.swing.JTextField pid;
    private javax.swing.JTable record;
    private javax.swing.JButton showTransactions;
    private javax.swing.JButton showrecords;
    // End of variables declaration//GEN-END:variables
}
