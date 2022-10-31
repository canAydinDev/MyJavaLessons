package day18arraylistpassbyvalue;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

        //example 1: bir Intereg arraylst teki 7 haric tum elemanlari 2 arttiriniz...
        List<Integer> ages=new ArrayList<>();
        ages.add(12);
        ages.add(7);
        ages.add(21);
        ages.add(78);
        ages.add(9);

        for (Integer w : ages){

            if (w==7){
                continue;
            }
            //w=w+2; list ler boyle update edilemezler...
            ages.set(ages.indexOf(w),w+2);

        }
        System.out.println(ages);
        System.out.println("\t");
        //example 2: size verilen arraylist te 8 ve 8 den onceki tum elemanlari 2 katina cikaariniz.
        List<Integer> nums=new ArrayList<>();
        nums.add(12);
        nums.add(7);
        nums.add(21);
        nums.add(8);
        nums.add(9);
        for (Integer w: nums){
            nums.set(nums.indexOf(w),w*2);
            if (w==8){
                break;
            }

        }
        System.out.println(nums);
        //inclusive dahil, exlusive haric demek

    }
}
