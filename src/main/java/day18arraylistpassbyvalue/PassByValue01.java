package day18arraylistpassbyvalue;

public class PassByValue01 {
    // java variable larin orjinal degerlerini korumak ister.
    // variable method lar icinde kullanildiginda java method un icine orjinal degeri kooymaz
    // o degerin kopyasini uretir ve method a o kopyayi yollar
    // method kopya uzerinde degisiklik yapar dolayisi ile variable nin orjinal degeri korunmus olur
    // bu sisteme "pass by value" denir

    /*
     * java pass by value kullanir.
     * bazi programlama dilleri orjinal degeri koruma altina almamistir.
     * bunlara "pass by reference "denir
     * onlar reference i kopyalar ve bu reference ile orjinal degeri degistirir
     * ama java degerin kopyasini alip degistiriyor
     */



    public static void main(String[] args) {
        int x=5;
        System.out.println(x);//5 yazar
        //static method olan main method un icindeki hersey static olmalidir.
        change(x);
        System.out.println(x);// 5 yazar


        int ucret=100;
        ucret=indirim(ucret);
        System.out.println(ucret);


    }

    public static void change(int a){
        System.out.println(a*3);
    }
    // void disindaki return type larda method body si icinde
    // "return" keyword kullanilmalidir.
    public static  int indirim(int gomlekUcreti){
        return gomlekUcreti-10;
    }
}
