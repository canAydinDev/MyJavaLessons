package day28abstraction;

public class Cat extends Mammal{
    @Override
    public void eat() {
        System.out.println("cats eat...");
    }

    @Override
    public void move() {
        System.out.println("cats move...");
    }
}
