// Remember max sum greater than int limit!!
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        if (A.length < 3)
        {
            return 0;
        }
        
        Arrays.sort(A);
        
        for (int i = 0; i < A.length - 2; i++)
        {
            long n1 = A[i];
            long n2 = A[i + 1];
            long n3 = A[i + 2];
            
            if (n1 + n2 > n3 &&
                n2 + n3 > n1 &&
                n1 + n3 > n2)
            {
                return 1;
            }
        }
        
        return 0;
    }
}