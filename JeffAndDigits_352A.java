import java.util.Scanner;

public class JeffAndDigits_352A {
    public static void main(String[] args){
         Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int five = 0;
        int zero = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x == 5) {
                five++;
            } else {
                zero++;
            }
        }

        if (zero == 0) {
            System.out.println(-1);
            return;
        }

        if (five < 9) {
            System.out.println(0);
            return;
        }
        
        int usableFive = (five / 9) * 9;

        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < usableFive; i++) {
            ans.append('5');
        }

        for (int i = 0; i < zero; i++) {
            ans.append('0');
        }

        System.out.println(ans);
    }
}
