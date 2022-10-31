package day23inheritancepolymorphism;

public class Math extends  Courses{

    public Math(){
        super("x");
        System.out.println("constructor1");
    }
    public Math(int a){
        this();//ayni class in icinde diger constructor u kullan
        System.out.println("constructor2");
    }
    public void practice(){

        System.out.println("Solve questions");
    }
}
