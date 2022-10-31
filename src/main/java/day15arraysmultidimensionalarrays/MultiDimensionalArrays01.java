package day15arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays01 {
    public static void main(String[] args) {

        // bir array in elemanlari array ise bu arrayler multidimensional array dir...
        //multidimensional array nasil olusturulur

        int arr[] []=new int[3][2];
        //multidimentional array e eleman ekleme


        arr [0][0]=3;
        arr [0][1]=-4;
        arr [1][0]=6;
        arr [1][1]=18;
        arr [2][0]=-7;
        arr [2][1]=0;

        //multidimensional array consola nasil yazdirilir

        System.out.println(Arrays.deepToString(arr));

        //multidimensional array larde array elemanlarindan biri nasil yazdirilir...
        //m,ultidimensional array larde ic array daeki elemanlar nasil yazdirilir
        System.out.println(arr[1][0]);

        System.out.println(Arrays.toString(arr[1]));
        System.out.println("\t");

        //string bir multidimensional array olusturup eleman ekleyiniz sonra da toplam eleman sayisini ekrana yazxdirasn kodu yaziniz

        String brr[][]=new String[4][3];
        brr[0][0]="A";
        brr[0][1]="B";
        brr[0][2]="C";

        brr[1][0]="D";
        brr[1][1]="E";
        brr[1][2]="F";

        brr[2][0]="G";
        brr[2][1]="H";
        brr[2][2]="I";

        brr[3][0]="J";
        brr[3][1]="K";
        brr[3][2]="L";

        System.out.println(Arrays.deepToString(brr));
        System.out.println("\t");
        int sum=0;

        for (String[] w : brr){
            sum=sum+w.length;

        }
        System.out.println(sum);
    }
}
