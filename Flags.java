// Understand why max flags = sqrt(N).
class Solution {

    // Correct but slow, 86%.
    public int solution(int[] A) {

        int N = A.length;

        if (N < 3)
        {
            return 0;
        }

        boolean[] peaksArr = new boolean[N];
        peaksArr[N - 1] = false;
        peaksArr[0] = false;
        int peakCount = 0;
        for (int i = 1; i < N - 1; i++)
        {
            if (A[i] > A[i -1] && A[i] > A[i + 1])
            {
                peaksArr[i] = true;
                peakCount++;
            }
            else
            {
                peaksArr[i] = false;
            }
        }

        if (peakCount == 0)
        {
            return 0;
        }
        
        int maxFlags = 0;
        int i = 1;
        while ((i - 1) * i <= N)
        {
            int flags = i;
            int j = 0;
            while (j < N && flags > 0)
            {
                if (peaksArr[j])
                {
                    flags--;
                    j += i;
                    continue;
                }

                j++;
            }

            maxFlags = Math.max(maxFlags, i - flags);
            i++;
        }

        return maxFlags;
    }

    // Correct 100%.
    public int solution(int[] A) {

        int N = A.length;

        if (N < 3)
        {
            return 0;
        }

        int[] next = new int[N];
        next[N- 1] = -1;
        int peakCount = 0;
        for (int i = N - 2; i > 0; i--)
        {
            if (A[i] > A[i -1] && A[i] > A[i + 1])
            {
                next[i] = i;
                peakCount++;
            }
            else
            {
                next[i] = next[i + 1];
            }
        }

        next[0] = next[1];

        if (peakCount == 0)
        {
            return 0;
        }
        
        int maxFlags = 1;
        int i = 1;
        while ((i - 1) * i <= N && i <= peakCount)
        {
            int flags = 0;
            int pos = 0;
            while (pos < N && flags < i)
            {
                pos = next[pos];

                if (pos == -1)
                {
                    break;
                }
                
                flags++;
                pos += i;
            }

            maxFlags = Math.max(maxFlags, flags);
            i++;
        }

        return maxFlags;
    }
}