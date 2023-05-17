/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abdiUTS.model;

/**
 *
 * @author ABDILLAH RAHMAN
 */
import java.util.List;
/**
 *
 *
 */
public interface TagihanDao {
    void save(Tagihan tagihan);
    void update(int index, Tagihan tagihan);
    void delete(int index);
    Anggota getTagihan(int index);
    List<Tagihan> getAll();
}