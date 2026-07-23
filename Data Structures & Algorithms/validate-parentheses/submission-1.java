class Solution {
    public boolean isValid(String s) {
        // Quick optimization: Odd length strings can never be balanced
        if (s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push its matching CLOSING bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } 
            // If it's a closing bracket:
            // 1. Check if stack is empty (closing bracket with no opening bracket before it)
            // 2. Check if the popped character matches current bracket
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }

        // If stack is completely empty, all brackets were matched correctly!
        return stack.isEmpty();
    }
}