class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {    //if two strings are of different lengths, return false
            return false;
        }

        Map<Character, Integer> counter = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            counter.put(ch, counter.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;
            }
            counter.put(ch, counter.get(ch) - 1);   //One occurrence of this character has been used, so reduce its count by 1.
        }
        return true;
    }
}

//".get" => value in the HashMap
/** **if (!counter.containsKey(ch) || counter.get(ch) == 0) {
                return false;**
If the character is not in the HashMap OR its count has already become 0, then return false.

counter.get(ch) == 0
Checks if we've already used up all occurrences of that character.

Example:

counter = {a=0, b=1}
ch = 'a'

Then:

counter.get('a') == 0  // true

This means t contains more 'a' characters than s. */
