// Remember the negatives!!!!
import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        
        Arrays.sort(A);
        int N = A.length;

        int prod1 = A[0] * A[1] * A[N - 1];
        int prod2 = A[N - 1] * A[N - 2] * A[N - 3];

        if (prod1 > prod2)
        {
            return prod1;
        }

        return prod2;
    }
}