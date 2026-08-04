import java.util.Scanner;

public class SoftDrinking_151A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int lit=(k*l)/nl;
        int sal=p/np;
        int slice=c*d;
        int min=Math.min(Math.min(sal, slice),lit);
        int ans=min/n;
        System.out.println(ans);


    }
}
