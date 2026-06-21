class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;

        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            if (!charMap.containsKey(s.charAt(right)) || charMap.get(s.charAt(right)) < left) {  //if does not exist in HashMap OR has occured before at the index < left, then store the latest (current) index and update right.

                charMap.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                left = charMap.get(s.charAt(right)) + 1;  //if exists in map, increment left by 1
                charMap.put(s.charAt(right), right);   // update right by 1
            }
        }
        return maxLength;
    }
}
