class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int dist = Y - X;
        
        if (dist == 0)
        {
            return 0;
        }
        
        int jumps = dist / D;
        
        int totalDistWithJumps = X + (jumps * D);
        
        if (totalDistWithJumps < Y)
        {
            jumps++;
        }
        
        return jumps;
    }
}