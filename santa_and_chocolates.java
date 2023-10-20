import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }

            boolean happy = false;
            int total = 0;
            for (int num : a) {
                total += num;
            }

            if (total >= n && k > 0) {
                happy = true;
            } else if (total >= n && k == 0) {
                if (total % n == 0) {
                    happy = true;
                }
            }

            if (happy) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
