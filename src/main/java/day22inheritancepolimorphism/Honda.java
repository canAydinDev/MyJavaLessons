package day22inheritancepolimorphism;

public class Honda extends Car{
    public String color;

    public  Honda(){
        super ("white",54000);
        System.out.println("honda constructor");
    }

    public Honda(String color){
        this.color=color;
    }
}
