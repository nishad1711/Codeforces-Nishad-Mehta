import java.util.Scanner;

public class PetrAndBook_139A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr= new int[7];
       
        for(int i=0;i<7;i++){
            int a=sc.nextInt();
            arr[i]=a;
        }
        int i=0;
        while(true){
            n=n-arr[i%7];
            if(n<1){
                System.out.println((i%7)+1);
                break;
            }
            i++;
        }
    }
}
