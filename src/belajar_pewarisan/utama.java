
package belajar_pewarisan;
public class utama {
    public static void main(String[] args) {
       persegi psg = new persegi();
        segitiga sgt = new segitiga();
        
        psg.set_hasil(10, 12);
        sgt.set_hasil(8, 6);
        
        System.out.println(sgt.area());
        System.out.println(psg.hasil());
    }
    
}
