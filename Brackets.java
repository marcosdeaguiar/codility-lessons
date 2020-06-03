import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
        Stack<Character> brackets = new Stack<Character>();
        
        for(int i = 0; i < S.length(); i++)
        {
            char brack = S.charAt(i);
            if (brack == '{' || brack == '[' || brack == '(')
            {
                brackets.push(brack);
                continue;
            }
            
            if (brackets.size() == 0)
            {
                return 0;
            }
            
            char head = brackets.pop();
            if (brack == '}' && head != '{')
            {
                return 0;
            }
            else if (brack == ']' && head != '[')
            {
                return 0;
            }
            else if (brack == ')' && head != '(')
            {
                return 0;
            }            
        }

        if(brackets.size() > 0)
        {
            return 0;
        }
        
        return 1;
    }
}