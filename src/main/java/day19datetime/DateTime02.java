package day19datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1: Java dan aldiginiz date i "ay/gun/yil" olarak yaziniz...
        LocalDate currentDate=LocalDate.now();// 2022-10-21
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yyyy");//==> 10dan kucuk aylari 01,02,03 diye yazar
        String formattedDate=dtf1.format(currentDate);// 10/21/2022
        System.out.println(formattedDate);

        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yyyy");
        String formattedDate2=dtf2.format(currentDate);// 10/21/2022
        System.out.println(formattedDate2);//Oct/21/2022

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMM/dd/yyyy");
        String formattedDate3=dtf3.format(currentDate);// 10/21/2022
        System.out.println(formattedDate3);//October/21/2022

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("M/dd/yyyy");
        String formattedDate4=dtf4.format(currentDate);// 10/21/2022
        System.out.println(formattedDate4);//10/21/2022

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MM/dd/yy");
        String formattedDate5=dtf5.format(currentDate);// 10/21/2022
        System.out.println(formattedDate5);//10/21/22

        //Example 2: java dan aldiginiz time in formatini degistiriniz...
        LocalTime myTime=LocalTime.of(16,23,54,2345);
        System.out.println(myTime); //16:23:54.000002345
        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("HH:mm");// H ile 24 saat h ile 12 saat dilimi seklinde yazar
        DateTimeFormatter dtf8=DateTimeFormatter.ofPattern("hh:mm a"); //04:23 PM seklinde yazar
        String formattedMyTime=dtf7.format(myTime);
        String formattedMyTime2=dtf8.format(myTime);
        System.out.println(formattedMyTime);
        System.out.println(formattedMyTime2);
    }
}
