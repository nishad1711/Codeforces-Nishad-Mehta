import java.util.*;

public class EffectiveApproach_227B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] position = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            position[x] = i;
        }

        int m = sc.nextInt();

        long vasya = 0;
        long petya = 0;

        for (int i = 0; i < m; i++) {
            int c = sc.nextInt();

            vasya += position[c];
            petya += n - position[c] + 1;
        }

        System.out.println(vasya + " " + petya);
    }
}