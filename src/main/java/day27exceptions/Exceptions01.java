package day27exceptions;

public class Exceptions01 {

    public static void main(String[] args) {
       double r1=compareNumOfCharacters("Java", "xy");
        System.out.println(r1);
        double r2=compareNumOfCharacters(null, "xy");
        System.out.println(r2);
        double r3=compareNumOfCharacters("Java", "");
        System.out.println(r3);
    }
    //Verilen iki Stringden birinin karakter saisinin digerinin kac kati oldugunu veren method olusturunuz

    public static double compareNumOfCharacters(String s, String t){
        double result=0;
        try {
           result=s.length()/t.length();
        }catch (NullPointerException e){
            System.out.println("length methodu null ile kullanilamaz");
        }catch (ArithmeticException e){
            System.out.println("herhangi bir sayi 0 ile bolunemez");
        }finally {
            System.out.println("database ile connection kesildi");
        }
        return result;
    }
    /*
       "final", "finally", "finalize" aciklayiniz.
       1)"final" bir keyword'dur. Variable class ver Methodlar icin kullanilir.
       2)"finally" bir "code block"dur.
         "try-catch" veya sadece "try" ile kullanilir
         "finally" code block icine yazilan code'lar her halukarda calistirilir.
         Mesela database ile connection'u kesmek herhalukarda yapilmasi gereken bir fiildir. bunu "finally" ile yapabiliriz.
       3)"finalize" bit method'dur. Bu method java tarafindan datalar imha edilmeden once cagrilir. Bu method datalari
         imha edilecek hale getirir ve daha sonra "garbage collector" bu data'lari imha eder.

         Note: "finalize" method'unu java developerlar da cagirabilir ama java kendi bildigini yapar.
     */

}
