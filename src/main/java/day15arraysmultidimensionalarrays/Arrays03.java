package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {


        //bir stringdeki sesli harflerin sayisini bullun

        String str="Java ogrenince para kazanmak kolay, ogrenmeyince ne kolay ki.";
        str=str.toLowerCase();
        String harfler[]=str.split("");
        int counter=0;
        System.out.println(Arrays.toString(harfler));
        for (String w: harfler){
            switch (w){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++;
            }

        }
        System.out.println(counter);
    }
}
