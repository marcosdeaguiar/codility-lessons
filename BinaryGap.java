// Remember that only counts after the first 1 is found.
class Solution {
    public int solution(int N) {
        
        // Trivial case.
        if (N == 0)
        {
            return 0;
        }
        
        int left = N;
        int greatest = 0;
        int zeroCount = 0;
        boolean foundFirstOne = false;
        
        while (left > 0)
        {
            int mod = left % 2;
            left /= 2;
            
            if (mod == 0)
            {
                zeroCount++;
            }
            else
            {
                // Only get the result if the first 1 was found.
                if ((zeroCount > greatest) && foundFirstOne)
                {
                    greatest = zeroCount;
                }
                
                foundFirstOne = true;
                
                zeroCount = 0;
            }
        }
        
        return greatest;
    }
}