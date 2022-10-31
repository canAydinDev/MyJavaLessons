package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArray02 {

    public static void main(String[] args) {

        int arr[][]={{2,5,1},{83,75}};

        int maxElement=arr[0][0];
        for (int [] w: arr){
            for (int k: w){
                maxElement=Math.max(maxElement,k);
            }
        }
        System.out.println(maxElement);
    }
}
