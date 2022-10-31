package day11loops;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = "Andromedmma";
        int index = str.length() - 1;
        for (int i = 0; i < index + 1; i++) {
            char c = str.charAt(i);
            if (c =='m') {
            continue;
            }
            System.out.print(c);
        }
        System.out.println(" ");

        //1 den 100 e kadar tüm tamsayilari ekrana yazdir. 6 ile bölünenler hariç.

        for (int i=1; i<101; i++){
            if(i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println(" ");

        //verilen stringdeki m den onceki karaklerleri yazdiriniz...
        //luxenburg==>luxe

        String s="Luxemburg";

        for (int i=0; i<s.length(); i++){

            char c=s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
        }
    }
}
