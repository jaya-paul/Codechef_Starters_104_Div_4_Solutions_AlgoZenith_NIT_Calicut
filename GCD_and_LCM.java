import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int k = scanner.nextInt();
            int g = 0;
            for (int j = 0; j < k; j++) {
                g = gcd(x, y);
                if (x <= y ? x == g : x == y) {
                    break;
                }
                x = x <= y ? x : y;
                y = g;
            }
            System.out.println(x + y);
        }
    }

    public static int gcd(int a, int b) {
        while (a % b != 0) {
            a %= b;
            int temp = b;
            b = a;
            a = temp;
        }
        return b;
    }
}
