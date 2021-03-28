/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo5.pkg2022431708.latihan52.siapa_kamu;

/**
 *
 * @author
 * Nama : Fadly Hadi Wijaya
 * Nim : 2022431708
 * Kelas : PBO - FS112B
 * Deskripsi Program : Program ini berisi Program untuk Menampilkan Nim Dosen , Mahasiswa 
 *
 */
public class PBO52022431708Latihan52Siapa_kamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      Manusia manusia = new Manusia();
      Dosen dosen = new Dosen();
      Mahasiswa mahasiswa = new Mahasiswa();
      

          dosen.setGetNip("41227829930");
          System.out.println("Nip Dosen  : "+dosen.getNip());
          dosen.siapaKamu();
          System.out.println();
          System.out.println();
          dosen.mengajarApa();
          
          mahasiswa.setNim("10110269");
          System.out.println("Nim Mahasiswa : "+mahasiswa.getNim());
          mahasiswa.siapaKamu();
          mahasiswa.kelasApa();
    }
    
}
