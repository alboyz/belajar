//Belajar Menggunakan Consturctor
package dasar.java;
public class kubus {
    int panjang;
    int lebar;
    int tinggi;
    
    //method volume kubus
    public int get_volume_kubus(){
        return (panjang*lebar*tinggi);
    }

    public kubus() {
        panjang=10;
        lebar=20;
        tinggi=5;
    }
    //kubus dengan paramater
    kubus(int a, int b, int c){
        panjang=a;
        lebar=b;
        tinggi=c;
    }
    
}
