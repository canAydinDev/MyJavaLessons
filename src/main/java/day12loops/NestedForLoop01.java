package day12loops;

import java.util.Scanner;

public class NestedForLoop01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int row = 4;

        for (int i = 1; i <= row; i++) {

            for (int k = row; k >= i; k--) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
