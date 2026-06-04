/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: membuat program class hewan
 */
package Praktikum30042026;

/**
 *
 * @author Echa2
 */
public class Hewan {
    protected String nama;
    
    public Hewan (String nama){
        this.nama = nama; 
    }
    
    public void bersuara(){
        System.out.println("Hewan bersuara...");
    }
    
    public void tampilkanNama(){
        System.out.println("Nama Hewan: " + nama);
    }
    
}
