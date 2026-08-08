import java.util.Scanner;

public class BitPlusPlus_282A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int x=0;
        for(int i=0;i<a;i++){
            String g= sc.next();
            if(g.equals("++X")|| g.equals(("X++"))){
                x++;
            }
            else{
                x--;
            }
        }
        System.out.println(x);
    }
    
}
