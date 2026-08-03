import java.util.*;
public class AmusingJoke_141A {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String guest=sc.next();
        String host=sc.next();
        String pile=sc.next();
        HashMap<Character,Integer> hm=new HashMap<>();
        if(pile.length()!=host.length()+guest.length()){
            System.out.println("NO");
            return;
        }
        for(char a:guest.toCharArray()){
            if(hm.containsKey(a)){
                hm.put(a,hm.get(a)+1);
            }
            else{
                hm.put(a,1);
            }
        } 
        for(char b:host.toCharArray()){
            if(hm.containsKey(b)){
                hm.put(b,hm.get(b)+1);
            }
            else{
                hm.put(b,1);
            }
        } 
        for(int i=0;i<pile.length();i++){
            if(!hm.containsKey(pile.charAt(i))){
                System.out.println("NO");
                return;
            }
            else{
                if(hm.get(pile.charAt(i))<=0){
                    System.out.println("NO");
                    return;
                }
                else{
                    hm.put(pile.charAt(i), hm.get(pile.charAt(i))-1);
                }
            }
        }
        System.out.println("YES");



    }
}
