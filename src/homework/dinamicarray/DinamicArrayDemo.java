package homework.dinamicarray;

public class DinamicArrayDemo {
    public static void main(String[] args) {
        DinamicArray dArray = new DinamicArray();

        dArray.push(1);
        dArray.push(2);
        dArray.push(3);
        dArray.push(4);
        dArray.push(5);
        dArray.push(6);
        dArray.push(7);
        dArray.push(8);
        dArray.push(9);
        dArray.push(10);
        dArray.push(11);
        dArray.push(12);
        dArray.push(13);
        dArray.push(14);
        dArray.push(15);
        dArray.push(16);
        dArray.push(17);
        dArray.push(18);
        dArray.push(19);
        dArray.push(20);



        int index = dArray.getByIndex(15);
        System.out.println(index);

        System.out.println();

        dArray.deleteByIndex(10);
        System.out.println();
        dArray.add(2,7);

        dArray.set(5, 45);




        System.out.println(dArray.exists(40));

        System.out.println();
        System.out.println(dArray.getIndexByValue(20));
        dArray.add(2,40);



        dArray.print();

    }
}
