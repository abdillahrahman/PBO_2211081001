/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abdiUTS.model;

/**
 *
 *
 */
public class Tagihan {
    private String kode;
    private String nama;
    private String meter1;
    private String meter2;
    private String tarif;
    private String diskon;
    
            
    
    public Tagihan{}
    
    public Tagihan(String kode, String nama, String meter1, String meter2, String tarif, String diskon){
        this.kode = kode;
        this.nama = nama;
        this.meter1 = meter1;
        this.meter2 = meter2;
        this.tarif = tarif;
        this.diskon = diskon;
    }
    
    public void setKode(String kode){
        this.kode = kode;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMeter1(String meter1){
        this.meter1 = meter1;
    }
    public void setMeter2(String meter2)
        this.meter2 = meter2;
    }
    public void setTarif(String tarif)
        this.tarif = tarif;
    }
    public void setDiskon(String diskon)
        this.diskon = diskon;
    }



    public String getKode(){
        return kode;
    }
    public String getNama(){
        return nama;
    }
    public String getMeter1(){
        return meter1;
    }
    public String getMeter2(){
        return meter2;
    }
    public String getTarif(){
        return tarif;
    }
    public String getDiskon(){
        return diskon;
    }
}
