/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdi270423buku.model;

/**
 *
 * @author LABP1KOMP
 */
public class Buku {
    private String kodeBuku;
    private String judulBuku;
    private String pengarang;
    private String penerbit;
    private String tahun;
    
    public Buku(){
    }
    
    public Buku(String kodeAnggota, String namaAnggota, String alamat, String jenisKelamin){
        this.kodeBuku = kodeBuku;
        this.judulBuku = judulBuku;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }
    
    public String getKodeBuku(){
    return kodeBuku;
    }
    
    public void setKodeBuku(String kodeBuku){
    this.kodeBuku = kodeBuku;
    }
    
    public String getJudulBuku(){
    return judulBuku;
    }
    
    public void setJudulBuku(String judulBuku){
    this.judulBuku = judulBuku;
    }
    
    public String getPengarang(){
    return pengarang;
    }
    
    public void setPengarang(String pengarang){
    this.pengarang = pengarang;
    }
    
    public String getPenerbit(){
    return penerbit;
    }
    
    public void setPenerbit(String penerbit){
    this.penerbit = penerbit;
    }
    
     public String getTahun(){
    return tahun;
    }
    
    public void setTahun(String tahun){
    this.tahun = tahun;
    }
}
