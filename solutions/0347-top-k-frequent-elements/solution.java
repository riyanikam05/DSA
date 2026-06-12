class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();

        for ( int num : nums)
            freq.put(num, freq.getOrDefault(num, 0)+1);

        List<List<Integer>> bucket = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++)
            bucket.add(new ArrayList<>());

        for (Map.Entry<Integer, Integer> entry : freq.entrySet())
            bucket.get(entry.getValue()).add(entry.getKey());

        int[] result = new int [k];
        int index = 0;

        for (int count = nums.length; count >= 1 && index < k; count--){
            if (bucket.get(count) != null) {
                for (int num : bucket.get(count)) {
                    result [index++] = num;
                    if (index == k)
                        break;
                }
            }
        }        
        
        return result;
    }
}
