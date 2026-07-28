import java.util.Scanner;

public class QueueAtTheSchool_266B {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       int size= sc.nextInt();
       int time= sc.nextInt();
       String s = sc.next();
       StringBuilder ans= new StringBuilder(s);
       for(int i=0;i<time;i++){
           for(int j=0;j<size-1;j++){
            if(s.charAt(j)=='B' && s.charAt(j+1)=='G'){
                ans.setCharAt(j,'G');
                ans.setCharAt(j+1,'B');
            }
               
           }
           s=ans.toString();
       }
 
       System.out.println(ans);
        
    }
    
}
