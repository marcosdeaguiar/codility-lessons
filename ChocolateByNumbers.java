import java.util.*;
class Solution {
    
    public int gcm(int a, int b) {
        
        if (a % b == 0)
        {
            return b;
        }
        else
        {
            return gcm(b, a % b);
        }
    }
    
    public int solution(int N, int M) {
        
        int divisor = gcm(N, M);

        return N / divisor;
    }
}