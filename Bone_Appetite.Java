import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n, m;
        n = scanner.nextInt();
        m = scanner.nextInt();
        
        int x, y;
        x = scanner.nextInt();
        y = scanner.nextInt();
        
        System.out.println(n * x + m * y);
        
        scanner.close();
    }
}
