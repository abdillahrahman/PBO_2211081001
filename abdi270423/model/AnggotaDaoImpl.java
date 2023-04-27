/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdi270423.model;
import java.util.List;
import java.util.*;
/**
 *
 * @author LABP1KOMP
 */
public class AnggotaDaoImpl implements AnggotaDao{
    
    List<Anggota> data = new ArrayList();
    
    public void save(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index, Anggota anggota){
        data.set(index, anggota);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota> getAllAnggota(){
        return data;
    }
}
