package homework;

import java.sql.SQLOutput;

public class FigurePainter {
    public static void main(String[] args) {
        for (int i = 6; i > 0; i--) {
            for (int j = i; j <= 6; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();


        int a = 6;
        for (int i = 0; i < 6; i++) {
            for (int j = i; j < 6; j++) {
                System.out.print("  ");

            }
            a--;
            for (int k = a; k < 6; k++) {
                System.out.print("* ");

            }


            System.out.println();
        }
        System.out.println();
        System.out.println();


        int b = 0;
        int c = 5;
        for (int i = 6; i > 0; i--) {
            for (int j = c; j < 6; j++) {
                System.out.print("  ");

            }

            c--;
            for (int k = b; k < 6; k++) {
                System.out.print("* ");

            }
            b++;


            System.out.println();
        }
        System.out.println();
        System.out.println("FINISHED");
    }
}
