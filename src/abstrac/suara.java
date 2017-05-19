
package abstrac;
public class suara extends hewan{
@Override
public void suara_kuda(){
    System.out.println("suara kuda krikrik");    
}    

    @Override
    public void suara_ayam() {
        System.out.println("suara ayam berkokok");
    }
    public static void main(String[] args) {
        suara kuda = new suara ();
        suara ayam = new suara ();
        kuda.suara_kuda();
        ayam.suara_ayam();
    }
}

