import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner SC = new Scanner(System.in);
        int T = SC.nextInt();
        for (int t = 0; t < T; t++) {
            int N = SC.nextInt();
            int[] A = new int[N];
            for(int i = 0; i < N; i++) { 
                A[i] = SC.nextInt();
            }
            int[] B = new int[N];
            for (int i = 0; i < N; i++) {
                B[i] = SC.nextInt();
            }
            int happyDaysCount = 0;
            for (int i = 0; i < N; i++) {
                boolean ashokHappy = (B[i] <= 2 * A[i]);
                boolean KumarHappy = (A[i] <= 2 * B[i]);
                if (ashokHappy && KumarHappy) {
                    happyDaysCount++;
                }
            }
            System.out.println(happyDaysCount);
        }
    }
}
