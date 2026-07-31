import java.util.ArrayList;
import java.util.Scanner;

public class HelpfulMaths_339A {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String a= sc.next();
        StringBuilder ans= new StringBuilder();
        ArrayList<Integer> ar=new ArrayList<>(); 
        for(char b : a.toCharArray()){
            if(Character.isDigit(b)){
                ar.add(Character.getNumericValue(b));
            }
        }
        ar.sort(null);
        for(int i=0;i<ar.size();i++){
            ans.append(ar.get(i));
            if(i==ar.size()-1){
                break;
            }
            ans.append("+");
 
        }
        System.out.println(ans);
 
        
        
    }
}
