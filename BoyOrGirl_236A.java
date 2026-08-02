import java.util.*;

public class BoyOrGirl_236A {
    public static void main(String[] args){
        HashSet<Character> cheack= new HashSet<>();
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        for(char c:a.toCharArray()){
            cheack.add(c);
        }
        if(!(cheack.size()%2==0)){
            System.out.println("IGNORE HIM!");
            return;
        }
        System.out.println("CHAT WITH HER!");

    }
}
