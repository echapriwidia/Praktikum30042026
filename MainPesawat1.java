/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: membuat program mainclass pesawat 1
 */
package Praktikum30042026;

/**
 *
 * @author Echa2
 */
public class mainPesawat1 {
    public static void main(String[] args){
        //TODO code application logiuc here
        // Membuat Array pesawat
        Pesawat[] daftarPesawat = new Pesawat[3];
        
        //Mengisi elemen array
        daftarPesawat[0] = new Pesawat("Boeing 737", 2015, true, 180);
        daftarPesawat[1] = new Pesawat("Airbus A320", 2020, true, 140);
        daftarPesawat[2] = new Pesawat("Cessna 172", 2008, false, 4);
        
        //Menampilkan semua data pesawat
        for (int i = 0; i < daftarPesawat.length; i++) {
            System.out.println("=== Data Pesawat ke-" + (i + 1) + "===");
            daftarPesawat[i].cetak();
            System.out.println();
        }
    }  
}
