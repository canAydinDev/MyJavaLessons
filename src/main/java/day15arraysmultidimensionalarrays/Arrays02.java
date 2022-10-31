package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //size verilen pozitif ve negatif sayilkalr iceren bir int array daki en buyuk - ve en kucuk + olani bulunuz...

        int arr[]={-12,18,-5,23,-2,0};
        Arrays.sort(arr);
        int maxNegative=arr[0];
        int minPozitive=arr[arr.length-1];

        for (int w: arr){

           if (w<0){
               maxNegative=Math.max(maxNegative,w);

           }
           if (w>0){
             minPozitive=  Math.min(minPozitive,w);
           }

        }
        System.out.println("maxNegative: " +maxNegative);
        System.out.println("\t");
        System.out.println("minPozitive: "+ minPozitive);







    }
}
