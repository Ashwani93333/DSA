package pattern;

import java.util.Scanner;

public class SolidBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row number : ");
        int row = sc.nextInt();
        System.out.println("Enter column number : ");
        int column = sc.nextInt();

        //pattern
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
