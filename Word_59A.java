import java.util.Scanner;

public class Word_59A {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String a=sc.next();
        int countcap=0;
        int countsm=0;
        for(char c:a.toCharArray()){
            if(Character.isUpperCase(c)){
                countcap++;
            }
            else{
                countsm++;
            }
        }
        if(countcap>countsm){
            System.out.println(a.toUpperCase());
        }
        else{
            System.out.println(a.toLowerCase());
        }
       
    }
    
}
