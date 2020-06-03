import java.util.*;
class Solution {
    public int solution(int[] A) {
        int N = A.length;
        
        if (N < 3)
        {
            return 0;
        }
        
        ArrayList<Integer> peaks = new ArrayList<Integer>();
        // Find peaks first.
        for (int i = 1; i < N - 1; i++)
        {
            if (A[i] > A[i - 1] && A[i] > A[i + 1])
            {
                peaks.add(i);
            }
        }
        
        if (peaks.size() == 0)
        {
            return 0;
        }
        
        for (int i = peaks.size(); i > 0; i--)
        {
            if (N % i != 0)
            {
                continue;
            }
            
            int blockSize = N / i;

            boolean[] foundPart = new boolean[i];
            int found = 0;
            for (int j = 0; j < peaks.size(); j++)
            {
                int blockIndex = peaks.get(j) / blockSize;
                if (foundPart[blockIndex] == false)
                {
                    foundPart[blockIndex] = true;
                    found++;
                }
            }
            
            if (found == i)
            {
                return i;
            }
        }
        
        return 1;
    }
}