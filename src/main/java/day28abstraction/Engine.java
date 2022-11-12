package day28abstraction;

public interface Engine {

    //interace'lerdeki tum method'lar abstract olmak zorundadir.
    //Interface'lerde abstract method olustururken abstract keyword kullanmaya gerek yoktur
    //Cunku java o method'un abstract oldugunu bilir.

    //Interface'lerdeki method'lar java tarafindan otomatic olarak public kabul edilir
    //Bu yuzen o methodlar icin public keyword'u yazmaya gerek yoktur.

    //Yani public abstract void eco(); ile void eco(); ayni anlama gelir.

    //Interface'lerdeki hersey abstract oldugu icin ona "fully abstraction"(tam abstract) derler ama
    // abstract class'larda abstract ve concrete method bir arada kullanildigi  icin "fully abstraction" denmez.

    void eco();

    void gas();

    void tsi();

    //default keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    public  default int add(int a, int b){
        return  a+b;
    }
    //static keyword kullanarak interface'lerin icinde body'si olan method'lar uretebilirsiniz.
    public  static String update(String str){
        return  str+" !";
    }
}
