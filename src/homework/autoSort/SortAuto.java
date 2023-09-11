package homework.autoSort;

public class SortAuto {
    void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int a = arr[0];
                if (arr[j] >= arr[j + 1]) {
                    a = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = a;
                }
            }
        }
        for (int x :
                arr) {
            System.out.print(x + " ");
        }
    }
}
