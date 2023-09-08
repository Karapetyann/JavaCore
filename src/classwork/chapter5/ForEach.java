package classwork.chapter5;

public class ForEach {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        for (int x : array) {
            System.out.print(x+" ");
        }
        System.out.println();

        int sum = 0;
        int[][] array1 = new int[3][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                array1[i][j] = (i+1)*(j+1);
            }
        }
        for (int x[]: array1) {
            for (int y:x) {
                System.out.println("значеные равно:"+ y);
                sum += y;
            }
        }
        System.out.println("сумма :"+ sum);

    }
}
