/*
 *Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: membuat program mainclass hewan

 */
package Praktikum30042026;

/**
 *
 * @author Echa2
 */
public class mainHewan {
    public static void main(String[] args){
        // TODO code application logic here
        Hewan hewanUmum = new Hewan("Makhluk");
        Kucing kucingku = new Kucing("Jymo");
        Anjing anjingku = new Anjing("Bobby");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        System.out.println();
        
        kucingku.tampilkanNama();
        kucingku.bersuara();
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
        System.out.println();
        
    }
    
}
