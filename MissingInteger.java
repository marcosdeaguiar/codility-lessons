class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int max = 0;
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > max)
            {
                max = A[i];
            }
        }
        
        if (max == 0)
        {
            return 1;
        }
        
        int[] count = new int[max];
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > 0)
            {
                count[A[i] - 1] += 1;
            }
        }
        
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] == 0)
            {
                return i + 1;
            }
        }
        
        return max + 1;
    }
}