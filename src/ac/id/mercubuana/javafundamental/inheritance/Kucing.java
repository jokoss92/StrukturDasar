package ac.id.mercubuana.javafundamental.inheritance;

public class Kucing extends Hewan {
    public Kucing(){
        super();
        System.out.println("construct Kucing");
    }

    public void makan() { //overriding
        System.out.println("Kucing sedang makan");
    }

    public void makan(String food){
        System.out.println("Kucing makan" + food);
    }


}
