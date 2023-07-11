/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdi240523.controller;
import abdi240523.view.FormPengembalian;
import abdi240523.view.FormPeminjaman;
import abdi240523.model.Anggota;
import abdi240523.model.Peminjaman;
import abdi240523.model.Pengembalian;
import abdi240523.model.Buku;
import abdi240523.dao.PeminjamanDao;
import abdi240523.dao.BukuDaoImpl;
import abdi240523.dao.AnggotaDaoImpl;
import abdi240523.dao.PeminjamanDaoImpl;
import abdi240523.dao.AnggotaDao;
import abdi240523.dao.BukuDao;
import abdi240523.database.DatabaseHelper;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ASUS iD
 */
public class PengembalianController {
   FormPengembalian formPengembalian;
   FormPeminjaman formPeminjaman;
   Pengembalian pengembalian;
   Peminjaman peminjaman;
   PeminjamanDao peminjamanDao;
   AnggotaDao anggotaDao;
   BukuDao bukuDao;
   
  public PengembalianController(FormPengembalian formPengembalian){
       try {
           this.formPengembalian = formPengembalian;
           peminjamanDao = new PeminjamanDaoImpl(DatabaseHelper.getConnection());
           anggotaDao = new AnggotaDaoImpl(DatabaseHelper.getConnection());
           bukuDao = new BukuDaoImpl(DatabaseHelper.getConnection());
       } catch (SQLException ex) {
           Logger.getLogger(PengembalianController.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
  
  public void tampilTabelPeminjaman() {
    try {
        DefaultTableModel tabelModel = (DefaultTableModel) formPeminjaman.getTabelPeminjaman().getModel();
        tabelModel.setRowCount(0);
        List<Peminjaman> list = peminjamanDao.getAll();
        for (Peminjaman p : list) {
            Anggota anggota = anggotaDao.getAnggota(p.getNobp());
            Buku buku = bukuDao.getBuku(p.getKodeBuku());
            Object[] row = {
                p.getNobp(),
                anggota.getNama(),
                p.getKodeBuku(),
                buku.getJudulBuku(),
                p.getTglPinjam(),
                p.getTglKembali()
            };
            tabelModel.addRow(row);
        }
    } catch (SQLException ex) {
        Logger.getLogger(PeminjamanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
 
