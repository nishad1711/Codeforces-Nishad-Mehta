import java.util.HashSet;
import java.util.Scanner;

public class IsYourHorseshoeOnTheOtherHoof_228A {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        HashSet<Integer> hs= new HashSet<>();
        int a=0;
        for(int i=0 ;i<4;i++){
            a=sc.nextInt();
            hs.add(a);
            
        }
        sc.close();
        System.out.println(4-hs.size());
 
    }   
}
