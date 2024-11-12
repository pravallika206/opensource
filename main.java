import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
       
        int X = sc.nextInt();
        int N = sc.nextInt();  
        
       
        int requiredPlanes = (N + 99) / 100;         
        
        int planesToBuy = Math.max(0, requiredPlanes - X);
        
       
        System.out.println(planesToBuy);
        
        sc.close();
    }
}
