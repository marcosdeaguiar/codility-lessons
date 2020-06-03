// Remember prefixsum to accelerate query processing.
class Solution {
    public int[] solution(int N, int[] P, int[] Q) {

        int[] F = new int[N + 1];
        F[0] = 0;
        F[1] = 0;

        // Do a sieve algorithm to save the smallest divisor of the number.
        // If the divisor is not zero than this is the first smaller divisor.
        int i = 2;
        while (i * i <= N)
        {
            int k = i * i;
            while (k <= N)
            {
                if (F[k] == 0)
                {
                    F[k] = i;
                }
                
                k += i;
            }
            
            i++;
        }

        // Make a prefix sum of the number of the count of semi primes. To know if it is a semi prime
        // we just need to know that after dividing by the first divisor, the second divisor doesn't have
        // a divisor anymore.
        int[] prefix = new int[N + 2];
        for (i = 3; i < F.length; i++)
        {            
            int x = i;

            if (F[x] > 0)
            {
                x /= F[x];
                if (F[x] == 0)
                {
                    prefix[i + 1] += 1;
                }
            }
            
            prefix[i + 1] += prefix[i];
        }

        // The trivial part, the query uses the prefix sum array to get the result in O(1).
        int M = P.length;
        int [] result = new int[M];
        for (i = 0; i < M; i++)
        {            
            result[i] = prefix[Q[i] + 1] - prefix[P[i]];
        }

        return result;
    }
}