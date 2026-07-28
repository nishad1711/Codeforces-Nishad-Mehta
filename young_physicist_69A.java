import java.util.*;
public class young_physicist_69A {
    public static void main(String[] args){
        boolean ans= true;
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j][i];
                
            }
            if(sum!=0){
                ans=false;
                break;
            }
        }
        if(ans){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
    
}