class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int length = A.length;
        
        if (length == 0)
        {
            return 0;
        }
        
        int[] countArray = new int[length];
        
        for (int i = 0; i < length; i++)
        {
            if (A[i] > length)
            {
                return 0;
            }
            else
            {
                countArray[A[i] - 1] += 1;
            }
        }
        
        for (int i = 0; i < length; i++)
        {
            if (countArray[i] == 0)
            {
                return 0;
            }
        }
        
        return 1;
    }
}