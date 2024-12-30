class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, i = n - 2;  //line 3 to 13, to convert nums[] in descending order
        
        while (i >= 0 && nums[i] >= nums[i + 1]) 
            i--;
        
        if (i >= 0) {
            int j = n - 1;

            while (nums[j] <= nums[i]) 
                j--;

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        reverse(nums, i + 1, n - 1);  //to reverse all the elements in the right of i
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
