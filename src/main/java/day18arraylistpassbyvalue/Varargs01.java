package day18arraylistpassbyvalue;

public class Varargs01 {
    /*
        1) farkli sayilardaki parametreler ile calisabilen bir method
        olusturmak isterseniz varargs kullanmalisiniz
        2) varargs arka tarafta array kullanir.
        bu yuzden varargslarla calisirken array lerle calisiyor gibi davranabilirsiniz...
        3) varargs olusturmak icin "<data type>... <varargs ismi>" veya "<data type> ...<varargs ismi>"
        4) bir method da varargs in yaninda baska bir parametre kullanilabilir mi?
           "varargs" en sonda olmak sarti ile kullanilabilir...
        5) varargs en sonda olmak zorunda oldugundan, birden fazla kullanirsaniz biri en sonda olamayacak
           bu da diger maddelerle celisir...

     */
    public static void main(String[] args) {

        int r1=add(2,3);// r1==>result1 manasinda
        System.out.println(r1);

        int r2=add(2,3,4);
        System.out.println(r2);//9

        int r3=add(2,3,4,5,6,7,8,9);
        System.out.println(r2);//44


    }
//    //2 sayinin toplamini return eden method
//
//    public  static int add(int a,int b){
//
//        return a+b;
//    }
//    //3 sayi veren
//    public  static  int add(int a ,int b,int c){
//        return a+b+c;
//    }
//    //4 sayi
//    public static int add(int a,int b, int c, int d){
//        return a+b+c+d;
//    }
    // istedigimiz kadar sayiyi toplayabilecegimiz bir method

    public static  int add( int ...a){ //==>buna "varargs" denir "variable argumants". varargs in arkasinda array calisir
        int sum=0;
        for (int w: a){
            sum+=w;
        }
        return sum;
    }

}
