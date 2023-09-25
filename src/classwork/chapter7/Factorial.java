package classwork.chapter7;

public class Factorial {
    int fact(int n) {
        int reuslt;

        if (n == 1) {
            return 1;
        }
        reuslt = fact(n - 1) * n;
        return reuslt;
    }
}
