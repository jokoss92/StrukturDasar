package ac.id.mercubuana.javafundamental.operator;

public class OperatorCondition {
    public static void main(String[] args){
        int value1 = 4;
        int value2 = 5;

        System.out.println("Conditional AND");
        boolean hasil = value1 == 3 && value2 == 5;
        boolean hasil2 = value1 != 3 && value2 == 5;

        System.out.println("Hasil Operator AND pada syarat value1 == 3 dan value2 == 5 adalah " + hasil);
        System.out.println("Hasil Operator AND pada syarat value1 != 3 dan value2 == 5 adalah " + hasil2);
        System.out.println();
        System.out.println("Conditional OR");

        boolean hasil3 = value1 == 3 || value2 == 5;
        boolean hasil4 = value1 != 3 || value2 == 5;

        System.out.println("Hasil Operator OR pada syarat value1 == 3 dan value2 == 5 adalah " + hasil3);
        System.out.println("Hasil Operator OR pada syarat value1 != 3 dan value2 == 5 adalah " + hasil4);
        System.out.println();
    }
}