import java.util.Scanner;

public class Cupboards_248A {
    public static void main(String args[]) {
        int countl1 = 0;
        int countl0 = 0;
        int countr1 = 0;
        int countr0 = 0;
        int ans = 0;
 
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
 
        for (int i = 0; i < a; i++) {
 
            int l = sc.nextInt();   
            int r = sc.nextInt();   
            if (r == 1) {
                countr1++;
            } else {
                countr0++;
            }
 
            if (l == 1) {
                countl1++;
            } else {
                countl0++;
            }
        }
 
        if (countl0 < countl1) {
            ans += countl0;
        } else {
            ans += countl1;
        }
 
        if (countr0 < countr1) {
            ans += countr0;
        } else {
            ans += countr1;
        }
 
        System.out.println(ans);
    }
    
}
