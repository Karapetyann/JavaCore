package homework.dinamicarray;

public class DinamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void push(int value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] array1 = new int[array.length + 10];
        for (int j = 0; j < size; j++) {
            array1[j] = array[j];
        }
        array = array1;
    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index > size || index < 0) {
            return -1;
        } else {
            return array[index];
        }
    }

    //տպել մասիվի ավելացված էլեմենտները
    public void print() {
        for (int j = 0; j < size; j++) {
            System.out.println(array[j]);
        }
    }


    public void deleteByIndex(int index) {
        if (index < size && index > 0) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
        } else {
            System.out.println("no such element");
        }
    }


    public void set(int index, int value) {
        if (index > size || index < 0) {
            System.out.println("no element");
        } else {
            for (int i = 0; i < size; i++) {
                array[index] = value;
            }
        }
    }


    public void add(int index, int value) {
        if (size == array.length-1) {
            extend();
        }
        if (index > size || index < 0) {
            System.out.println("no elements");
        } else {
            for (int i = size; i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = value;
            size++;
        }
    }


    public boolean exists(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    public int getIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }
}




