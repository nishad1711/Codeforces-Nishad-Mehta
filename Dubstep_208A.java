import java.util.Scanner;

public class Dubstep_208A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String sen=sc.nextLine();
        String word="WUB";
        String ans=sen.replace(word," ");
        System.out.println(ans.strip().trim());
    }
}
