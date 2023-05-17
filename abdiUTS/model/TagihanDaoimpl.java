/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdiUTS.model;
import java.util.ArrayList;
import java.util.List;
/**
 *
 *
 */
public class TagihanDaoImpl implements TagihanDao{
    List<Tagihan> data = new ArrayList<>();
    public TagihanDaoImpl(){
        
    }
    public void save(Tagihan tagihan){
        data.add(tagihan);
    }
    public void update(int index,Tagihan tagihan){
        data.set(index, tagihan);
    }
    public void delete(int index){
        data.remove(index);
    }
    public Tagihan getTagihan(int index){
        return data.get(index);
    }
    public List<Tagihan> getAll(){
        return data;
    }
}
