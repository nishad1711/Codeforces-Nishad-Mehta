import java.util.Scanner;

public class LightsOut_275A {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int[][] mat=new int[3][3];
        int[][] ans={{1,1,1},{1,1,1},{1,1,1}};
 
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int m=1;m<=mat[i][j];m++){
                    if(ans[i][j]==0){
                        ans[i][j]=1;
                    }
                    else{
                        ans[i][j]=0;
                    }
                    if(i<2){
                        if(ans[i+1][j]==0){
                            ans[i+1][j]=1;
                        }
                        else{
                            ans[i+1][j]=0;
                        }
 
                    }
                    
                    if(j<2){
                        if(ans[i][j+1]==0){
                            ans[i][j+1]=1;
                        }
                        else{
                            ans[i][j+1]=0;
                        }
                        
                    }
                    if(i>0){
                        if(ans[i-1][j]==0){
                            ans[i-1][j]=1;
                        }
                        else{
                            ans[i-1][j]=0;
                        }
                    }
                    if(j>0){
                        if(ans[i][j-1]==0){
                            ans[i][j-1]=1;
                        }
                        else{
                            ans[i][j-1]=0;
                        }
                    }
                    
                }
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
       
 
 
 
    }
    
}
