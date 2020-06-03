// Carefull for N/2 check.
import java.util.*;
class Solution {
    public int solution(int[] A) {
        
        int N = A.length;
        if (N == 0)
        {
            return -1;
        }
        if (N == 1)
        {
            return 0;
        }
        
        // Find leader.
        int value = 0;
        Stack<Integer> stack = new Stack<Integer>();
        
        for (int i = 0; i < N; i++)
        {
            if (stack.size() == 0)
            {
                value = A[i];
                stack.push(value);
            }
            else
            {
                if (A[i] == stack.peek())
                {
                    stack.push(A[i]);
                }
                else
                {
                    stack.pop();
                }
            }
        }
        
        int leader = value;
        int count = 0;
        for (int i = 0; i < N; i++)
        {
            if (A[i] == leader)
            {
                count++;
            }
        }
        
        if (count <= N/2)
        {
            return -1;
        }
        
        for (int i = 0; i < N; i++)
        {
            if (A[i] == leader)
            {
                return i;
            }
        }
        
        return -1;
    }
}