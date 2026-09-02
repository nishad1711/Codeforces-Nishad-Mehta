import java.util.Scanner;

public class Lucky_Division_122A {
    public static boolean cheack(int n, int num  ){
        if(num>n){
            return false;
        }
        if(n%num==0){
            return true;
        }
        return cheack(n,num*10+4) || cheack(n,num*10+7);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        if(a%4==0){
            System.out.println("YES");
            return;
        }
        if(a%7==0){
            System.out.println("YES");
            return;
        }
        if(cheack(a,4) || cheack(a,7)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
