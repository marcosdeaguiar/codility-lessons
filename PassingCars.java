class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        if (A.length == 1)
        {
            return 0;
        }
        
        int[] prefix = new int[A.length + 1];
        
        for (int i = 0; i < A.length; i++)
        {
            prefix[i + 1] = A[i] + prefix[i];
        }
        
        long passingCars = 0;
        
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] == 1)
            {
                continue;
            }
            
            passingCars += prefix[A.length] - prefix[i + 1];
        }
        
        if (passingCars > 1000000000)
        {
            return -1;
        }
        
        return (int)passingCars;
    }
}