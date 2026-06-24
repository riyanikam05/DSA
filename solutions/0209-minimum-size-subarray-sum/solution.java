class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;  //minLen = Largest possible int in java i.e. 2147483647
        int left = 0;
        int curSum = 0;

        for (int right = 0; right < nums.length; right++) {
            curSum += nums[right];

            while (curSum >= target) {
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                }
                curSum -= nums[left];
                left++;
            }
        }
        return minLen != Integer.MAX_VALUE ? minLen : 0;  /**if (minLen != Integer.MAX_VALUE) {
                                                                return minLen;
                                                            } else {
                                                                return 0;
                                                            } **/
    }
}
