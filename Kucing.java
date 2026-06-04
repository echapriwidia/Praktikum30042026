/*
 * Nama: Echa Priwidia
 * Nim: 2501083005
 * Desk: membuat program class kucing extends class hewan

 */
package Praktikum30042026;

/**
 *
 * @author Echa2
 */
public class Kucing extends Hewan {
    public Kucing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama + " bersuara: Meong!");
    }
    
}
