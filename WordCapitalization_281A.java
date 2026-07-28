import java.util.Scanner;

public class WordCapitalization_281A {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        String ans=a;
        if(Character.isLowerCase(a.charAt(0))){
            ans=Character.toUpperCase(a.charAt(0))+a.substring(1,a.length());
        }
        System.out.println(ans);
 
       
    }
    
}
