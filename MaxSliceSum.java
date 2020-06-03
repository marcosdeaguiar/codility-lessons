class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 1)
        {
            return A[0];
        }
        
        int max = Integer.MIN_VALUE;
        long maxSlice = 0;
        long maxEnding = 0;
        boolean foundZero = false;
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 0)
            {
                foundZero = true;
            }
            
            max = Math.max(max, A[i]);
            maxEnding = Math.max(0, maxEnding + A[i]);
            maxSlice = Math.max(maxEnding, maxSlice);
        }
        
        if (maxSlice == 0 && !foundZero)
        {
            return max;
        }
        
        return (int)maxSlice;
    }
}