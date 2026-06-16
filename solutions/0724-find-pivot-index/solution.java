class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;

        for (int num : nums){
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < nums.length; i++){
            int rightSum = totalSum - leftSum - nums[i];   /**Formula: totalsum = leftsum + num[i]    rightsum */

            if (leftSum == rightSum){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;  //If no pivot index exist.
    }
}
