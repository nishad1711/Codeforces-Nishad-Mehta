import java.util.Scanner;
public class Petya_and_Countryside_66B {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int maxcount=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int left=i;
            int right=i;
            while(left!=0 &&arr[left-1]<=arr[left]){
                left--;
            }
            while(right<arr.length-1 &&arr[right+1]<=arr[right]){
                right++;
            }
            int d=(((i-left)+1)+(right-i));
            maxcount=Math.max(maxcount, d);

        }
        System.out.println(maxcount);
    }
    
}
