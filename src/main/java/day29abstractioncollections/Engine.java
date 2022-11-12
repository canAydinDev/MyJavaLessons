package day29abstractioncollections;

public interface Engine extends  Vehicle{
    //Child--->Parent
    //Class--->Interface     ==> implements
    //Class---> Class        ==> extends
    //Interface--->Interface ==>extends
    //Interface--->Class     ==> Mumkun degildir

    //interface'lerdeki butun variable'lar otomatik olarak(default) "public"tir.
    //interface'lerdeki butun variable'lar otomatik olarak(default) "final"dir.
    //interface'lerdeki butun variable'lar otomatik olarak(default) "static"tir.
    int price=2000;// public static ve final dir.
    double weight=23.5;
    void run();

}
