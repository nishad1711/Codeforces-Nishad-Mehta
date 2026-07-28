import java.util.Scanner;

public class ArrivalOfTheGeneral_144A {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
       int maxi=0;
       int mini=0;
       for(int i=1;i<arr.length;i++){
           if(arr[i]>arr[maxi]){
               maxi=i;
           }
           if(arr[i]<=arr[mini]){
               mini=i;
           }
       }
       if(mini<maxi){
        System.out.println(((maxi)+((arr.length-1)-mini))-1);
        return;
       }
 
       System.out.println((maxi)+((arr.length-1)-mini));
 
        
 
    }
    
}
