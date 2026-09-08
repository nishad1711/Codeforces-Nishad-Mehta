import java.util.Scanner;

public class K_String_219A {
    public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.next();

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (count[i] % k != 0) {
                System.out.println("-1");
                return;
            }
        }

        String part = "";

        for (int i = 0; i < 26; i++) {
            int times = count[i] / k;

            while (times > 0) {
                part += (char)('a' + i);
                times--;
            }
        }

        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += part;
        }

        System.out.println(answer);
    }
}
