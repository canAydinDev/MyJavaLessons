package day22inheritancepolimorphism;

public class Car extends Vehicle{
    public  String color;
    public int km;
    public Car(){

    }
    public Car(String color,int km){
        super("Car");
        this.color=color;
        this.km=km;
        System.out.println("car constructor");
    }

}
