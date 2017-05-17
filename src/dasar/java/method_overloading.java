//method overloading
/*-->sama dengan method biasa bedanya
dalam satu kelas terdapat banyak method
*/

package dasar.java;
public class method_overloading {
    public static void main(String[] args) {
        System.out.println(tambah(34, 67));
        System.out.println(tambah(34.6,67.9 ));
        System.out.println(tambah("halo","test"));
    }
    public static int tambah(int a,int b){
        return (a+b);
    }
    public static double tambah(double a,double b){
        return (a+b);
    }
    public static String tambah(String a,String b){
        return (a+b);
    }


}
