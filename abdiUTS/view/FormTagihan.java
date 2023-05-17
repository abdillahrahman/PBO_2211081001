/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package abdiUTS.view;
import abdiUTS.controller.TagihanController;
/**
 *
 * @author ABDILLAH RAHMAN
 */
public class FormTagihan extends javax.swing.JPanel {

    /**
     * Creates new form FormTagihan
     */
    TagihanController controller;
    public FormTagihan() {
        initComponents();
        controller = new TagihanController(this);
        controller.bersihForm();
        controller.tampilData();
    }
    
    public javax.swing.JTextField getTxtKode(){
        return txtKode;
    }
    public javax.swing.JTextField getTxtNama(){
        return txtNama;
    }
    public javax.swing.JTextField getTxtMeter1(){
        return txtMeter1;
    }
    public javax.swing.JTextField getTxtMeter2(){
        return txtMeter2;
    }
    public javax.swing.JTextField getTxtTarif(){
        return txtTarif;
    }
    public javax.swing.JTextField getTxtDiskon(){
        return txtDiskon;
    }
    public javax.swing.JTable getTblTagihan(){
        return tblTagihan;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    @SuppressWarnings("unchecked")

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {                                         
        controller.saveTagihan();
        controller.tampilData();
        controller.bersihForm();
        // TODO add your handling code here:
    }                                        
                                  

    private void tblTagihanMouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        controller.getTagihan();
    }                                       

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {                                          
        controller.bersihForm();
        // TODO add your handling code here:
    }                                         

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtMeter1 = new javax.swing.JTextField();
        txtMeter2 = new javax.swing.JTextField();
        txtTarif = new javax.swing.JTextField();
        txtDiskon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblTagihan = new javax.swing.JTable();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();

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

        setLayout(null);

        jLabel1.setText("Kode Pelanggan");
        add(jLabel1);
        jLabel1.setBounds(23, 22, 86, 16);

        jLabel2.setText("Nama");
        add(jLabel2);
        jLabel2.setBounds(23, 50, 32, 16);

        jLabel3.setText("Meter bulan ini");
        add(jLabel3);
        jLabel3.setBounds(23, 78, 80, 16);

        jLabel4.setText("Meter bulan lalu");
        add(jLabel4);
        jLabel4.setBounds(23, 106, 86, 16);

        jLabel5.setText("Tarif");
        add(jLabel5);
        jLabel5.setBounds(23, 134, 23, 16);

        jLabel6.setText("Diskon");
        add(jLabel6);
        jLabel6.setBounds(23, 159, 36, 16);

        txtKode.setText("jTextField1");
        add(txtKode);
        txtKode.setBounds(143, 19, 167, 22);

        txtNama.setText("jTextField2");
        add(txtNama);
        txtNama.setBounds(143, 47, 167, 22);

        txtMeter1.setText("jTextField3");
        add(txtMeter1);
        txtMeter1.setBounds(143, 75, 167, 22);

        txtMeter2.setText("jTextField4");
        txtMeter2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMeter2ActionPerformed(evt);
            }
        });
        add(txtMeter2);
        txtMeter2.setBounds(143, 103, 167, 22);

        txtTarif.setText("jTextField5");
        add(txtTarif);
        txtTarif.setBounds(143, 131, 167, 22);

        txtDiskon.setText("jTextField6");
        add(txtDiskon);
        txtDiskon.setBounds(143, 159, 167, 22);

        tblTagihan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Kode", "Nama", "MB1", "MB2", "Tarif", "Diskon", "Total"
            }
        ));
        jScrollPane2.setViewportView(tblTagihan);

        add(jScrollPane2);
        jScrollPane2.setBounds(23, 264, 470, 402);

        btnInsert.setText("Insert");
        add(btnInsert);
        btnInsert.setBounds(23, 206, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        add(btnUpdate);
        btnUpdate.setBounds(113, 206, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(211, 206, 72, 23);

        btnCancel.setText("Cancel");
        add(btnCancel);
        btnCancel.setBounds(301, 206, 72, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void txtMeter2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMeter2ActionPerformed
        // TODO add your andling code here:
    }//GEN-LAST:event_txtMeter2ActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.updateTagihan();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.deleteTagihan();
        controller.tampilData();
        controller.bersihForm();
    }//GEN-LAST:event_btnDeleteActionPerformed

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
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAnggota.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormTagihan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblTagihan;
    private javax.swing.JTextField txtDiskon;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtMeter1;
    private javax.swing.JTextField txtMeter2;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtTarif;
    // End of variables declaration//GEN-END:variables
}