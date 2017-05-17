//memanggil kelas kubus
package dasar.java;
public class panggil_kelas_kubus {
    public static void main(String[] args) {
        kubus kubus1 = new kubus();
        System.out.println("volume kubus"+kubus1.get_volume_kubus());
        
        //memanggil kubus dengan parameter
        kubus kubus2 = new kubus(10, 20, 30);
        System.out.println("Volume kubus dengan paramaeter");
        System.out.println(kubus2.get_volume_kubus());
    }
}
