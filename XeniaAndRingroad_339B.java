import java.util.Scanner;

public class XeniaAndRingroad_339B {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int b=sc.nextInt();
        long[] arr= new long[b];
        long sum=0;
        for(int i=0;i<b;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            if(i==0){
                sum+=arr[i]-1;
            }
            else if(arr[i-1]<=arr[i]){
                sum+=arr[i]-arr[i-1];
            }
            else{
                sum += (a - arr[i-1]) + arr[i];
            }
        }
        System.out.println(sum);
    }
}
