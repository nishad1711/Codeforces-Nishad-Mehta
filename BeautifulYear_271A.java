import java.util.Scanner;

public class BeautifulYear_271A {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        boolean[] arr= new boolean[10];
        while(true){
            a++;
            String s= String.valueOf(a);
            int i=0;
            while(i<s.length()){
                if(arr[s.charAt(i)-'0']==true){
                    break;
                }
                
                arr[s.charAt(i)-'0']=true;
                i++;
 
            }
            if(i==s.length()){
                System.out.println(a);
                break;
            }
            for(int j=0;j<10;j++){
                arr[j]=false;
            }
 
        }
    }
}
