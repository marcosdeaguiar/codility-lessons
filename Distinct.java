import java.util.Set;
import java.util.HashSet;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> hashCount = new HashSet<Integer>();
        for (int i = 0; i < A.length; i++)
        {
            hashCount.add(A[i]);
        }
        
        return hashCount.size();
    }
}