package day22inheritancepolimorphism;

public class Mammal extends Animal{
    public  int a=13;

    public  int b=34;
    public void eat(){
        System.out.println("mammal eats");
    }
    public void drink(){
        System.out.println("mammal drinks");
    }
    public  Mammal(){
        System.out.println("mammal");
    }

}
