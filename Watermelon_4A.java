import java.util.Scanner;

public class Watermelon_4A {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<n;i++){
            if((n-i)%2==0 && i%2==0 ){
                System.out.println("YES");
                return;
            }

        }
        System.out.println("NO");
    }
}
