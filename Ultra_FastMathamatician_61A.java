import java.util.*;
public class Ultra_FastMathamatician_61A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        if(a.length() !=b.length()){
            return ;
        }
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)==b.charAt(i)){
                sb.append(0);
            }
            else{
                sb.append(1);
            }
        }
        System.out.println(sb.toString());
    }
   

}