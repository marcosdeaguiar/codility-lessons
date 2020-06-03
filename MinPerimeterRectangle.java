class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        long i = 1;
        int A = 1;
        int B = 1;
        
        if (N == 1)
        {
            return 4;
        }
        
        while (i * i < N)
        {
            if (N % i == 0)
            {
                A = (int)i;
            }
            
            i++;
        }
        
        B = (int)i;
        
        // If square root.
        if (B * B == N)
        {
            return 2 * (B + B);
        }
        
        // If prime only one way.
        if (A == 1)
        {
            return 2 * (A + N);
        }
        
        // Get B.
        while (i <= N)
        {
            if (N % i == 0)
            {
                B = (int)i;
                break;
            }
            
            i++;
        }
        
        return 2 * (A + B);
    }
}