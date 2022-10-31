package day24statickeywordencapsulation;

public class Car {

    public static  String make="honda";
    public      String model="accord";
    public  int price=20000;
    public static  int counter=0;

    public Car(){
        counter++;
        price++;
    }
}
