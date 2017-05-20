
package java_interface;
public class unggas implements hewan{
    @Override
    public void kaki (){
        System.out.println("kaki unggas 2");
    }
 public void suara (){
     System.out.println("suara ayam berkokok");
 }   
    public static void main(String[] args) {
        unggas u = new unggas();
        u.kaki();
        u.suara();
    }
}
