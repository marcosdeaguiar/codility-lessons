// See as a stacking problem.
// Take care with undeflow, use long.
import java.util.*;

class SortEvent implements Comparator<long[]> 
{ 
    // Used for sorting in ascending order of 
    // roll number 
    public int compare(long[] a, long[] b)
    { 
        if (a[0] > b[0])
            return 1;
        if (a[0] < b[0])
            return -1;
            
        if (a[1] > b[1])
            return -1;
        if (a[1] < b[1])
            return 1;
            
        return 0;
    } 
}

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int N = A.length;
        if (N == 0 || N == 1)
        {
            return 0;
        }
        
        ArrayList<long[]> events = new ArrayList<long[]>();
        for (int i = 0; i < N; i++)
        {
            long[] event1 = new long[2];
            long[] event2 = new long[2];
            event1[0] = (long)i - A[i];
            event1[1] = 1;
            event2[0] = (long)i + A[i];
            event2[1] = -1;
            events.add(event1);
            events.add(event2);
        }
        
        events.sort(new SortEvent());
        long activeDisc = 0;
        long intersectionCount = 0;
        for (long[] event : events)
        {
            activeDisc += event[1];
            if (event[1] > 0 && activeDisc > 1)
            {
                intersectionCount += activeDisc - 1;
            }
            
            if (intersectionCount > 10000000)
            {
                return -1;
            }
        }
        
        return (int)intersectionCount;
    }
}