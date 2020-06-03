class Solution {
    public int[] solution(int[] A, int K) {
        // Make a clone of the array.
        int[] retVect = A.clone();

        // Trivial case, no rotation or the array only have 0 or 1 elements.
        if (K == 0 || retVect.length <= 1)
        {
            return retVect;
        }
        
        for (int i = 0; i < K; i++)
        {
            int aux1 = retVect[0];
            int aux2 = retVect[1];
            for(int j = 0; j < retVect.length - 1 ; j++)
            {
                aux2 = retVect[j + 1];
                retVect[j + 1] = aux1;
                aux1 = aux2;
            }
            
            retVect[0] = aux1;
        }
        
        return retVect;
    }
}