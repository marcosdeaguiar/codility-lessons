import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int aliveFish = A.length;
        Stack<Integer> downStr = new Stack<Integer>();
        
        for (int i = 0; i < A.length; i++)
        {
            if (B[i] == 1)
            {
                downStr.push(A[i]);
                continue;
            }
            
            if (downStr.size() == 0)
            {
                continue;
            }
            
            while (downStr.size() > 0)
            {
                aliveFish--;
                int fish = downStr.pop();
                if (fish > A[i])
                {
                    downStr.push(fish);
                    break;
                }
            }
        }
        
        return aliveFish;
    }
}