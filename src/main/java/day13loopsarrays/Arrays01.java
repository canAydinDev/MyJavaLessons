package day13loopsarrays;

import java.util.Arrays;
import java.util.Collections;

public class Arrays01 {
    public static void main(String[] args) {

        int stdAges[] = new int[7];

        System.out.println(Arrays.toString(stdAges));
        stdAges[1]=11;
        stdAges[0]=12;
        stdAges[2]=13;
        stdAges[3]=14;
        stdAges[4]=10;
        stdAges[5]=12;
        stdAges[6]=12;

        System.out.println(Arrays.toString(stdAges));

        //Array deki herhangi bir elemani nasil yazdirabiliriz?

        System.out.println(stdAges[4]);

        //example 1: array deki en kucuk ve en buyuk elemani ekrana yazdiriniz

        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        //not: length parantezli stringde ' parantezsiz array lerde kullanilir.
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);

        //not example 2: stdAges array i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz
//
//        int sum=0;
//        for (int i=0; i<stdAges.length; i++){
//
//            sum+=stdAges[i];
//        }
//        System.out.println(sum);
//
//        int sum=0;
//        int i=0;
//        while (i<stdAges.length){
//            sum+=stdAges[i];
//            i++;
//        }
//        System.out.println(sum);

//        int sum=0;
//        int i=0;
//        do {
//            sum=sum+stdAges[i];
//            i++;
//        }while(i<stdAges.length);
//        System.out.println(sum);

        //for each loop en gelismis looptur.
        //mumkunse for each disinda kullanmayin
        //for each loop Array lerde ve Collections larda kullanilir
//        int sum=0;
//        for (int w : stdAges){
//
//            sum=sum+w;
//        }
//        System.out.println(sum);
//

        //example 3: String bir array olusturunusz.

//        String str[]=new  String[5];
//
//        str[0]="Ali";
//        str[1]="Tom";
//        str[2]="Veli";
//        str[3]="Kemal";
//        str[4]="Cem";
//
//        int sum=0;
//        for (String w: str){
//            sum=sum+w.length();
//        }
//        System.out.println(sum);

        char ch[]={'A','c','D','k','m'};
        for (char w: ch){
            if (w>='A'&&w<='Z'){

                System.out.print(w);
            }
        }
    }
}
