import java.util.Scanner;

public class Drinks_200B {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<a;i++){
            sum+=(double)((arr[i])/100.0);
        }
        sum=sum/a;
        sum=sum*100;
        System.out.println(sum);
        
       
    }
}
