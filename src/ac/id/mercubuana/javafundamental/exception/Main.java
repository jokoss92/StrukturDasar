package ac.id.mercubuana.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
//        try {
////            String location = ;
//            File file = new File("/home/joko-ss/test.txt");
//            FileReader fr = new FileReader(file);
//            System.out.println("Read file berhasil");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
        int[] a = new int[5];
        try {
            System.out.println("Akses elemen ke 5 :" + a[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown :" + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen terakhir: " + a[4]);
        }
    }
}
