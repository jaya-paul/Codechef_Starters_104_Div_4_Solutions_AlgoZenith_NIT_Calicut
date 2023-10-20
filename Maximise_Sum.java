import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            
            int[] l = new int[n];
            int[] r = new int[n];
            l[0] = arr[0];
            r[n - 1] = arr[n - 1];
            for (int j = 1; j < n; j++) {
                l[j] = Math.max(l[j - 1], arr[j]);
                r[n - j - 1] = Math.max(r[n - j - 1], arr[n - j - 1]);
            }
            
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += Math.min(l[j], r[j]);
            }
            System.out.println(sum);
        }
    }
}
