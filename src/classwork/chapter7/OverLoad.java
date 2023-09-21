package classwork.chapter7;

public class OverLoad {
    public static void main(String[] args) {
        OverLoadDemo ob = new OverLoadDemo();
        int i = 88;
//        double result;


        ob.test();
        ob.test(10);
        ob.test(i);
        ob.test(10, 20);
        ob.test(123.2);
//      result = ob.test(123.25);

//        System.out.println("результат вызова ob.test(123.25) : " + result);
    }
}
