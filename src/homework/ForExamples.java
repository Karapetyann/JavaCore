package homework;

import java.sql.SQLOutput;

public class ForExamples {
    public static void main(String[] args) {
        for (int i = 1; i > 0 && i <= 1000; i++) {
            System.out.print(i);
            if (i < 1000) {
                System.out.print(" - ");

            }

        }

        System.out.println();
        System.out.println();
        System.out.println();





        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }

        }

        System.out.println();
        System.out.println();
        System.out.println();




        int a = 0;

        int[] array = {2,5,8,4,9,3,7};
        for (int i = 0; i < array.length-1; i++) {
            if (array[a]<array[i+1]){
                array[a]=array[i+1];
            }

        }
        System.out.println(array[a]);


        System.out.println();
        System.out.println("FINISHED");


    }
}
