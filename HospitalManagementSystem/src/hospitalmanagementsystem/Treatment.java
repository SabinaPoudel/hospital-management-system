/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author SABINA
 */
public class Treatment extends javax.swing.JFrame {

    /**
     * Creates new form doctorAppointment
     */
     private void Selectional() {
        try {
//             Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from doctor");
            TreatmentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void Treatment() {
        initComponents();
       // System.out.println("Hello");
//        TreatCount();
//        DisplayTreatment();
//        initComponents();
        Selectional();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TNameTb = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CostTb = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        IDTreat = new javax.swing.JTextField();
        MedicineTb = new javax.swing.JTextField();
        Addbtn = new javax.swing.JButton();
        Updatebtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TreatmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(480, 150));
        setMaximumSize(new java.awt.Dimension(738, 495));
        setUndecorated(true);
        setSize(new java.awt.Dimension(500, 500));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel1.setText("Treatments");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(295, 295, 295)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 86, 139, 30));

        TNameTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TNameTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TNameTbActionPerformed(evt);
            }
        });
        getContentPane().add(TNameTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 123, 167, 32));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Cost");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 58, 30));

        CostTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        CostTb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CostTbActionPerformed(evt);
            }
        });
        getContentPane().add(CostTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 118, 32));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Medicines");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel5.setText("Treatments");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Algerian", 1, 18)); // NOI18N
        jLabel6.setText("Treatments List");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(259, 256, 173, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Id");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 85, 70, -1));

        IDTreat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        IDTreat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDTreatActionPerformed(evt);
            }
        });
        getContentPane().add(IDTreat, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 118, 106, 32));

        MedicineTb.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(MedicineTb, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 138, 35));

        Addbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Addbtn.setText("Add");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 190, -1, -1));

        Updatebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Updatebtn.setText("Update");
        Updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 190, -1, -1));

        Deletebtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        getContentPane().add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 190, -1, -1));

        Clearbtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        TreatmentTable.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        TreatmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "PATIENTNAME", "TREATMENT", "COST", "MEDICINES"
            }
        ));
        TreatmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TreatmentTableMouseClicked(evt);
            }
        });
        TreatmentTable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                TreatmentTableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(TreatmentTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 740, 165));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebtnActionPerformed
        // TODO add your handling code here:
        if(IDTreat.getText().isEmpty() || TNameTb.getText().isEmpty() || CostTb.getText().isEmpty() || MedicineTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing Information");
        } else {
            try {
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
                String Query = "Update treatments set TreatName='" + TNameTb.getText() + "'" + ",TreatCost='" + CostTb.getText() + "'" + ",TreatMed='" + MedicineTb.getText() + "'" + "where TreatId=" + IDTreat.getText();
                Statement add = conn.createStatement();
                add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, " Update Successfully");

            } catch (Exception Ex) {
                Ex.printStackTrace();
            }

        }

    }//GEN-LAST:event_UpdatebtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
//        if (TNameTb.getText().isEmpty() || CostTb.getText().isEmpty() || MedicineTb.getText().isEmpty()) {
//            JOptionPane.showMessageDialog(this, "Missing Information");
//        } else {
//            try {
//                TreatCount();
//                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
//                PreparedStatement add = conn.prepareStatement("insert into treatments values(?,?,?,?)");
//                add.setInt(1, Integer.valueOf(IDTreat.getText()));
//                add.setString(2, TNameTb.getText());
//                add.setInt(3, Integer.valueOf(CostTb.getText()));
//                add.setString(4, MedicineTb.getText());
//                int row = add.executeUpdate();
//                JOptionPane.showMessageDialog(this, " Treatments Added successfully");
//                conn.close();
//                DisplayTreatment();
//                clear();
//            } catch (Exception Ex) {
//                Ex.printStackTrace();
//            }
//        }
 
     try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
            PreparedStatement add = conn.prepareStatement("insert into treatments values(?,?,?,?)");
            add.setInt(1, Integer.valueOf(IDTreat.getText()));
            add.setString(2, TNameTb.getText());
            add.setInt(3, Integer.valueOf(CostTb.getText()));
            add.setString(4, MedicineTb.getText());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Treatments Added successfully");
            conn.close();
            Selectional();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
//    int TreatId=1000;
//    private void TreatCount() {
//        try{
//            St1= Con.createStatement();
//            Rs1=St1.executeQuery("select Max(TREATID)From treatments");
//            Rs1.next();
//            TreatId=Rs1.getInt(1)+1;
//        }catch(Exception Ex ){
//            Ex.printStackTrace();
//        }
//
//    }

//    Connection Con=null;
//    Statement St = null , St1=null;
//    ResultSet Rs = null,Rs1= null;
    
    private void DisplayTreatment() {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from treatments");
            TreatmentTable.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception Ex) {
        
        }
        
    }//GEN-LAST:event_AddbtnActionPerformed

    int key = 0;
    private void TreatmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TreatmentTableMouseClicked
        // TODO add your handling code here:
        //System.out.println("event trigger");
        DefaultTableModel model=(DefaultTableModel)TreatmentTable.getModel();
        int MyIndex=TreatmentTable.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(MyIndex,0).toString());
        TNameTb.setText(model.getValueAt(MyIndex,1).toString());
        CostTb.setText(model.getValueAt(MyIndex,2).toString());
        MedicineTb.setText(model.getValueAt(MyIndex,3).toString());
    }//GEN-LAST:event_TreatmentTableMouseClicked

    private void TreatmentTableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_TreatmentTableComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_TreatmentTableComponentShown
    public void clear(){
        TNameTb.setText("");
        CostTb.setText("");
        MedicineTb.setText("");
    }
    
    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void TNameTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TNameTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TNameTbActionPerformed

    private void CostTbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CostTbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CostTbActionPerformed

    private void IDTreatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDTreatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDTreatActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
        if (IDTreat.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Enter The Treatments To Be Deleted");
        } else {
            try {

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "root");
                String Id = IDTreat.getText();
                String Query = "Delete from Treatments where IDTreat=" + Id;
                Statement add = conn.createStatement();
                add.executeUpdate(Query);
                Selectional();
                JOptionPane.showMessageDialog(this, " Successfully Deleted");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DeletebtnActionPerformed

    
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
            java.util.logging.Logger.getLogger(Treatment.class  
.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Treatment.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Treatment.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);

} catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Treatment.class  

.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Treatment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Clearbtn;
    private javax.swing.JTextField CostTb;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JTextField IDTreat;
    private javax.swing.JTextField MedicineTb;
    private javax.swing.JTextField TNameTb;
    private javax.swing.JTable TreatmentTable;
    private javax.swing.JButton Updatebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
