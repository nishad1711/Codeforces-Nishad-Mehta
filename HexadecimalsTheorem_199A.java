import java.util.HashSet;
import java.util.Scanner;

public class HexadecimalsTheorem_199A {
    public static void main(String[] args){
        HashSet<Long> hs = new HashSet<>();
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if(n == 0){
            System.out.println("0 0 0");
            return;
        }

        long a = 0;
        long b = 1;

        hs.add(a);
        hs.add(b);

        while(a + b <= n){
            long c = a + b;
            hs.add(c);

            a = b;
            b = c;
        }

        for(long x : hs){
            for(long y : hs){
                long z = n - x - y;

                if(hs.contains(z)){
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
            }
        }

        System.out.println("I'm too stupid to solve this problem");
    }
}