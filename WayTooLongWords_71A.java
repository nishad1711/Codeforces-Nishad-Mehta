import java.util.*;
public class WayTooLongWords_71A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            String a= sc.next();
            if(a.length()<=10){
                arr[i]=a;
                continue;
            }
            arr[i]=a.charAt(0)+Integer.toString(a.length()-2)+a.charAt(a.length()-1);
            
        }
        for(String a: arr){
            System.out.println(a);
        }

    }
    
}
