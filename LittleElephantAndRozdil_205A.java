import java.util.Scanner;

public class LittleElephantAndRozdil_205A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int mincount=0;
        int min=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            if(k==min){
                mincount++;
            }
            else if(k<min){
                min=k;
                mincount=1;
                ans=i;
            }
            else{
                continue;
            }
        }
        if(mincount>1){
            System.out.println("Still Rozdil");
        }
        else{
            System.out.println(ans+1);
        }


    }
    
}
