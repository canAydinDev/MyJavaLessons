package day19datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime01 {
    public static void main(String[] args) {

        //example 01: Anlik tarihi(current date) ekrana yazdiran kodu yazin
        LocalDate currentDate=LocalDate.now();

        System.out.println(currentDate);

        //Example 2: Anlik zamani (current time) ekrana yazdiran kodu yazin
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);

        //Example 2: Anlik tarihi ve anlik zamani (current time) ekrana yazdiran kodu yazin
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);

        //Example 4: Japonyadaki anlik tarihi ve anlik zamani ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeInJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeInJapan);
        LocalDateTime currentDateTimeInIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));

        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore emeklilik tarihini hesaplayan kodu yaziniz
        LocalDate countDate=LocalDate.of(2022,10,21);
        LocalDate retireDate=countDate.plusDays(789);
        System.out.println(retireDate);

        //Exampe 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz..
        LocalDate dobCan=LocalDate.of(1985, 12,6);
        LocalDate dobCansen=LocalDate.of(1990, 5,20);
        Long diff=ChronoUnit.DAYS.between(dobCan,dobCansen); //yasli olan once yazilir...
        System.out.println(diff);

        //Example 8: Tom, Ali den 3 yil 8 ay 13 gun sonra dogdu. Ali ise Veli den 1 yil 15 gun once dogdu.
        //Tom un dogum tarihi 18 kasim 2011 ise Ali nin ve velinin dogum tarihlerini bulunuz...

        LocalDate dobTom=LocalDate.of(2011,11,18);
        LocalDate dobAli=dobTom.plusYears(3).plusMonths(8).plusDays(13);// method chain(method zinciri)
        System.out.println(dobAli);
        LocalDate dobVeli=dobAli.minusYears(1).minusDays(15);
        System.out.println(dobVeli);

        //example 8: istanbulun fethi ile cumhuriyetin kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz...
        LocalDate istFeth=LocalDate.of(1453,5,29);
        LocalDate cumhIlani=LocalDate.of(1923,10,29);
        Long monthDiff=ChronoUnit.MONTHS.between(istFeth,cumhIlani);
        System.out.println(monthDiff);

        //example 9: verilen tarihin hangi burcta oldugunu gosteren programi yaziniz

        LocalDate myDate=LocalDate.of(1989,4,23);
        int day=myDate.getDayOfMonth();
        int month=myDate.getMonthValue();
        if (day>=21&&month==3||day<=20&&month==4){
            System.out.println("boga");
        } else if (day>=21&&month==4||day<=20&&month==5) {
            System.out.println("ikizler");
        } else if (day>=21&&month==5||day<=20&&month==6) {
            System.out.println("yengec");
        }


    }
}
