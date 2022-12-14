/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hospitalmanagementsystem;

import javax.swing.JComboBox;
import project.DBConnection;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author SABINA
 */
public class addNewPatientRecord extends javax.swing.JFrame {

    /**
     * Creates new form addNewPatientRecord
     */
    public addNewPatientRecord() {
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        PatientIDF = new javax.swing.JTextField();
        NameF = new javax.swing.JTextField();
        ContactF = new javax.swing.JTextField();
        AgeF = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        BloodF = new javax.swing.JTextField();
        AddressF = new javax.swing.JTextField();
        DiseasesF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 153, 255));
        setLocation(new java.awt.Point(480, 150));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1920, 1080));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/close.png"))); // NOI18N
        jButton2.setText("close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 430, -1, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 25, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 68, 51, 16));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contact No");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 112, -1, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 141, 75, 22));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 185, 75, 24));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Blood Group");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 235, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Address");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 67, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Any major diseases suffer earlier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 325, -1, -1));

        PatientIDF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PatientIDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientIDFActionPerformed(evt);
            }
        });
        getContentPane().add(PatientIDF, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 15, 190, 30));

        NameF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(NameF, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 58, 190, -1));

        ContactF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(ContactF, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 102, 190, -1));

        AgeF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(AgeF, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 141, 190, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 185, 190, -1));

        BloodF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(BloodF, new org.netbeans.lib.awtextra.AbsoluteConstraints(242, 229, 190, -1));

        AddressF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(AddressF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 190, -1));

        DiseasesF.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(DiseasesF, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 363, 337, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagementsystem/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, -1, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PatientIDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientIDFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PatientIDFActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String PatientID = PatientIDF.getText();
        String Name = NameF.getText();
        String ContactNo= ContactF.getText();
        String Age = AgeF.getText();
        String Gender=(String)jComboBox1.getSelectedItem();
        String Bloodgroup= BloodF.getText();
        String Address=AddressF.getText();
        String Anymajordisease=DiseasesF.getText();
        try{
            Connection cons = DBConnection.getcon();
            Statement st =cons.createStatement();
            st.executeUpdate("insert into patient values('"+PatientID+"','"+Name+"','"+ContactNo+"','"+Age+"','"+Gender+"','"+Bloodgroup+"','"+Address+"','"+Anymajordisease+"')");
           JOptionPane.showMessageDialog( null,"Successfully updated");
           setVisible(false);
           new Home().setVisible(true);
           
        }
        catch(Exception e){
            System.out.println(e);
            JOptionPane.showMessageDialog( null,"please enter data in correct formate! ");
        }
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        
        
                          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(addNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addNewPatientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addNewPatientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AddressF;
    private javax.swing.JTextField AgeF;
    private javax.swing.JTextField BloodF;
    private javax.swing.JTextField ContactF;
    private javax.swing.JTextField DiseasesF;
    private javax.swing.JTextField NameF;
    private javax.swing.JTextField PatientIDF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
