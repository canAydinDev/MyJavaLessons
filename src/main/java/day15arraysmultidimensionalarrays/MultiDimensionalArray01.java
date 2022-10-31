package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray01 {

    public static void main(String[] args) {

//        int arr [][]={{2,5,1},{32,75},{13,21,43,56}};
//
//        int sum=0;
//        for (int[] w: arr){
//            for (int k: w){
//                sum+=k;
//            }
//        }
//        System.out.println(sum);
//        System.out.println("\t");

        int arr[][]={{2,5,1},{32,75}};


        int sum=0;
        for (int[] w:arr){
           sum+=w.length;

        }
     int crr[]=new int[sum];
        int i=0;
        for (int [] w: arr){
            for (int k:w){
                crr[i]=k;
                i++;
            }
        }
        System.out.println(Arrays.toString(crr));



    }
}
