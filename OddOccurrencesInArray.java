import java.util.Set;
import java.util.HashSet;

class Solution {
    public int solution(int[] A) {
        Set<Integer> foundSet = new HashSet<Integer>();
        
        // If value doesn't exist in the set, add it
        // If it does, remove it.
        // Whatever is left is the unpaired element.
        for(int i = 0; i < A.length; i++)
        {
            int num = A[i];
            if (foundSet.contains(num))
            {
                foundSet.remove(num);
            }
            else
            {
                foundSet.add(num);
            }
        }
        
        // Should neve occur if the input always follows the condition.
        if (foundSet.size() == 0)
        {
            return 0;
        }
        
        return (int)foundSet.toArray()[0];
    }
}