import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Set<Integer> elements = new HashSet<Integer>();
        
        if (A.length == 0)
        {
            return 1;
        }
        
        for (int i = 0; i < A.length; i++)
        {
            elements.add(i + 1);
        }
        
        for (int i = 0; i < A.length; i++)
        {
            if (elements.contains(A[i]))
            {
                elements.remove(A[i]);
            }
        }
        
        if (elements.size() == 0)
        {
            return A.length + 1;
        }
        
        return (int)elements.toArray()[0];
    }
}