package day14arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrrays01 {
    //arrayslerin icine sadece primitive data tipleri ve reference lar yerlestirilebilir...

    public static void main(String[] args) {

//       String   str[]={"java","did","surprise you"};
////        str[0]="java";
////        str[1]="did";
////        str[2]="surprise you";
////        System.out.println(Arrays.toString(str));
//        String arr[]={"jane","mark","christopher","tom","ali","rojda"};
//
//        for (String w :arr){
//            System.out.print(w+" ");
//
//            if (w.equals("tom")){
//                break;
//
//            }
//        }
//        String arr[]={"jane","mark","christopher","tom","ali","rojda"};
//        for (String w : arr){
//            if (w.equals("tom")||w.equals("jane")){
//                continue;
//            }else
//                System.out.println(w+" ");
//
//        }
        Scanner input=new Scanner(System.in);
        System.out.println( "kac ogrenci ismi gireceksiniz");
        int numOfStd= input.nextInt();

        String names[]=new String[numOfStd];
        for (int i=1; i<=numOfStd; i++){
            System.out.println("lutfen "+i+". ogrencinin ilk ismini giriniz...");
            names[i-1]=input.next();

        }
        System.out.println(Arrays.toString(names));

    }
}
