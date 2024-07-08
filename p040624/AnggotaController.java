package pbo_2301081005.p040624;

import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.JOptionPane;
        

/**
 * This class is responsible for handling the actions and interactions between the form and the data model.
 */
public class AnggotaController {
    private formAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;

    public AnggotaController(formAnggota formAnggota) {
        this.formAnggota = formAnggota;
        anggotaDao = new AnggotaDao();
    }

    /**
     * Clears the form fields.
     */
    public void clearForm() {
        formAnggota.getTxtKodeAnggota().setText("");
        formAnggota.getTxtNamaAnggota().setText("");
        formAnggota.getTxtAlamat().setText("");
        formAnggota.getCboJenisKelamin().removeAllItems(); // Corrected: no arguments
        formAnggota.getCboJenisKelamin().addItem("L");
        formAnggota.getCboJenisKelamin().addItem("P");
    }
    
    public void Tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAll();
        for (Anggota a :list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void saveAnggota(){
        anggota = new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota, "Insert OK");
    }
    
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota, "Update OK");
        
    }
    
    public void getAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
        }
    }
    
    public void deleteAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delete(index);
        JOptionPane.showMessageDialog(formAnggota, "Delete ok");
    }
}
