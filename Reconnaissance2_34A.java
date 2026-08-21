import java.util.Scanner;

public class Reconnaissance2_34A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int ans1 = 0;
        int ans2 = 0;

        for (int i = 0; i < n - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i + 1]);

            if (diff < min) {
                min = diff;
                ans1 = i + 1;   
                ans2 = i + 2;   
            }
        }

        int diff = Math.abs(arr[n - 1] - arr[0]);

        if (diff < min) {
            ans1 = n;
            ans2 = 1;
        }

        System.out.println(ans1 + " " + ans2);
    }
}