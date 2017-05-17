/*Belajar pewarisan
1. membuat rumus kotak
*/
package belajar_pewarisan;
public class persegi {
// deklarasi panjang dan lebar
    protected int panjang;
    protected int lebar;
    
    //membuat method hasil
    public void set_hasil(int a, int b){
        panjang =a;
        lebar=b;
    }
public int hasil(){
    return (panjang*lebar);
}
  
}
