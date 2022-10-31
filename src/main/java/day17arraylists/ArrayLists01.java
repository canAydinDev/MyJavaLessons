package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {
        List<String> names =new ArrayList<>();

        names.add("Tom");
        names.add("Tomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Taceddin");
        System.out.println(names);
        System.out.println("\t");

        List<String> cities =new ArrayList<>();

        cities.add("Trump");
        cities.add("Tom");
        cities.add("Taceddin");
        names.removeAll(cities);// removeall kullandigimizda ilk list degisir parantez icindeki degismez...

        System.out.println(names);

        List<String> myNames =new ArrayList<>();


        myNames .add("Tomas");
        myNames .add("Tahsin");
        boolean sonuc1=names.containsAll(myNames);// bir list in icinde coklu eleman varligini kontrol eder...
        System.out.println(sonuc1);
        System.out.println("\t");

        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);
        // example 1: a list inde Shoes elemaninin ilk gorunumunu siliniz...

        a.remove("Shoes");
        System.out.println(a);

        //example 2: shoes elemainin tum gorunumlerini siliniz...
        List<String> silinecekler=new ArrayList<>();
        silinecekler.add("Shoes");

        a.removeAll(silinecekler);
        System.out.println(a);
        System.out.println("\t");

        //example 3: bir tane salary list i olusturun. eger salary <10000 ise %20 >1000 ise %10 zam yapiniz...

        List<Double> salary=new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);

        for (Double w: salary){
            if (w<10000){
               salary.set(salary.indexOf(w),w*1.2) ;
            }else {
                salary.set(salary.indexOf(w),w*1.1);
            }

     //array listler esit mi...
        }  System.out.println(salary);
        System.out.println("\t");
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');
       // m.add('t');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');

        //1.way...

        int counter=0;// flag kullanmaya alisalim...
        for (int i=0; i<m.size(); i++){
            if (m.size()!=n.size()){
                counter++;
                System.out.println("listler esit degil");
                break;
            }else if(m.get(i)!=n.get(i)){
                counter++;
                System.out.println("listler esit degil");
                break;
            }
        }
        if (counter==0){
            System.out.println("listler esit");
        }
        //2. yol:
        boolean esitmi=m.equals(n);
        if (esitmi){
            System.out.println("listler esittir");
        }else System.out.println("listler esit degil");
    }
}
