package day23inheritancepolymorphism;

public class Bird extends Animal{
    /*
       "final" keyword nedir?

       "final" keyword i) variable'larda kullanilabilir
                              public final int age=12;
                              a)atanan deger degistirilemez
                              b)deger atamasi yapmak zorundasiniz

                       ii) method'larda kullanilabilir
                              public final int add(){return a+b}
                              a) bir method final ise o method'un body'si asla degistirilemez
                              yani bu durumda final method'lar override edilemezler

                       iii) class'larda kullanilabilir
                             bir class'i "final" yaparsaniz o class'i kisirlastirmis olursunuz.
                             bir class "final" ise o class'a extend edilemez yani onun child'i olusamaz
                             "final" class child olabilir(object class ) in child i sonucta...
     */
}
