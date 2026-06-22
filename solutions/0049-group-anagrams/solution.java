class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] count = new int[26];  //"26" since 26 alphabets

            for (char c : str.toCharArray()) {
                count[c - 'a']++;   //since a is the smallest ASCII value aplhabet (a = 97)
            }
            StringBuilder key = new StringBuilder();

            for (int num : count) {
                key.append("#");
                key.append(num);
            }
            String k = key.toString();

            map.putIfAbsent(k, new ArrayList<>());
            map.get(k).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
