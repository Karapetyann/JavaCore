package homework.util;

public class Array1 {
    void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    void array0(int[] arr) {
        System.out.println(arr[0]);
    }

    void arrayMax(int[] arr) {
        System.out.println(arr.length - 1);
    }

    void arrayLength(int[] arr){
        System.out.println(arr.length);
    }

    void arrayMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

    void arrayMiddle(int[] arr){
        if (arr.length / 2 <= 2) {
            System.out.println("can't print middle value");
        } else if (arr.length % 2 == 0) {
            System.out.println(arr[arr.length / 2 - 1] + " " + arr[arr.length / 2]);
        } else {
            System.out.println(arr[arr.length / 2]);
        }
    }

    void arrayEven(int[] arr){
        int even = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }
        System.out.println(even);
    }

    void arrayOdd(int[] arr ){
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println(odd);
    }

    int arraySum(int[] arr){
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = arr[i] + sum;
        }
        System.out.println(sum);
        return sum;
    }



}
