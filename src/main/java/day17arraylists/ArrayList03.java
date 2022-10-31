package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

        //example 1: bir list'deki elemanlardan birbirine en yakin olan ikisini bulunuz...
        // [12,15,19,30,21]  ==> ekrana 19 ve 21 yazdiracagiz..

        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(19);
        a.add(15);
        a.add(30);
        a.add(21);

        Collections.sort(a);
        int minFark=Integer.MAX_VALUE;

        for (int i=1; i< a.size(); i++){

            minFark=Math.min(minFark,a.get(i)-a.get(i-1));


        }
        for (int i=1; i< a.size(); i++){
            if ((a.get(i)-a.get(i-1))==minFark){
                System.out.println("Sayilar: "+a.get(i-1)+" "+ a.get(i));

            }
        }






    }

}
