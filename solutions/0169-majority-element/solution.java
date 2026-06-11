class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();  //Number -> Frequency

        for (int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i],0)+1); /**map.getOrDefault(key, defaultValue)
            If the key exists, return its value.
            Otherwise return the default value i.e. 0.
            i = 0
            nums[0] = 2
            map.put(2, map.getOrDefault(2,0)+1);
            map.put(2,0+1);
            Map:
            2 -> 1**/
        }

        n = n/2;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){  /**Each entry contains:
            key   = number
            value = frequency
            For our map:
            entry1: key=2, value=4
            entry2: key=1, value=3 */
            
            if (entry.getValue() > n){
                return entry.getKey();
            }
        }

        return 0;
    }
}

/**nums = [2,2,1,1,1,2,2]
Length = 7
Majority threshold = 7/2 = 3
Since 2 appears 4 times (> 3), the answer is 2.**/
