package pbo2301081005.p250624;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pbo_2301081005.p040624.Anggota;


public class WarnetController1 {
    private formWarnet formWarnet;
    private Warnet1 warnet;
    private WarnetDao warnetDao;

    /**
     * Constructor to initialize form and DAO.
     *
     * @param formWarnet The formWarnet instance.
     */
    public WarnetController1(formWarnet formWarnet) {
        this.formWarnet = formWarnet;
        this.warnetDao = new WarnetDao();
    }

    /**
     * Clears the input fields in the form.
     */
    public void clearForm() {
        formWarnet.getTxtKode().setText("");
        formWarnet.getTxtNama().setText("");
        formWarnet.getTxtMasuk().setText("");
        formWarnet.getTxtKeluar().setText("");
        formWarnet.getTxtTanggal().setText("");
        formWarnet.getCbJenis().removeAllItems();
        formWarnet.getCbJenis().addItem("VIP");
        formWarnet.getCbJenis().addItem("Gold");
    }

    /**
     * Displays the data from the DAO in the form's table.
     */
    public void tampil() {
        DefaultTableModel tabelModel = (DefaultTableModel) formWarnet.getTblWarnet().getModel();
        tabelModel.setRowCount(0);
        List<Warnet1> list = warnetDao.getAll();
        for (Warnet1 a : list) {
            Object[] row = {
                a.getKodePelanggan(),
                a.getNamaPelanggan(),
                a.getJenisPelanggan(),
                a.getTglMasuk(),
                a.getJamMasuk(),
                a.getJamKeluar(),
                a.getLama(),
                a.getTarif(),
                a.getDiskon(),
                a.getTotalBayar(),
                a.calculateLama(),
                a.calculateTarif(),
                a.calculateDiskon(),
                a.calculateTotalBayar(),
            };
            tabelModel.addRow(row);
        }
    }

    /**
     * Saves the current data in the form to the DAO.
     */
    public void saveWarnet() {
        warnet = new Warnet1();
        warnet.setKodePelanggan(formWarnet.getTxtKode().getText());
        warnet.setNamaPelanggan(formWarnet.getTxtNama().getText());
        warnet.setJenisPelanggan(formWarnet.getCbJenis().getSelectedItem().toString());
        warnet.setTglMasuk(formWarnet.getTxtTanggal().getText());
        warnet.setJamMasuk(formWarnet.getTxtMasuk().getText());
        warnet.setJamKeluar(formWarnet.getTxtKeluar().getText());
        warnet.setLama(warnet.calculateLama());
        warnet.setTarif(warnet.calculateTarif());
        warnet.setDiskon(warnet.calculateDiskon());
        warnet.setTotalBayar(warnet.calculateTotalBayar());
        warnetDao.insert(warnet);
        JOptionPane.showMessageDialog(formWarnet, "Insert OK");
    }

    /**
     * Updates the selected data in the form and saves it to the DAO.
     */
    public void updateWarnet() {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        if (index != -1) {
            warnet = warnetDao.getWarnet(index);
            warnet.setKodePelanggan(formWarnet.getTxtKode().getText());
            warnet.setNamaPelanggan(formWarnet.getTxtNama().getText());
            warnet.setJenisPelanggan(formWarnet.getCbJenis().getSelectedItem().toString());
            warnet.setTglMasuk(formWarnet.getTxtTanggal().getText());
            warnet.setJamMasuk(formWarnet.getTxtMasuk().getText());
            warnet.setJamKeluar(formWarnet.getTxtKeluar().getText());
            warnet.setLama(warnet.calculateLama());
            warnet.setTarif(warnet.calculateTarif());
            warnet.setDiskon(warnet.calculateDiskon());
            warnet.setTotalBayar(warnet.calculateTotalBayar());
            warnetDao.update(index, warnet);
            JOptionPane.showMessageDialog(formWarnet, "Update OK");
        } else {
            JOptionPane.showMessageDialog(formWarnet, "Please select a row to update");
        }
    }

    /**
     * Gets the selected data from the table and displays it in the form.
     */
    public void getWarnet() {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        if (index != -1) {
            warnet = warnetDao.getWarnet(index);
            if (warnet != null) {
                formWarnet.getTxtKode().setText(warnet.getKodePelanggan());
                formWarnet.getTxtNama().setText(warnet.getNamaPelanggan());
                formWarnet.getTxtTanggal().setText(warnet.getTglMasuk());
                formWarnet.getCbJenis().setSelectedItem(warnet.getJenisPelanggan());
                formWarnet.getTxtKeluar().setText(warnet.getJamKeluar());
                formWarnet.getTxtMasuk().setText(warnet.getJamMasuk());
            }
        } else {
            JOptionPane.showMessageDialog(formWarnet, "Please select a row to view");
        }
    }

    /**
     * Deletes the selected data from the table and the DAO.
     */
    public void deleteWarnet() {
        int index = formWarnet.getTblWarnet().getSelectedRow();
        if (index != -1) {
            warnetDao.delete(index);
            JOptionPane.showMessageDialog(formWarnet, "Delete OK");
        } else {
            JOptionPane.showMessageDialog(formWarnet, "Please select a row to delete");
        }
    }
}
