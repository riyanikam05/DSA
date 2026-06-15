class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> check = new HashSet<>();

        for (int i : nums){
            check.add(i);
        }

        int ans = 0;

        for (int val : check){
            
            //Start only if it is the beginning
            if(!check.contains(val - 1)){
                int count = 0;

                while (check.contains(val + count)){
                    count++;
                }

                ans = Math.max(ans, count);
            }
        }
        return ans;
    }
}
