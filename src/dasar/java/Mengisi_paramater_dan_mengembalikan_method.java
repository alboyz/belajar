 /*Ini belajar mengisi paramater dan mengembalikan method
  1. Buat Methodnya terlebih dahulu 
  2. Panggil Methodnya di bawah  public static void main(String[] args) {
   */

package dasar.java;
public class Mengisi_paramater_dan_mengembalikan_method {
    //Disini saya  akan memanggil method 
    //kebetulan nama methodnya say_hello
    //kemudian isi  dengan fungsi method 
    //isi fungsi method langsung dengan value yang ingin dicetak, dalam hal ini contohnya adalah adit
    
    public static void main(String[] args) {
        say_hello("Adit");
        //memanggil method tambah
        System.out.println("Hasil Penjumlahan tambah");
        tambah(50, 75);
        
        //memanggil method tambah  dengan return
        
        int sum=tambah_pakai_return(50, 89);
        System.out.println("hasil penjumlahan dengan return : "+sum);
    }
    //Method
    //String name adalah sebuah isi paramater yang berada di method say_hello
    //name adalah fungsi paramater,nama fungsi tidak harus name 
    public static void say_hello(String name){
        System.out.println("Selamat Belajar "+name);
}
    //membuat method angka
    public static void tambah(int a,int b){
        System.out.println(a+b);
    }
    //membuat method dengan return
    public static int tambah_pakai_return(int c,int d){
        return (c+d);
    }
}
