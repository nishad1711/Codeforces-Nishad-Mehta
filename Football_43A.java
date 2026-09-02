import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Football_43A{
    public static void main(String[] args){
        HashMap<String,Integer> hm=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String a=sc.next();
            if(hm.containsKey(a)){
                hm.put(a, hm.get(a)+1);
            }
            else{
                hm.put(a, 1);
            }
        }
        String ans=new String();
        int max=Integer.MIN_VALUE;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if(entry.getValue()>max){
                max=entry.getValue();
                ans=entry.getKey();
            }
        }
        System.out.println(ans);

    }
}