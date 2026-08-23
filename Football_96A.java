import java.util.Scanner;

public class Football_96A{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        int maxconse0=0;
        int maxconse1=0;
        int count1=0;
        int count0=0;
        for(char a:str.toCharArray()){
            if(a=='0'){
                count0++;
                count1=0;
                
            }
            else{
                count1++;
                count0=0;
            }
            if(count0>=7 ||count1>=7){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
    }
}