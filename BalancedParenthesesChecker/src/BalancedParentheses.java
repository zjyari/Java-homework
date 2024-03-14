import java.util.Stack;

public class BalancedParentheses {
    public static boolean checkBalancedParentheses(String expression) {
        Stack<Character> stack = new Stack<>();
        char[] chars = expression.toCharArray();

        for (char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false; 
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == ']' && top != '[') || (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
}
}
  
   

