class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
        if (A%K > 0)
        {
            return B/K - A/K;
        }
        else
        {
            return B/K - A/K + 1;
        }
    }
}