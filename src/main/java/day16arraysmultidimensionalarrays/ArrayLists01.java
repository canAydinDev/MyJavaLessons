package day16arraysmultidimensionalarrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
        arraylistler ayni data tipine sahip birden fazla datayi depolamak icin kulanilir
        ***Array ile arraylist in farki nedir:
        1. array olustururken array in icine kac tane eleman koymamiz gerektigini soylemeliyiz ve soyledigimiz eleman sayisindan fazla eleman koyamayiz
        Arrayler eleman sayisinda fixed dirler
        Arraylist leri olstururken eleman sayisi soylemeye gerek yok cunku Arraylist ler eleman sayisinda flexible dirler...

        2.Array lerin icine primitive ve reference ler konabilir.
        Arraylist lerin icine sadece non-primitive ler konulabilir. yani int yerine INTIGER gibi..

        3.Array ler superfast tir , array ler memory i cok az kullanir.
        not:uzunlugundan emin oldugunuz coklu datalarda array kullanin ama eleman sayisi degisken ise arraylist kullanin...
         */

        ArrayList<Integer> ages=new ArrayList<Integer>();
        ArrayList<Integer> height=new ArrayList<>();
        List<Integer> nums=new ArrayList<>();
        System.out.println(nums);

        //Arraylist lere nasil eleman eklenir
        nums.add(21);
        System.out.println(nums);
        nums.add(18);
        nums.add(20);
        System.out.println(nums);
        //add her zaman elemani en sona ekler...insertion order denir
        nums.add(1,50);
        System.out.println(nums);
        List<Integer> prices=new ArrayList<>();
        prices.add(23);
        prices.add(185);
        nums.addAll(prices);
        System.out.println(nums);
        nums.addAll(2,prices);
        System.out.println(nums);
        int elemanSayisi=nums.size();
        System.out.println(elemanSayisi);

        //arraylist lerde herhangi bir eleman nasil secilir...

        int elemanBir=nums.get(2);
        System.out.println(elemanBir);

        //arraylist in bos olup olmadigini nasil anlariz...
        boolean bosMu=nums.isEmpty();
        System.out.println(bosMu);
        boolean bosIki=ages.isEmpty();
        System.out.println(bosIki);

        //arraylist te bir eleman nasil degistirilir...
        nums.set(3,200);
        System.out.println(nums);
        //example 1:  nums arraylist teki tum tek sayilari 11 arttirdiktan sonra ekrana yazdiriniz...

        for (int w: nums){
            if (w%2!=0){
                nums.set(nums.indexOf(w),w+11);
            }

        }
        System.out.println(nums);

        //remove icine tamsayi koyarsaniz java onu index olarak kabul eder.
        //ustu cizili artik kullanmayin yakinda sililenec...
        //Arraylist lerde tum tamsayilar primitive dir. 200 yazinca java onu index olarak dusunuyor.
        // o yuzden primitivee  i wrapper class a cevirirsek non primitive olur yani index olamaz
        Integer sayi=34;
        nums.remove(sayi);
        System.out.println(nums);

    }
}
