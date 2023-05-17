/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdiUTS.controller;
import abdiUTS.model.TagihanDaoImpl;
import abdiUTS.model.TagihanDao;
import abdiUTS.model.Tagihan;
import abdiUTS.view.FormTagihan;
import javax.swing.table.DefaultTableModel;
/**
 *
 *
 */
public class TagihanController {
    private FormTagihan formTagihan;
    private TagihanDao tagihanDao;
    private Tagihan tagihan;
    
    public TagihanController(FormTagihan formTagihan){
        this.formTagihan = formTagihan;
        tagihanDao = new TagihanDaoImpl();
    }
    
    public void bersihForm(){
        formTagihan.getTxtKode().setText("");
        formTagihan.getTxtNama().setText("");
        formTagihan.getTxtMeter1().setText("");
        formTagihan.getTxtMeter2().setText("");
        formTagihan.getTxtTarif().setText("");
        formTagihan.getTxtDiskon().setText("");
    }
    
    public void saveTagihan(){
        tagihan = new tagihan();
        tagihan.setKode(formTagihan.getTxtKode().getText());
        tagihan.setNama(formTagihan.getTxtNama().getText());
        tagihan.setMeter1(formTagihan.getTxtMeter1().getText());
        tagihan.setMeter2(formTagihan.getTxtMeter2().getText());
        tagihan.setTarif(formTagihan.getTxtTarif().getText());
        tagihan.setDiskon(formTagihan.getTxtDiskon().getText());
        tagihanDao.save(tagihan);
        javax.swing.JOptionPane.showMessageDialog(formTagihan, "Entri Ok");
    }
    
    public void getTagihan(){
        int index = formTagihan.getTblTagihan().getSelectedRow();
        tagihan = tagihanDao.getTagihan(index);
        if(tagihan != null){
            formTagihan.getTxtKode().setText(tagihan.getKode());
            formTagihan.getTxtNama().setText(tagihan.getNama());
            formTagihan.getTxtMeter1().setText(tagihan.getMeter1());
            formTagihan.getTxtMeter2().setText(tagihan.getMeter2());
            formTagihan.getTxtTarif().setText(tagihan.getTarif());
            formTagihan.getTxtDiskon().setText(tagihan.getDiskon());
        }
    }
    
    public void updateTagihan(){
        int index = formTagihan.getTblTagihan().getSelectedRow();
        tagihan.setKode(formTagihan.getTxtKode().getText());
        tagihan.setNama(formTagihan.getTxtNama().getText());
        tagihan.setMeter1(formTagihan.getTxtMeter1().getText());
        tagihan.setMeter2(formTagihan.getTxtMeter2().getText());
        tagihan.setTarif(formTagihan.getTxtTarif().getText());
        tagihan.setDiskon(formTagihan.getTxtDiskon().getText());
        tagihanDao.update(index,tagihan);
    }
    
    public void deleteTagihan(){
        int index = formTagihan.getTblTagihan().getSelectedRow();
        tagihanDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formTagihan, "Delete");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel =
                (DefaultTableModel) formTagihan.getTblTagihan().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Tagihan> list = tagihanDao.getAll();
        for(Tagihan tagihan : list){
            Object[] data = {
                anggota.getNobp(),
                anggota.getNama(),
                anggota.getMeter1(),
                anggota.getMeter2(),
                anggota.getTarif(),
                anggota.getDiskon(),
            };
            tabelModel.addRow(data);
        }
    }
}
