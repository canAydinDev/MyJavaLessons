package day22inheritancepolimorphism;

public class Runner {
    public static void main(String[] args) {

        //inheritance'da veriable'lar secilirken Java object'in data type'ina bakar.
        //oncelikle istedigimiz variable'i object'in data type'i olan class'da arar.
        //o class'da bulamazsa parent class'lara bakar
        //hicbir parent class'da bulamazsa hata verir
        Cat cat1=new Cat();
        System.out.println(cat1.a);//14
        System.out.println(cat1.b);//34
        System.out.println(cat1.c);//45
        Mammal cat2=new Cat();
        System.out.println(cat2.a);//13
        Animal cat3=new Cat();
        System.out.println(cat3.a);//12


        //inheritance'da variable'lar secilirken Java constructor'a bakar.
        //oncelikle istediginiz methodu constructor'i kullanilan class'tan alir
        //O classda bulamazsa parent class'lara bakar.
        //Hicbir yerde o method'u bulamazsa hata verir.
        Cat cat4=new Cat();
        cat4.eat();//cat eats
        cat4.drink();//mammal drinks

        Mammal cat5=new Mammal();
        cat5.eat();//mammal eats

        Animal cat6=new Animal();
        cat6.eat();//animal eats





    }
}
