package homework.braceChecker;

public class Stack {
    char array[] = new char[10];
    private int size;

    public Stack() {
        size = -1;
    }

    public  void push(char value) {
        if (size == array.length-1) {
            extend();
        } else {
            array[++size] = value;
        }
    }
    private void extend() {
        char[] array1 = new char[array.length + 10];
        for (int i = 0; i < size; i++) {
            array1[i] = array[i];
        }
        array = array1;
    }


    public char pop() {
        if (size < 0) {
            return 0;
        } else
            return array[size--];
    }
}
