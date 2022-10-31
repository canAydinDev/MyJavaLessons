package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays02 {
    public static void main(String[] args) {
//        int original[]={0,2,3,0,12,0};
//
//        int newArr[]=new int[original.length];
//        int idx=0;
//        for (int i=0; i< original.length; i++){
//            if (original[i]!=0){
//                newArr[idx]=original[i];
//                idx++;
//            }
//        }
//        System.out.println(Arrays.toString(newArr));

        //bir array in icinde herhangi bir elemanin olup olmadigini ve kac kere tekrarlandigini gosteren kodu yaziniz...
//        System.out.println("bir int gir");
//        int num=2;
//        int counter=0;
//        int arr[]={2,1,2,-3,2};
//        for (int w:arr){
//            if (w==num){
//                counter++;
//            }
//
//        }
//        if (counter>0){
//            System.out.println(num+" array de "+counter+" defa vardir.");
//        }else
//            System.out.println(num+" array de yok");

      String sentence=("Java kolaydir calisana, ne kolay ki calismayana.");
      sentence=sentence.replaceAll("\\p{Punct}","");
      String words[]=sentence.split(" ");

      Arrays.sort(words, Comparator.comparingInt(String::length));
      System.out.println(Arrays.toString(words));

      String son=words[words.length-1];

        System.out.println(son);
        System.out.println(words[2]);
        System.out.println("\t");
        System.out.println("www");




    }
}
