package day15arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {

    public static void main(String[] args) {

        //binarySearch kullanmak icin her defasinda Arrys.sort kullanmak lazim
        //binarySearch - olursa yok demek. -5 ==> olsaydi 5. sirada yani4. inmdexte olacakti..
        //binarySearch methodu tekrarlayan elemanlar icin kullanilmaz

        int arr[]={12,31,43,14,43};
        int sayi=43;
        Arrays.sort(arr);// ==> arr 12,14,31,43 oldu
        int idx1=Arrays.binarySearch(arr,sayi);// varsa o elemanin index ini return eder ==> 3 return eder
        System.out.println(idx1);

    }
}
