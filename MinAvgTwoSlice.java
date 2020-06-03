// The key is that only slices with size 2 and 3 matter.
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int bestP = 0;
        int[] prefix = new int[A.length + 1];
        for (int i = 0; i < A.length; i++)
        {
            prefix[i+1] = prefix[i] + A[i];
        }
        
        double bestAvg = (double)(prefix[2] - prefix[0])/2;
        
        for (int p = 0; p < A.length - 1; p++)
        {
            double avg2 = (double)(prefix[p + 2] - prefix[p])/2;
            if (avg2 < bestAvg)
            {
                bestAvg = avg2;
                bestP = p;
            }

            if (p < A.length - 2)
            {
                double avg3 = (double)(prefix[p + 3] - prefix[p])/3;
                if (avg3 < bestAvg)
                {
                    bestAvg = avg3;
                    bestP = p;
                }
            }
        }

        return bestP;
    }
}