/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package abdi2.view;
import abdi2.controller.BukuController;
/**
 *
 *
 */
public class FormBuku extends javax.swing.JFrame {

    /**
     * Creates new form FormBuku
     */
    BukuController ctrl;
    public FormBuku() {
        initComponents();
        ctrl = new BukuController(this);
        ctrl.cls();
        ctrl.tampilData();
    }
    public javax.swing.JTextField getTxtKode(){
        return txtKd;
    }
    public javax.swing.JTextField getTxtJudul(){
        return txtJd;
    }
    public javax.swing.JTextField getTxtPengarang(){
        return txtPg;
    }
    public javax.swing.JTextField getTxtPenerbit(){
        return txtPn;
    }
    public javax.swing.JTextField getTxtTahun(){
        return txtTt;
    }
    public javax.swing.JTable getTabelBuku(){
        return tabelBuku;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtKd = new javax.swing.JTextField();
        txtJd = new javax.swing.JTextField();
        txtPg = new javax.swing.JTextField();
        txtPn = new javax.swing.JTextField();
        txtTt = new javax.swing.JTextField();
        Insert = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelBuku = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Judul");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(12, 46, 80, 16);

        jLabel2.setText("Pengarang");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(12, 75, 80, 16);

        jLabel3.setText("Penerbit");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(12, 104, 80, 16);

        jLabel4.setText("Kode buku");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(12, 17, 80, 16);

        jLabel5.setText("Tahun terbit");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(12, 133, 80, 16);

        txtKd.setText("jTextField4");
        getContentPane().add(txtKd);
        txtKd.setBounds(97, 14, 297, 30);

        txtJd.setText("jTextField5");
        getContentPane().add(txtJd);
        txtJd.setBounds(97, 43, 297, 30);

        txtPg.setText("jTextField6");
        getContentPane().add(txtPg);
        txtPg.setBounds(97, 72, 297, 30);

        txtPn.setText("jTextField7");
        getContentPane().add(txtPn);
        txtPn.setBounds(97, 101, 297, 30);

        txtTt.setText("jTextField8");
        getContentPane().add(txtTt);
        txtTt.setBounds(97, 130, 297, 30);

        Insert.setText("Insert");
        Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InsertActionPerformed(evt);
            }
        });
        getContentPane().add(Insert);
        Insert.setBounds(10, 170, 72, 23);

        Update.setText("Update");
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update);
        Update.setBounds(90, 170, 72, 23);

        Delete.setText("Delete");
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(Delete);
        Delete.setBounds(180, 170, 80, 23);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(280, 170, 80, 23);

        tabelBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Kode", "Judul", "Pengarang", "Penerbit", "Tahun"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelBukuMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelBuku);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 211, 750, 310);

        setSize(new java.awt.Dimension(788, 585));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        // TODO add your handling code here:
        ctrl.updateBuku();
        ctrl.tampilData();
        ctrl.cls();
    }//GEN-LAST:event_UpdateActionPerformed

    private void tabelBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelBukuMouseClicked
        // TODO add your handling code here:
        ctrl.getBuku();
    }//GEN-LAST:event_tabelBukuMouseClicked

    private void InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InsertActionPerformed
        // TODO add your handling code here:
        ctrl.saveBuku();
        ctrl.tampilData();
        ctrl.cls();
    }//GEN-LAST:event_InsertActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        // TODO add your handling code here:
        ctrl.deleteBuku();
        ctrl.tampilData();
        ctrl.cls();
    }//GEN-LAST:event_DeleteActionPerformed

    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        // TODO add your handling code here:
        ctrl.cls();
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Insert;
    private javax.swing.JButton Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelBuku;
    private javax.swing.JTextField txtJd;
    private javax.swing.JTextField txtKd;
    private javax.swing.JTextField txtPg;
    private javax.swing.JTextField txtPn;
    private javax.swing.JTextField txtTt;
    // End of variables declaration//GEN-END:variables
}
