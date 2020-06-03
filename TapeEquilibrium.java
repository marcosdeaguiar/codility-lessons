class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        boolean firstP = true;
        int smallestP = 0;
        int pLeft = 0;
        int pRight = 0;
        
        for (int p = 1; p < A.length; p++)
        {
            pLeft += A[p - 1];
            
            if (firstP)
            {
                for (int i = p; i < A.length; i++)
                {
                    pRight += A[i];
                }
            }
            else
            {
                pRight -= A[p - 1];
            }
            
            int total = Math.abs(pLeft - pRight);
            
            if (firstP)
            {
                firstP = false;
                smallestP = total;
            }
            else
            {
                if (total < smallestP)
                {
                    smallestP = total;
                }
            }
        }
        
        return smallestP;
    }
}