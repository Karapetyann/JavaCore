package classwork.chapter8;

public class Simpleinheritance {
    public static void main(String[] args) {

        A superOb = new A();
        B subOb = new B();

        superOb.i = 10;
        superOb.j = 20;

        superOb.showij();

        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("содержимое обекта subOb:");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("сумма обекта subOb:");
        subOb.sum();
    }
}
