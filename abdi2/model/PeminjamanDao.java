/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdi2.model;
import java.util.List;
/**
 *
 *
 */
public interface PeminjamanDao {
    void save(Peminjaman peminjaman);
    void update(int idx, Peminjaman peminjaman);
    void delete(int idx);
    Peminjaman getPeminjaman(int idx);
    List<Peminjaman> getAllPeminjaman();
}
