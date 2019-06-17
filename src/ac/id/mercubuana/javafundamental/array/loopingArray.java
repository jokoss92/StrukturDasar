package ac.id.mercubuana.javafundamental.array;

public class loopingArray {
    public static void main(String[] args){
        int[] arrInt = new int[1000000];

        //Inisiasi arrInt dari element ke 1 sampai 1000000
        for(int x = 0; x < arrInt.length; x++){
            arrInt[x] = x + 1;

            //Tampilkan arrInt dari elemen ke sampai 1000000
            System.out.println(arrInt[x]);
        }
    }
}
