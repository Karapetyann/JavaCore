package classwork.chapter3;

public class ArrayExample {
    public static void main(String[] args) {
        /*int[] month_days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("в апрелье " + month_days[3] + " days");
    }*/
        double nums[] = {10.1, 11.2, 12.3, 13.4, 14.5};
        double result = 0;
        int i;
        for (i = 0; i < 5; i++) {
            result = result + nums[i];
            System.out.println("среднее значение равно " + result / 5);
        }


    }
}
