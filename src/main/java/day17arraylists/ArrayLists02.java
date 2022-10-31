package day17arraylists;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayLists02 {
    public static void main(String[] args) {

        //verilen bir listteki elemanlari tekrarsiz olarak yaziniz...
        // [2,3,2,2,5] ==> [2,3,5]
        List<Integer> a=new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        System.out.println(a);
        List<Integer> yeni=new ArrayList<>();

        for (Integer w : a){
            if (!yeni.contains(w)){
                yeni.add(w);
            }

        }
        System.out.println(yeni);
        //example 2: kullanicidan bir harf aliniz harf sizdeki listin icinde varsa o harfi "bulundu"ya ceviriniz. yoksa o harfi liste ekleyiniz..
        // [A,K,R,S] kullanici R verdi==> [A,K, BULUNDU, S] kullanici x verdi [A,K,R,S, X ] yazacak...

        Scanner input=new Scanner(System.in);
        String harf;

        List<String> c = new ArrayList<>();
        c.add("A");
        c.add("K");
        c.add("R");
        c.add("S");
            do {
                System.out.println("lutfen bir harf giriniz...");
                harf = input.next().substring(0, 1);
                if (c.contains(harf)) {
                    c.set(c.indexOf(harf), "Bulundu");
                } else {
                    c.add(harf);
                }
            }while (!harf.equals("Q"));
        System.out.println(c);
    }
}
