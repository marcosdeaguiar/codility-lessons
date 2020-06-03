// Take care of the overflow cases.
class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        long i = 1;
        int result = 0;
        while(i * i < N)
        {
            if (N % i == 0)
            {
                result += 2;
            }
            i++;
        }
        
        if (i * i == N)
        {
            result++;
        }
        
        return result;
    }
}