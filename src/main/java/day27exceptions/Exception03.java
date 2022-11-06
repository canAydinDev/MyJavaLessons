package day27exceptions;

public class Exception03 {
    /*
       1)Java Exceptionlar olusturarak Developerlar'in Java kurallarina uymalarini temin etmistir.
       2)Biz de Application uretirken kendi Exception'larimizi olusturarak diger developerlarin bizim ortaya koydugumuz kurallara uymalarini temin ederiz.
       3)Java'nin degil, bizim urettigimiz Exceptionlara "Costum Exception" denir.
       4)Custom Exceptionlar da "Runtime Exception" ve "Compiletime Exception" olabilir.
       5)Custom Runtime Exception uretmek icin "extends RuntimeException" deriz.
       6)Custom Compiletime Exception uretmek icin "extends Exception" deriz.
     */
    public static void main(String[] args)  throws IllegalGradeException{
       printGrades(12);
       checkNameFormat("Ali");
    }
    //Ogrenci notlarini yazdiran bir method olusturunuz.

    public static void printGrades(double grade) throws IllegalGradeException {
        if (grade<0||grade>100){
            throw new IllegalGradeException("Grade 0 dan az 100 den cok olamaz");
        }else {
            System.out.println(grade);
        }
    }
    //Verilen ismin ilk harfinin buyuk harf olmamasi durumunda Exception atan method yaziniz

    public static boolean checkNameFormat(String name){
        if (name.charAt(0)>='A'&&name.charAt(0)<='Z'){
            return true;
        }else {
            throw new IllegalNameException("Isimler buyuk harfle baslamalidir");
        }
    }
}
