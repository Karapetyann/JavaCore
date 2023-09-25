package classwork.chapter7;

public class Test {
    int a;

    public int b;
    private int c;
    void sets(int i){
        c = i;
    }
    int getC(){
        return c;
    }

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }


//    int a, b;
//
//    Test(int i, int j) {
//        a = i;
//        b = j;
//    }
//
//    void meth(Test o) {
//        o.a *= 2;
//        o.b /= 2;
//    }

//    void meth(int i, int j){
//        i *= 2;
//        j /= 2;
//    }

//    int a, b;
//
//    Test(int i, int j) {
//        a = i;
//        b = j;
//    }
//
//    boolean equalTo(Test o) {
//        if (o.a == a && o.b == b) {
//            return true;
//        } else {
//            return false;
//        }
//    }


}
