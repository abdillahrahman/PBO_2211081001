/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdi270423buku.model;
import java.util.*;
/**
 *
 * @author LABP1KOMP
 */
public interface BukuDao {
    void save(Buku buku);
    void update(int index, Buku buku);
    void delete(int index);
    Buku getBuku(int index);
    public List<Buku> getAllBuku();
}
