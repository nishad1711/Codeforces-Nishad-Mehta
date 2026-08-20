import java.util.*;
public class Parallelepiped_224A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        int a3=sc.nextInt();
        double l=0;
        double w=0;
        double h=0;
        l=Math.sqrt((a1*a2)/a3);
        w=Math.sqrt((a2*a3)/a1);
        h=Math.sqrt((a3*a1)/a2);
        int ans=(int)(4*(l+w+h));
        System.out.println((ans));


    }
    
}
