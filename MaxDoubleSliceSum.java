class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        int[] s1 = new int[N];
        int[] s2 = new int[N];
        
        for (int i = 1; i < N - 1; i++)
        {
            s1[i] = Math.max(0, s1[i - 1] + A[i]);
        }
        
        for (int i = N - 2; i > 0; i--)
        {
            s2[i] = Math.max(0, s2[i + 1] + A[i]);
        }
        
        int max = 0;
        
        for (int i = 1; i < N - 1; i++)
        {
            max = Math.max(max, s1[i - 1] + s2[i + 1]);
        }
        
        return max;
    }
}