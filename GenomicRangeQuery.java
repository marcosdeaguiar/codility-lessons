class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] prefixA = new int[S.length() + 1];
        int[] prefixC = new int[S.length() + 1];
        int[] prefixG = new int[S.length() + 1];
        
        for (int i = 0; i < S.length(); i++)
        {
            int valA = 0;
            int valC = 0;
            int valG = 0;

            if (S.charAt(i) == 'A')
            {
                valA = 1;
            }
            else if (S.charAt(i) == 'C')
            {
                valC = 1;
            }
            else if (S.charAt(i) == 'G')
            {
                valG = 1;
            }
            
            prefixA[i + 1] = valA + prefixA[i];
            prefixC[i + 1] = valC + prefixC[i];
            prefixG[i + 1] = valG + prefixG[i];
        }
        
        int [] res = new int[P.length];
        
        for (int i = 0; i < P.length; i++)
        {
            if (prefixA[Q[i] + 1] - prefixA[P[i]] > 0)
            {
                res[i] = 1;
            }
            else if (prefixC[Q[i] + 1] - prefixC[P[i]] > 0)
            {
                res[i] = 2;
            }
            else if (prefixG[Q[i] + 1] - prefixG[P[i]] > 0)
            {
                res[i] = 3;
            }
            else
            {
                res[i] = 4;
            }
        }
        
        return res;
    }
}