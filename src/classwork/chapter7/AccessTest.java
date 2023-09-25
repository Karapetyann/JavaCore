package classwork.chapter7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test(10);
        ob.b = 20;
        ob.sets(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b+ " "+ob.getC());
    }
}
