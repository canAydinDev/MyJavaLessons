package day12loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
        System.out.println("bir string giriniz: ");
        double num=24.5673;

        String str=String.valueOf(num);

        String decimal=str.split(".")[1];
        int decimaInt=Integer.valueOf(decimal);
        System.out.println(decimaInt);
        int sum=0;
        do{
            sum=sum+decimaInt%10;
            decimaInt/=10;
        }while (decimaInt>0);
        System.out.println(sum);



    }
}
