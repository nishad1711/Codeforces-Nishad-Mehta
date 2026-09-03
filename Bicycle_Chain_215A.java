import java.util.Scanner;

public class Bicycle_Chain_215A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int a = sc.nextInt();
        int[] arr1 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = sc.nextInt();
        }
        
        
        int b = sc.nextInt();
        int[] arr2 = new int[b];
        for (int j = 0; j < b; j++) {
            arr2[j] = sc.nextInt();
        }
        
       
        int max = Integer.MIN_VALUE;
        int count = 0;
        
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if (arr2[j] % arr1[i] == 0) {
                    int ratio = arr2[j] / arr1[i];
                    if (ratio > max) {
                        max = ratio;
                        count = 1; 
                    } else if (ratio == max) {
                        count++;
                    }
                }
            }
        }
        
        System.out.println(count);
    }
}