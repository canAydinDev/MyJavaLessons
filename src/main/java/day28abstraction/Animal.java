package day28abstraction;

public abstract class Animal {

    //body'si olmayan method'lar "abstract method" olarak adlandirilir.
    //Note: bir method'u abstract yapmak icin; i)method body'i sil  ii)abstract keyword kullan
    //"abstract method" lar "abstract class" icinde olmalidir.

    //Bir method parent class'da abstract method ise
    //child class o method'u override edip kullanmak zorundadir.
    //Bu yuzden herhangi bir fonksiyonu child class icin mecburi yapmak isterseniz o method'u "abstract" yapmalisiniz.
    public abstract void eat();

    //"abstract class"'larda hem "abstract method" hem de "concrete(non-abstract) method" kullanilabilir.
    public void drink(){
        System.out.println("Animals drink...");
    }

    //abstarc move method olusturunuz

    public  abstract void move();
}
