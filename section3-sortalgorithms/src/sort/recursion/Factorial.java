package sort.recursion;

public class Factorial {

    public static void main(String[] args) {

    }

    public static int factorial(int num) {
        if (num == 0) return 1;

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *=i;
        }
        return factorial;
    }

    public static int factorialRecur(int num) {
        if (num == 0 ) return 1;

        return num * factorialRecur(num -1);
    }
}
