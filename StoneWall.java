import java.util.*;
class Solution {
    public int solution(int[] H) {
        
        if (H.length == 1)
        {
            return 1;
        }
        
        int count = 0;
        Stack<Integer> blocks = new Stack<Integer>();
        
        for(int i = 0; i < H.length; i++)
        {
            if (blocks.size() == 0)
            {
                blocks.push(H[i]);
                count++;
                continue;
            }
            
            if (H[i] == blocks.peek())
            {
                continue;
            }
            
            if (H[i] > blocks.peek())
            {
                blocks.push(H[i]);
                count++;
                continue;
            }
            
            if (H[i] < blocks.peek())
            {
                while (blocks.size() > 0 && H[i] < blocks.peek())
                {
                    blocks.pop();
                }
                
                if (blocks.size() > 0 && H[i] == blocks.peek())
                {
                    continue;
                }
                
                blocks.push(H[i]);
                count++;
            }
        }
        
        return count;
    }
}