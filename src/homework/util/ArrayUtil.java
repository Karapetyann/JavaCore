package homework.util;

import homework.util.Array1;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


        System.out.println("Task 1");

        Array1 arr = new Array1();
        arr.array(numbers);


        System.out.println();
        System.out.println("Task 2");
        System.out.println();

        arr.array0(numbers);

        System.out.println();
        System.out.println("Task 3");
        System.out.println();


        arr.arrayMax(numbers);


        System.out.println();
        System.out.println("Task 4");
        System.out.println();


        arr.arrayLength(numbers);


        System.out.println();
        System.out.println("Task 5");
        System.out.println();


        arr.arrayMin(numbers);


        System.out.println();
        System.out.println("Task 6");
        System.out.println();


       arr.arrayMiddle(numbers);


        System.out.println();
        System.out.println("Task 7");
        System.out.println();


       arr.arrayEven(numbers);


        System.out.println();
        System.out.println("Task 8");
        System.out.println();


        arr.arrayOdd(numbers);


        System.out.println();
        System.out.println("Task 9");
        System.out.println();


        int sum =arr.arraySum(numbers);



        System.out.println();
        System.out.println("Task 10");
        System.out.println();


        System.out.println(sum/2);

    }
}

