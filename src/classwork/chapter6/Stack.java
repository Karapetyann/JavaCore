package classwork.chapter6;

public class Stack {
    private int[]array = new int[10];
    private int size;


    public void push(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;

    }

    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            System.arraycopy(array,0,array1,0,array.length);
        }
        array = array1;
    }


    public int pop() {
        if (size < 0) {
            return 0;
        } else
            return array[size--];
    }

    public int getSize() {
        return size;
    }
}
