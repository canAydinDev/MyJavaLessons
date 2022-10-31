package day22inheritancepolimorphism;

public class HondaAccord extends Honda{
    /*
       1) Siz class olsuturdugunuzda Java otomatik olarak size gorunmez bir constructor verir.
       cunku Java class'in bir tamplet (kalip) oldugunu ve object olusturulmak icin yaratildigini ve object olusturmak icin
       constructor'un sart oldugunu bilir.
       2) Javanin otomatik olusturdugu bu gorunmez constructor'a default constructor denir.
       3) Siz kendiniz herhangi bir constructor olusturdugunuzda java default olani kaldirir
       4) Bir Class'da birden fazla constructor olabilir.Fakat bu constructor'larin parametreleri farkli olmalidir.
       5) this keyword bu class anlamindadir. "this.price" demek bu class'daki price isimli variable demektir.
          "this.price" sintax'i constructor'larin icinde kullanilir
       6) constructer kullanarak variable'lar uzerinde yaptigimiz degisimler sadece object uzerindeki variable'larin
          degerlerini degistirir. class'taki variable degerlerini degistiremez.


     */

    public int price;
    public String make;
    public  String model;
    public int year;

    public HondaAccord(){
    }

    public HondaAccord(int price){
        this.price=price;
    }

    public HondaAccord(int price,int year){

        this.price=price;
        this.year=year;
        System.out.println("honda accort constructor");
    }

    public HondaAccord(int price,int year,String make, String moder){
        this.price=price;
        this.year=year;
        this.make=make;
        this.model=moder;
    }

}
