import java.util.Arrays;
import java.util.Scanner;

public class Sale_34B{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            sum-=arr[i];
            if(sum>maxsum){
                maxsum=sum;
            }
        }
        if(maxsum<0){
            System.out.println(0);
        }
        else{
            System.out.println(maxsum);
        }
       
    }
}