class Solution {
    public int[] solution(int[] A) {

        int N = A.length;
        int maxInt = N + N;
        
        // Make a count array of size of the biggest int + 1.
        int[] countArray = new int[maxInt + 1];

        for (int i = 0; i < N; i++)
        {
            countArray[A[i]] += 1;
        }

        // Use the sieve to make an array of divisors count.
        int[] divisorsArray = new int[maxInt + 1];
        
        for (int i = 0; i < countArray.length; i++)
        {
            if (countArray[i] == 0)
            {
                continue;
            }

            // Sum the number of count because there can be more than one repeated member.
            // This is a sieve algorithm.
            for (int k = i; k <= maxInt; k += i)
            {
                divisorsArray[k] += countArray[i];
            }
        }

        int[] result = new int[N];

        // Get the total number of elements (N) and subtracts by the number of divisors for each number.
        for (int i = 0; i < N; i++)
        {
            result[i] = N - divisorsArray[A[i]];
        }

        return result;
    }
}