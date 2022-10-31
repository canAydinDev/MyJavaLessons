package day18arraylistpassbyvalue;

public class MethodOverloading01 {

    /*
       method overloading nasil yapilir?
       1) method isimleri ayni olmalidir
       2) method parametreleri farkli olmalidir.
            i) parametre sayilari degistirilebilir.
            ii)parametrelerin data type lerini degistirilebilir
            iii) parametrelerin yerleri degistirilebilir ancak data type leri farkli ise
       3) method ismi + parametreler = method signature
          method signature disinda ne degistirirseniz degistirin java o methodlari farkli kabul etmez cunku imzaya bakar...

     */

    public static void main(String[] args) {
        add(3,5);
        add(3,5.0);
    }
    public static void add(int a, int b){
        System.out.println(a+b);
    }

    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void add(int a, double b){  // bunu da secebilirdi ama autowidening yapacagi icin digerini tercih etti
        System.out.println(a+b);
    }

}
