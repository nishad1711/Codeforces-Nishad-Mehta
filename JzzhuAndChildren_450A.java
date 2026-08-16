import java.util.*;

public class JzzhuAndChildren_450A {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int ans = 0;
        int max = 0;

        for (int i = 1; i <= n; i++) {

            int c = sc.nextInt();

            int t = (c + m - 1) / m;

            if (t >= max) {
                max = t;
                ans = i;
            }
        }

        System.out.println(ans);
    }
}