import java.util.Scanner;

public class Borze_32B {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String val= sc.nextLine();
        StringBuilder ans= new StringBuilder();
        int i=0;
        while(i<val.length()){
            if(i<val.length()-1 && (""+val.charAt(i)+val.charAt(i+1)).equals("-.")){
                i+=2;
                ans.append("1");
            }
            else if(i<val.length()-1 && (""+val.charAt(i)+val.charAt(i+1)).equals("--")){
                i+=2;
                ans.append("2");
            }
            else if(val.charAt(i)=='.'){
                i++;
                ans.append("0");
 
            }
            else{
                continue;
            }
            
        }
        System.out.println(ans);
    }
}
