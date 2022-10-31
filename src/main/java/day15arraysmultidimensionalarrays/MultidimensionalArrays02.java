package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultidimensionalArrays02 {
    public static void main(String[] args) {

        //kisa yol multidimensdional arrar

        char arr[][]={{'a','b'},{'C','D','E'},{'?'}};

        System.out.println(Arrays.deepToString(arr));


        //bir String multidimensional arrayde icinde "a" olan elemanlari konsola yazdiriniz...

        String brr[][]={{"learn","java","it"},{"is","easy"}};

        for (String [] w: brr){
            for (String k: w){
                if (k.contains("a")){

                    System.out.print(k+" ");
                }

            }


        }


    }
}
