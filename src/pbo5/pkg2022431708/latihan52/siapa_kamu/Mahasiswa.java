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
public class Mahasiswa {
    
    private String nim,kelas;
    
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public String getNim(){
        return nim;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    
    public String getKelas(){
        return kelas;
    }
    
    public void kelasApa(){
        System.out.println("Saya Nindi umur 17 Tahun sedang belajar di kelas PBO2");
    }
    
    public void siapaKamu(){
        System.out.println("Saya Mahasiswa");
    }
    
    
    
}
