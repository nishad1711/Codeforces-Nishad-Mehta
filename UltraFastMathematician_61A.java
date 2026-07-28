import java.util.Scanner;

public class UltraFastMathematician_61A {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String a= sc.nextLine();
        String b=sc.nextLine();
        StringBuilder ans= new StringBuilder();
        int i=0;
        int j=0;
 
        while(i<a.length() || j<b.length()){
            char c1='0';
            char c2='0';
            if(i>a.length() || j>b.length()){
                if(j>b.length()){
                     c1=a.charAt(i);
                     c2='0';
                }
                else{
                    c1='0';
                    c2=b.charAt(j);
                }
                
            }
            else{
                c1=a.charAt(i);
                c2=b.charAt(j);
            }
            i++;
            j++;
 
            if(c1==c2){
                ans.append("0");
            }
            else{
                ans.append("1");
 
            }
           
        }
        System.out.println(ans);
       
        
    }
 
 
    
}
