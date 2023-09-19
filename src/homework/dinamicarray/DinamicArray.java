package homework.dinamicarray;

public class DinamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    int i = 10;
    private int[] array = new int[i];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void push(int value) {
        if (size == i) {
            extend(value);
        }
        array[size++] = value;
    }

    //1․ ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․ քցել հին մասիվի էլեմենտները նորի մեջ
    //3․ հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend(int volue) {
        int[] array1 = new int[i += 10];
        for (int j = 0; j < size; j++) {
            array1[j] = array[j];
        }
        array = array1;
    }


    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    // մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index > i || index < 0) {
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
}
