import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        
        Set<Integer> positions = new HashSet<Integer>();
        
        if (X > A.length)
        {
            return -1;
        }
        
        for (int i = 0; i < A.length; i++)
        {
            if (positions.contains(A[i]) || A[i] > X)
            {
                continue;
            }
            
            positions.add(A[i]);
            
            if (positions.size() == X)
            {
                return i;
            }
        }
        
        return -1;
    }
}