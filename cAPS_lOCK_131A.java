import java.util.Scanner;

public class cAPS_lOCK_131A{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        StringBuilder ans=new StringBuilder();
        String s=sc.next();
        boolean change=true;
        boolean firstcap=true;
        for(int i=0;i<s.length();i++){
            if(i!=0&&!Character.isUpperCase(s.charAt(i))){
                change=false;
            }
        }
        if(change){
            for(char b:s.toCharArray()){
                if(Character.isUpperCase(b)){
                    ans.append(Character.toLowerCase(b));
                }
                else{
                    ans.append(Character.toUpperCase(b));
                }
            }
            System.out.println(ans);
        }
            
        else{
            System.out.println(s);
        }
       
    }
}