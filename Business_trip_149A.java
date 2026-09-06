import java.util.Arrays;
import java.util.Scanner;

public class Business_trip_149A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();

        if (k == 0) {
            System.out.println(0);
            return;
        }
        int[] arr = new int[12];

        for (int i = 0; i < 12; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum = 0;
        int count = 0;
        for (int i = 11; i >= 0; i--) {

            sum += arr[i];
            count++;

            if (sum >= k) {
                System.out.println(count);
                return;
            }
        }
        System.out.println(-1);
    }
}
