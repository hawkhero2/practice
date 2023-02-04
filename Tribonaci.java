import java.util.Scanner;

public class Tribonaci {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
        int n = 25;
        System.out.println(tribonacci(n));
    }

    private static int tribonacci(int n) {
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return d;

    }
}
