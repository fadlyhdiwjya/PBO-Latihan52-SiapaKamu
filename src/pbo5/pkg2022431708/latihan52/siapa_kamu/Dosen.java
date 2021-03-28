/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan52.siapa_kamu;

/**
 *
 * @author HP
 */
public class Dosen extends Manusia {
    
    
    private String nip, mataKuliah;
    
    public void setGetNip(String nip){
        this.nip = nip;
    }
    
    public String getNip(){
        return nip;
    }
    
     public void setMataKuliah(String mataKuliah){
        this.mataKuliah = mataKuliah;
    }
    
    public String getMataKuliah(){
        return mataKuliah;
    }
    
    public void mengajarApa(){
        System.out.println("Saya Rizki Adam Kurniawan umur 27 Tahun sedang Mengajar MataKuliah PBO");
    }
    
    public void siapaKamu(){
        System.out.print("Saya Dosen");
    }
    
    
    
    
}
