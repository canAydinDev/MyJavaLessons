package day20stringbuilderstringbuffer;

public class StringBuilder01 {
    /*
    1) StringBuilder String olusturmaya yarayan bir class tir.
    2 String class varken neden StringBuilder a ihtiyac duyariz?
        cunku string class "immutable class" tir. ama biz bazen "mutable" stringlere ihtiyac duyariz
    3) StringBuilder bize "mutable" string verir. immutable==>duragan/degisime kapali
                                                   mutable==> degisime acik
    4) immutable class larda var olan deger degistirilemez. siz varolan bir degeri degistirmek istediginizde
       i) heap memory'de yeni bir variable yeni bir deger ile olusturulur
       ii) eski variable'in pointeri yeni variable'a dondurulur..
       iii) eger bir variable i hicbir pointer gostermiyor ise o variable "garbage collector" tarafindan silinir...

       "mutable class" larda varolan deger degistirilebilir, orjinal deger korunmaz.

    5) String classlarin immutable yapisi securty icin onemlidir. ayni degere ahip birden fazla string oldugunda java 1 tane container olusturur ve
       ayni degere sahip stringlerin bu container'i kullanmasini temin eder. bu memory'i korumak icin iyidir.
       ancak containerdeki degeri bir variable icin degistirdigimizde tum variable'larin etkilenmesi tehlikesi vardir.
       bu tehlikeden kurtulmak icin java string'leri immutable yani degismez yapmistir. fakat herhangi bir variable in degerini
       degistirmek icin java bir yol bulmustur. degistirmek istediginiz variable icin yeni bir container olusturur ve variable in pointerini
       bu yeni variable a yonlendirir. boylelikle hem degisim saglanmis hem de digerleri etkilenmemis olur.
     */
    public static void main(String[] args) {
        String str="Java";
        //StringBuilder nasil olusturulur?
        //1. yol
        StringBuilder strb1=new StringBuilder("Java");
        System.out.println(strb1);//Java

        //2. yol
        StringBuilder strb2=new StringBuilder();
        strb2.append("Java");
        System.out.println(strb2);//Java
        //ekleme yol-a
        strb2.append(" is easy");
        strb2.append("!!!");
        System.out.println(strb2);
        System.out.println(strb1);
        //ekleme yol-b
        strb2.append(" learn").append("Java earn").append(" money.");
        System.out.println(strb2);

        //StringBuilder larda character sayisi nasil bulunur? ==> .length()
        StringBuilder strb3=new StringBuilder();
        strb3.append("Cat");
        strb3.append("xxxxxxxxxxxxxxxx");
        int numOfChar=strb3.length();
        System.out.println(numOfChar);//3

        int capacity=strb3.capacity();
        System.out.println(capacity);//==> capacity asildiginda; varolanin 2 katinin 2 fazlasina cikar
        strb3.append("mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
        int capacity2=strb3.capacity();
        System.out.println(capacity2);// 34x2+2==>70

        strb3.setCharAt(2,'r');// index 2 deki character i r'ye cevirir
        System.out.println(strb3);// ==>car

        strb3.delete(3,19);//==> ilk index dahil ikinci haric (genelde javada 2. index harictir)
        System.out.println(strb3);

        strb3.deleteCharAt(2);//==> index 2 dekini siler
        System.out.println(strb3);//Cammmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //mutable'larda sadece metod kullanmak orjinal degeri degistirmek icin yeterlidir
        strb3.reverse();//==> ters cevirir
        System.out.println(strb3);//mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC

        //immutable'larda methodu kullanmak orijinal degeri degistirmek icin yeterli olmaz. bir de atama yapmalisiniz
        String abc="Java";
        abc.replace("a","i");
        System.out.println(abc); //Java
        abc= abc.replace("a","i");
        System.out.println(abc);//Jivi

        strb3.toString();//==>StringBuilder'lari String'e cevirir
        String stringStrb3=strb3.toString();
        System.out.println(stringStrb3);

        StringBuilder strb4=new StringBuilder(stringStrb3);// String'den StringBuilder'a ceviriyoruz
        System.out.println(strb4);

        strb4.insert(3,"XXXX");//==> ilk 3 character'i atla XXXX koy. insert araya koy demek
        System.out.println(strb4);//mmmXXXXmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmaC
        strb4.insert(3,"KlMNOPQR",5,8);//++> 3. characterden sonra sana verilen characterlerin ("KlMNOPQR")
                                                         // index 5 ile index 8 arasindaki(5,6,7) deki characterlerini araya yerlestirir
        System.out.println(strb4);

        //compareTo i) tamamen ayni ise 0 verir.
        //          ii) a alfabetik olarak b den sonra gelirse aradaki alfabetik siralama farkini gosterir
        //          iii) a b den once gelirse - olarak aradaki siralama farkini gosterir
        StringBuilder a=new StringBuilder("Mava");//==> 3
        StringBuilder b=new StringBuilder("Java");
        int sonuc=a.compareTo(b);//==> alfabetik siraya koyup aradaki farki verir
        System.out.println(sonuc);//0









    }
}
