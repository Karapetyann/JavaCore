package homework.autoSort;

public class SortAuto {
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                int a;
                if (arr[j] < arr[j - 1]) {
                    a = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = a;
                }
            }
        }
        for (int x :
                arr) {
            System.out.print(x + " ");
        }
    }
}
