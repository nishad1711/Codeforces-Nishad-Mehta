import java.util.Scanner;

public class The_number_of_positions_124A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.max(a + 1, n - b);
        int ans = n - start + 1;

        System.out.println(ans);
    }
}
// still dout