import java.util.Scanner;

public class InsomniaCure_148A {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
 
        int k=sc.nextInt();
        int l=sc.nextInt();
        int m=sc.nextInt();
        int n=sc.nextInt();
        int d=sc.nextInt();
        boolean[] arr= new boolean[d+1];
 
        arr[0]=false;
        for(int i=k;i<=d;i+=k){
            arr[i]=true;
        }
        for(int i=l;i<=d;i+=l){
            arr[i]=true;
        }
        for(int i=m;i<=d;i+=m){
            arr[i]=true;
        }
        for(int i=n;i<=d;i+=n){
            arr[i]=true;
        }
        int count=0;
        for(int i=1;i<=d;i++){
            if(arr[i]){
                count++;
            }
        }
        System.out.println(count);
 
 
    }
}
