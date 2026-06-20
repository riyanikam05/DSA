class Solution {
    public int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        for(int i = 0; i < s.length() - 1; i++){  //stop at the 2nd last character to compare s.charAt(i) and s.chyarAt(i+1)
        if(roman.get(s.charAt(i)) < roman.get(s.charAt(i + 1))){  //if i < i+1 -> s.charAt(i+1)-s.charAt(i)
                res -= roman.get(s.charAt(i));
            }
            else {
                res += roman.get(s.charAt(i));   //else add.
            }
        }       

        return res + roman.get(s.charAt(s.length() - 1));  //The loop never processes the last character, so we add it separately.
        }
}
