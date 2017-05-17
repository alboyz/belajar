
package belajar_polymorpshim;
public class panggil {
    public static void main(String[] args) {
        utama hewan = new utama ();
        suara_jaran kuda = new suara_jaran();
        suara_ayam ayam = new suara_ayam();
        
        hewan.suara();
        
        hewan = kuda;
        hewan.suara();
        
        hewan = ayam;
        hewan.suara();
    }
    
}
