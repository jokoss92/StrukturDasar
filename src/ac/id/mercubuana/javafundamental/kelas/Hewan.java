package ac.id.mercubuana.javafundamental.kelas;

public class Hewan {
    public void cetakNama(String nama){
        System.out.println("Nama hewan: " + nama);
    }

    public static void main(String[] args){
        //menciptakan object dengan nama 'objekHewan
        Hewan objekHewan = new Hewan();
        objekHewan.cetakNama("Elang");
    }
}
