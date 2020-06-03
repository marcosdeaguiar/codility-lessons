class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int[] count = new int[N];
        int maxCounter = 0;
        int currentMaxCounterToApply = 0;
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] > N)
            {
                currentMaxCounterToApply = maxCounter;
                continue;
            }
            
            if (currentMaxCounterToApply > 0 && count[A[i] - 1] < currentMaxCounterToApply)
            {
                count[A[i] - 1] = currentMaxCounterToApply;
            }
            
            count[A[i] - 1] += 1;
            
            if (count[A[i] - 1] > maxCounter)
            {
                maxCounter = count[A[i] - 1];
            }
        }
        
        if (currentMaxCounterToApply > 0)
        {
            for (int j = 0; j < count.length; j++)
            {
                if (count[j] < currentMaxCounterToApply)
                {
                    count[j] = currentMaxCounterToApply;
                }
            }
        }
        
        return count;
    }
}