package homework.figurePainter;

import java.io.FileOutputStream;
import java.sql.SQLOutput;

public class FigurePainter {
    public static void main(String[] args) {
        System.out.println("FIGUR 1");
        System.out.println();


        FigurePainter1 figure1 = new FigurePainter1();
        figure1.paint1(6);

        System.out.println();
        System.out.println("FIGUR 2");
        System.out.println();

        FigurePainter1 figure2 = new FigurePainter1();
        figure2.paint2(6);


        System.out.println();
        System.out.println("FIGUR 3");
        System.out.println();


        FigurePainter1 figure3 = new FigurePainter1();
        figure3.paint3(6);

        System.out.println();
        System.out.println("FIGUR 4");
        System.out.println();

        FigurePainter1 figure4 = new FigurePainter1();
        figure4.paint4(6);

        System.out.println();
        System.out.println("FIGUR 5");
        System.out.println();


        FigurePainter1 figure5 = new FigurePainter1();
        figure5.paint5(10);


        System.out.println();
        System.out.println("FINISHED");
    }
}
