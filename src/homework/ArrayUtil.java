package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};


        System.out.println("Task 1");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();
        System.out.println("Task 2");
        System.out.println();


        System.out.println(numbers[0]);


        System.out.println();
        System.out.println("Task 3");
        System.out.println();


        System.out.println(numbers.length-1);


        System.out.println();
        System.out.println("Task 4");
        System.out.println();


        System.out.println(numbers.length);


        System.out.println();
        System.out.println("Task 5");
        System.out.println();


        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);


        System.out.println();
        System.out.println("Task 6");
        System.out.println();


        if (numbers.length / 2 <= 2) {
            System.out.println("can't print middle value");
        } else if (numbers.length % 2 == 0) {
            System.out.println(numbers[numbers.length / 2 - 1] + " " + numbers[numbers.length / 2]);
        } else {
            System.out.println(numbers[numbers.length / 2]);
        }

        System.out.println();
        System.out.println("Task 7");
        System.out.println();


        int even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);


        System.out.println();
        System.out.println("Task 8");
        System.out.println();


        int odd = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd);


        System.out.println();
        System.out.println("Task 9");
        System.out.println();


        int sum = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            sum = numbers[i] + sum;
        }
        System.out.println(sum);


        System.out.println();
        System.out.println("Task 10");
        System.out.println();

        System.out.println(sum / 2);


    }
}

