package day28abstraction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
    /*
      "throw" ile "throws" arasindaki farklar nelerdir?
      1)"throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir.
      2)"throw"dan sonra obje olusturulur."throws"dan sonra ise sadece exception class'in ismi yazilir.
      3)"throw" method'un icinde istedigimiz yerde exception uretmek icin kullanilir. "throws" ise var olan
      checked(compile time) exception'i atmak icin kullanilir.==> runtime exception'da throw kullanirken throws gerekmiyor
      4)"throw" dan sonra sadece 1 tane exception atabilir.
        "throws"dan sonra birden fazla exception olabilir.
    */

public class ReadFileLineByLine {

    public static void main(String[] args) {

        readFileLineByLine();
    }
    public static void readFileLineByLine(){
        try {
            BufferedReader br=new BufferedReader(new FileReader("src/main/java/day27exceptions/File1.txt"));
            String line=br.readLine();
            while (line!=null){
                System.out.println(line);
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("ya path yanlis ya da dosya silinmis-"+ e.getMessage());
        } catch (IOException e) {
            System.out.println("okunamayacak character veya characterler var-"+e.getMessage());
        }
    }
}
