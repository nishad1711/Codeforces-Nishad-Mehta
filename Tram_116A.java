import java.util.Scanner;

public class Tram_116A {
     public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int sum=0;
        int max=Integer.MIN_VALUE;
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a= sc.nextInt();
            int b=sc.nextInt();
            
            sum=(sum-a)+b;
            if(sum>=max){
                max=sum;
            }
 
        }
        System.out.println(max);
        
    }
}
