class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {  //s.toCharArray()
//This converts the string s into an array of characters (char[]).
//Example: If s = "hello", then s.toCharArray() becomes ['h', 'e', 'l', 'l', 'o'].
//for (char c : ...)
//This means: "for each character c in the array".
//On each loop iteration, c takes the value of the next character in the array.
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
