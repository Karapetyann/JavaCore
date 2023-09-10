package homework.figurePainter;

public class FigurePainter1 {
    void paint1(int d) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }

    void paint2(int d) {
        for (int i = 0; i < d; i++) {
            for (int j = i; j < d; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void paint3(int d) {
        for (int i = 0; i < d; i++) {
            for (int j = i; j < d; j++) {
                System.out.print("  ");

            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");

            }


            System.out.println();
        }
    }

    void paint4(int d) {
        for (int i = 0; i < d; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("  ");

            }
            for (int k = i; k < d; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    void paint5(int d){
        for (int i = 0; i < d; i++) {
            for (int j = i; j < d; j++) {
                System.out.print(" ");

            }

            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < d; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < d; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

