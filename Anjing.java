/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: membuat program class anjing extends class hewan

 */
package Praktikum30042026;

/**
 *
 * @author Echa2
 */
public class Anjing extends Hewan{
    public Anjing(String nama){
        super(nama); //Memanggil constructor superclass  
    }
    
    
    @Override
    public void bersuara(){
        super.bersuara(); //Mengakses atribut/method superclass
        System.out.println(nama + " bersuara: Guk guk!");
    }  
}
