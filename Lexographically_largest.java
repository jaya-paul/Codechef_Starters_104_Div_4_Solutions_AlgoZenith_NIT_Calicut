import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            int[] ans = new int[n];
            ans[0] = arr[0];
            for (int j = 1; j < n; j++) {
                int a = m / arr[j];
                int b = a * arr[j];
                while (gcd(b, arr[j - 1]) != arr[j]) {
                    b -= arr[j];
                }
                ans[j] = b;
            }
            for (int j = 0; j < n; j++) {
                System.out.print(ans[j] + " ");
            }
            System.out.println();
        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
