// Can be done with counter I believe.
import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> brackets = new Stack<Character>();
        
        for(int i = 0; i < S.length(); i++)
        {
            char brack = S.charAt(i);
            if (brack == '(')
            {
                brackets.push(brack);
                continue;
            }
            
            if (brackets.size() == 0)
            {
                return 0;
            }
            
            brackets.pop();
        }

        if(brackets.size() > 0)
        {
            return 0;
        }
        
        return 1;
    }
}