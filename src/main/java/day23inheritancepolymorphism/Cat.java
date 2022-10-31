package day23inheritancepolymorphism;

public class Cat extends Mammal{
    public void meow(){
        System.out.println("cats meow");
    }


    @Override//@override annotation'ini kullanarak javanin yaptigimiz overriede islemini
    // kontrol etmesini saglariz

    public void eat() {
        System.out.println("cats eat");
    }
    /*
       1) Override yaparken sadece method body'si degistirilir.
       2) Override yaparken method signature degistirilemez(isim ve parametre)
       3) Override yaparken 'inheritance" olmak zorundadir.
       4) Override yaparken acces modifier'lar belli kurallara gore farklilastirilabilirler
          i)private methodlar override edilemezler
          ii)child class icindeki override edilen method'un access modifier'i paret classtaki
             method'un access modifier'i ile ayni veya daha genis olmalidir.
             note: child class daki method un access modifier i daha dar olamaz
          iii) default methodlar ayni package icinde iseler override edilebilir farkli package den
             override edilemezler
       5) Parent class'daki method return type'i void ise return type degistirilemez
       6) Parent class'daki methodun return type'i primitive ise degistirilemez
       7) Parent class'daki method un return type'i wrapper class ise return type degistirilemez
       8) Parent class'daki method un return type'i parent class ise return type chil'lardan biri olabilir
          Note: child class'daki return type parent class'takinden genis olamaz
          Note: aralarinda parent child iliskisi olmayan class'lar overriding'de return type degisiminde
          kullanilamazlar. Mesela Short Integer'dan kucuktur ama aralarinda parent child iliskisi olmadigindan Integer
          yerine Short kullanamazsiniz.
          Note: parent child iliskisinde asagidan yukariya icin "is a" iliskisi derler
                parent child iliskisinde yukariya asagidan icin "has a" iliskisi derler
                yani return type'i degistirebilmek icin "is a" olmasi gerekiyor
                Aralarinda "is a" "has a" relationship olan data type'lara "covariant" denir.
          Note: Child'dakine "overriding method" parent'dakine "overridden method" denir.
      9) "final" methodlar override edilemezler, cunku "overriding" in metthod body'si ni degistiremeyiz
          final oldugu icin
      10) Polimorphism= overloading+overriding
          Note: polimorphism nedir derlerse overloading ve overriding'i anlatin.
      11) Overloading ile overriding arasindaki farklar nelerdir?
         i) overloading icin inheritance gerekmez fakat overriding icin gerekir.
         ii)private method'lar overload edilebilir ama override edilemezler.
         iii)final methodlar overload edilebilir override edilemezler.
         iv)overloading static polymorphism overriding dinamik polimorphism olarak adlandirilir
         cunku static method'lar overload edilebilir override edilemezler
         v)"overloading"de method signature degisir ama overridingde method signiture a dokunulmaz

     */



    @Override
    public int add(int a, int b) {
        return a+b+1;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b+1;
    }

    @Override
    public Mammal create() {
        return new Mammal();
    }
}
