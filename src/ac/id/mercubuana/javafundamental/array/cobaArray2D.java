package ac.id.mercubuana.javafundamental.array;

public class cobaArray2D {
    public static void main(String[] args){
    char[][] arrChar = new char[2][];
    arrChar[0] = new char[3];
    arrChar[1] = new char[5];
    //Dimensi 1 yang indeksnya 0 memiliki panjang elemen 2
        arrChar[0][0] = 'A';
        arrChar[0][1] = 'B';
        //Dimensi 1 yang indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = 'C';
        arrChar[1][1] = 'D';
        arrChar[1][2] = 'E';
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 0 : " + arrChar[0][0]);
        System.out.println("Dimensi 1 dengan indeks 0 dan Dimensi 2 dengan indeks 1 : " + arrChar[0][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 0 : " + arrChar[1][0]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 1 : " + arrChar[1][1]);
        System.out.println("Dimensi 1 dengan indeks 1 dan Dimensi 2 dengan indeks 2 : " + arrChar[1][2]);

    }



}
