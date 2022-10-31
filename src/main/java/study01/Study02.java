package study01;

public class Study02 {

    int a=2;
    static int b=2;

    public static void main(String[] args) {
        System.out.println(b);
        Study02 obj1=new Study02();

        obj1.a++;
    }
    static {
        b=3;
    }
}
