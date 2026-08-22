import java.util.*;
public class EvenOdds_318A {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long g=Math.ceilDiv(n, 2);
        if(k>g){
           long b= k-g;
           System.out.println(b*2);
        }
        else{
            long b=((k*2)-1);
            System.out.println(b);
        }

    }
}
