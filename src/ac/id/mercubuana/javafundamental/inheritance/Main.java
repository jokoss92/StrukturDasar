package ac.id.mercubuana.javafundamental.inheritance;

public class Main {
    public static void main(String[] args){
        Hewan hewan = new Hewan(); // memanggil constructor
        System.out.println("Apakah IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------------------------------------");

        Kucing kucing = new Kucing(); // memanggil constructor
        System.out.println("Apakah IS-A Objek -> " + (hewan instanceof Object));
        System.out.println("Apakah IS-A Hewan -> " + (hewan instanceof Hewan));
        System.out.println("Apakah IS-A Kucing -> " + (hewan instanceof Kucing));

        System.out.println("------------------------------------------------------");

        hewan.makan();
        kucing.makan();
        kucing.makan("daging ikan");
    }

}



