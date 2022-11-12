package day29abstractioncollections;

/*
    "abstract method" lar sadece ne yapilacagini soyler (what to do)
    "concrete method"lar ne yapilacagi ile birlikte nasil yapilacagini da soyler(how to do)

    "interface" ler yapilacak isler listesidir(To do list)

    "multiple parent interface kullandiginizda  ayni method ismi ile birden fazla method olusturursaniz bu methodlarin return type lari
     ayni olmalidir. aksi takdirde hata verir.

     "interface" lerde constructor olmadigi icin interface'lerden obje olusturulamaz.
     "abstract class" larda class olduklari icin constructor vardir.Ama constructor'lar abstract class'larda object olusturamazlar

     yani java'da 2 seyden obje olusturulamaz i)abstract class ii)interface

     Soru: "Abstract Class" ile Interface in farklari nelerdir?"
             1)Method
                  "Abstract Class" hem abstract hem de concrete method lar icerebilir.
                  "Interface"ler sadece abstract method'lar icerir
                  Ama istersek Interface'ler icinde de "default" ve "static" keyword'ler kullanarak concrete method'lar olusturabiliriz.

             2)variable
                  "Abstract Class" larda normal Class'lar gibi her turlu variableolusturulabilir.
                  "Interface"lerde ise variable'lar public static ve final olmak zorundadir.

             3)Inheritance
                  "Abstract Class" Class olduklari icin multiple inheritance'a musaade etmezler.
                  "Interface"lerde ise multiple inheritance'i desteklerler.

             4)Object Creation
                  "Abstract Class"larda constructor vardir ama object olusturmakta kullanilamazlar.
                  "interface" lerde ise constructor olmadigindan object olusturulamaz

    Soru:  Object Oriented Programing Language Principles nelerdir?
          1)Inheritance
          2)Polimorphism
          3)Encapsulation
          4)Abstraction


 */
public class Civic implements Engine,Ac{


    @Override
    public void run() {
        System.out.println("civic runs well");
    }


}
