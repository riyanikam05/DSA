class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs[0] == null || strs.length == 0) {
            return "";
        }
        for (int i = 0; i < strs[0].length(); i++) {  //Store 1st string (i.e. flower) in ch
            char ch = strs[0].charAt(i);

        for (int j = 1; j < strs.length; j++) {   //Compare the remaining strings (i.e. flow & flight) with 1st string
            if (i >= strs[j].length() || strs[j].charAt(i) != ch) {  //if String ended or Characters don't match, Return prefix found so far.
                return strs[0].substring(0, i);
            }
        }
        }
        return strs[0];
    }
}
