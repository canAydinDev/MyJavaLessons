package day19datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini hesaplayan kodu yaziniz

        LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
        Long diff=ChronoUnit.HOURS.between(germany,japan);
        System.out.println(diff);

        //Example 2: sabit bir tarih olusturunuz..
        LocalDate myDaate=LocalDate.of(2011, Month.APRIL,13);
        System.out.println(myDaate);//2011-04-13
        /*
            java'da sabit datalari (gun, ay eyalet isimleri gibi) depolamak ve ger3ekkince kullanmak icin
            depolar olustururuz. bu depolara "Enum" denir.
         */

        //Example 3: USA icin "Woow" yazin, UK icin "Big" , Canada icin "Cold", Turkey icin "Vatan" , Germany icin "Araba" rwanda icin de "Cay" yazin

        Countries country=Countries.CANADA;
        switch (country){
            case USA:
                System.out.println("Woow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case TURKEY:
                System.out.println("fasist");
                break;
            case GERMANY:
                System.out.println("araba");
                break;
            case RWANDA:
                System.out.println("cay");
                break;
            case CANADA:
                System.out.println("cold");
                break;
            default:
                System.out.println("tanimlanmamis ulke");



        }


    }
}
