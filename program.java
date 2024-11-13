import java.util.Scanner;
import java.util.HashSet;

public class ElevateBoxUnique {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
      
        int N = sc.nextInt();
        
     
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        
        
        HashSet<Integer> seen = new HashSet<>();
        
        
        StringBuilder result = new StringBuilder();
        
       
        for (int i = 0; i < N; i++) {
            if (!seen.contains(A[i])) {
                result.append(A[i]).append(" ");
                seen.add(A[i]);
            }
        }
        
        
        System.out.println(result.toString().trim());
    }
}
