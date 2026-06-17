//Brute Force
/**class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            if (nums[i] == nums[i+1])
                return true;
        }
        return false;
    }
} */

//Optimized : HashSet (TC = O(n))
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : nums){
            if (seen.contains(num))
                return true;
            seen.add(num);    
        }
        return false;
    }
}
