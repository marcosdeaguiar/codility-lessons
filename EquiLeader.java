import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
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
        
        int equiCount = 0;
        int count2 = 0;
        for (int i = 0; i < N; i++)
        {
            if (A[i] == leader)
            {
                count2++;
            }
            
            int leftSize = i + 1;
            
            if (count2 > leftSize/2 && (count - count2) > (N - leftSize)/2)
            {
                equiCount++;
            }
        }
        
        return equiCount;
    }
}