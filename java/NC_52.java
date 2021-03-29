import java.util.*;


public class Solution {
    /**
     * 
     * @param s string字符串 
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        if(s.isEmpty())    return true;
        Stack <Character> stack = new Stack<>();
        int n = s.length();
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='(')
                stack.push(')');
            else if(s.charAt(i)=='[')
                stack.push(']');
            else if(s.charAt(i)=='{')
                stack.push('}');
            else if(stack.isEmpty()||stack.pop()!=s.charAt(i))
                return false;
//             switch (s.charAt(i)){
//                 case '(':
//                 case '{':
//                 case '[':
//                     stack.push(s.charAt(i));
//                     break;
//                 case ')':
//                     if(stack.isEmpty())
//                         return false;
//                     else if(stack.peek()=='(')
//                         stack.pop();
//                     else
//                         return false;
//                     break;
//                 case '}':
//                     if(stack.isEmpty())
//                         return false;
//                     else if(stack.peek()=='{')
//                         stack.pop();
//                     else
//                         return false;
//                     break;
//                 case ']':
//                     if(stack.isEmpty())
//                         return false;
//                     else if(stack.peek()=='[')
//                         stack.pop();
//                     else
//                         return false;
//                     break;
//             }
        }
        if(stack.isEmpty())    return true;
        return false;
    }
}