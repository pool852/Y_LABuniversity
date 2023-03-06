import java.util.Scanner;

public class Pell {
    public static void main(String[] args) throws Exception {
        try (Scanner sacnner = new Scanner(System.in)) {
            int n = sacnner.nextInt();
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; ++i) {
                int next = 2 * b + a;
                a = b;
                b = next;
            }
            System.out.println(b);
        }
    }
}