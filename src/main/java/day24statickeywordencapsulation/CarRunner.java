package day24statickeywordencapsulation;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        Car car2=new Car();
        Car car3=new Car();
        Car car4=new Car();

        System.out.println(Car.counter);
        System.out.println(car1.price);

        System.out.println(Car.counter);
        System.out.println(car2.price);

        //static keyword nedir?
        //statis keyword class'a baglanmis class elemanlaridir
        //static variable static method class a baglidir

        //static elemanlari classtaki butun nesnelerin ortak elemanidir

        //staticler uzerinde yapilaN her degisiklik butun objeleri etkiler butun objelerde gorulur

        //static class elemanlarina class uzerinden ulasilir. objeler statice ulasmak icin kullanilmaz tavsiye edilmez

        //staticler override edilemez demistik

    }
}
