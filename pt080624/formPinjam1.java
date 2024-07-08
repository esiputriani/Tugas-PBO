/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo2301081005.pt080624;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.JTextField;
/**
 *
 * @author hp
 */
public class formPinjam1 extends javax.swing.JFrame {

    /**
     * Creates new form formPinjam1
     */
    PinjamController1 controller;
    public formPinjam1() {
        initComponents();
        controller = new PinjamController1 (this);
        controller.clearForm();
        controller.tampil();
    }

    public JTable getTblPinjam() {
        return tblPinjam;
    }

    public JTextField getTxtDenda() {
        return txtDenda;
    }

    public JTextField getTxtKembali() {
        return txtKembali;
    }

    public JTextField getTxtTanggal() {
        return txtTanggal;
    }

    public JTextField getTxtTerlambat() {
        return txtTerlambat;
    }

    public JTextField getTxtkodeAnggota() {
        return txtkodeAnggota;
    }

    public JTextField getTxtkodeBuku() {
        return txtkodeBuku;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtkodeAnggota = new javax.swing.JTextField();
        txtkodeBuku = new javax.swing.JTextField();
        txtTanggal = new javax.swing.JTextField();
        txtKembali = new javax.swing.JTextField();
        txtDenda = new javax.swing.JTextField();
        txtTerlambat = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPinjam = new javax.swing.JTable();
        btnCancel = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        Terlambat = new javax.swing.JLabel();

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
        getContentPane().setLayout(null);

        jLabel1.setText("kode anggota");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(18, 9, 90, 16);

        jLabel2.setText("kode buku");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(18, 37, 80, 16);

        jLabel3.setText("tgl pinjam");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(18, 65, 80, 16);

        jLabel4.setText("tgl kembali");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(18, 93, 80, 16);

        jLabel5.setText("denda");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(18, 121, 33, 16);

        txtkodeAnggota.setText("jTextField1");
        getContentPane().add(txtkodeAnggota);
        txtkodeAnggota.setBounds(132, 6, 220, 22);

        txtkodeBuku.setText("jTextField2");
        getContentPane().add(txtkodeBuku);
        txtkodeBuku.setBounds(132, 34, 220, 22);

        txtTanggal.setText("jTextField3");
        getContentPane().add(txtTanggal);
        txtTanggal.setBounds(132, 62, 220, 22);

        txtKembali.setText("jTextField4");
        getContentPane().add(txtKembali);
        txtKembali.setBounds(132, 90, 220, 22);

        txtDenda.setText("jTextField5");
        getContentPane().add(txtDenda);
        txtDenda.setBounds(132, 118, 220, 22);

        txtTerlambat.setText("jTextField6");
        getContentPane().add(txtTerlambat);
        txtTerlambat.setBounds(132, 146, 220, 22);

        tblPinjam.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Kode Anggota", "Kode Buku", "Tgl pinjam", "Tgl Kembali", "Denda", "Terlambat"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPinjam.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPinjamMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblPinjam);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(-2, 228, 420, 160);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(27, 193, 72, 23);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(120, 193, 72, 23);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(213, 193, 72, 23);

        btnInsert.setText("insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(306, 193, 72, 23);

        Terlambat.setText("Terlambat");
        getContentPane().add(Terlambat);
        Terlambat.setBounds(20, 150, 80, 16);

        setSize(new java.awt.Dimension(440, 423));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
         controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        controller.calculateTerlambatAndDenda();
       controller.updatePinjam();
       controller.tampil();
       controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         controller.deletePinjam();
       controller.tampil();
       controller.clearForm();
       //TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
         controller.calculateTerlambatAndDenda();
       controller.savePinjam();
       controller.tampil();
       controller.clearForm();// TODO add your handling code here:
    }//GEN-LAST:event_btnInsertActionPerformed

    private void tblPinjamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPinjamMouseClicked
        controller.getPinjam();// TODO add your handling code here:
    }//GEN-LAST:event_tblPinjamMouseClicked

    private void calculateTerlambatAndDenda() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date tanggalPinjam = sdf.parse(txtTanggal.getText());
            Date tanggalKembali = sdf.parse(txtKembali.getText());

            long differenceInMillies = Math.abs(tanggalKembali.getTime() - tanggalPinjam.getTime());
            long differenceInDays = differenceInMillies / (24 * 60 * 60 * 1000);

            txtTerlambat.setText(String.valueOf(differenceInDays));
            txtDenda.setText(String.valueOf(differenceInDays * 500));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
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
            java.util.logging.Logger.getLogger(formPinjam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPinjam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPinjam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPinjam1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPinjam1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Terlambat;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblPinjam;
    private javax.swing.JTextField txtDenda;
    private javax.swing.JTextField txtKembali;
    private javax.swing.JTextField txtTanggal;
    private javax.swing.JTextField txtTerlambat;
    private javax.swing.JTextField txtkodeAnggota;
    private javax.swing.JTextField txtkodeBuku;
    // End of variables declaration//GEN-END:variables
}