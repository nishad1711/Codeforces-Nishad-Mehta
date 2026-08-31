import java.util.Scanner;

public class MagicNumbers_320A{
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        int i=0;
        while(i<a.length()){
            if(a.startsWith("144",i)){
                i+=3;
            }
            else if(a.startsWith("14",i)){
                i+=2;
            }
            else if(a.startsWith("1",i)){
                i+=1;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}