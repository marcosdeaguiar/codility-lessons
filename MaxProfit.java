class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0)
        {
            return 0;
        }
        
        if (A.length == 1)
        {
            if (A[0] > 0)
            {
                return A[0];
            }
            else
            {
                return 0;
            }
        }
        
        int[] gains = new int[A.length - 1];
        for (int i = 1; i < A.length; i++)
        {
            gains[i - 1] = A[i] - A[i - 1];
        }
        
        int maxEnding = 0;
        int maxSlice = 0;
        for (int i = 0; i < gains.length; i++)
        {
            maxEnding = Math.max(0, maxEnding + gains[i]);
            maxSlice = Math.max(maxSlice, maxEnding);
        }
        
        return maxSlice;
    }
}