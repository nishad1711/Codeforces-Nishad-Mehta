import java.util.*;
public class Soldier_and_Bananas{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int val1=k*((w*(w+1))/2);
        if(val1-n<=0){
            System.out.println(0);
            return;
        }
        System.out.println(val1-n);

        
    }
    

}