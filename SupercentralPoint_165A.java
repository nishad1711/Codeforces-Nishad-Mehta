
import java.util.Scanner;

public class SupercentralPoint_165A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean right = false;
            boolean left = false;
            boolean upper = false;
            boolean lower = false;

            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] == y[i]) right = true;
                if (x[j] < x[i] && y[j] == y[i]) left = true;
                if (x[j] == x[i] && y[j] > y[i]) upper = true;
                if (x[j] == x[i] && y[j] < y[i]) lower = true;
            }

            if (right && left && upper && lower) {
                count++;
            }
        }

        System.out.println(count);
        sc.close();
    }
}
