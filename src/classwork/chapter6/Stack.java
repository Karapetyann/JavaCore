package classwork.chapter6;

public class Stack {
    int array[] = new int[10];
    int index;

    Stack() {
        index = -1;
    }

    void pash(int item) {
        if (index == 9) {
            System.out.println("стек заполнен");
        } else {
            array[++index] = item;
        }
    }


    int pop() {
        if (index < 0) {
            System.out.println("стек не заполнен");
            return 0;
        } else
            return array[index--];
    }

}
