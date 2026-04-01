class Solution {
    public int singleNumber(int[] nums) {
        int res = 0; //because 0 ^ a = a

        for (int n : nums) {
            res ^= n; //res = res ^ n;
        }

        return res;
    }
}

/** Properties of XOR:
a ^ a = 0  
a ^ 0 = a  
Commutative: a ^ b = b ^ a
Associative: (a ^ b) ^ c = a ^ (b ^ c)

nums = [2, 3, 2, 4, 3]
res = 0

res = 0 ^ 2 = 2
res = 2 ^ 3 = 1
res = 1 ^ 2 = 3
res = 3 ^ 4 = 7
res = 7 ^ 3 = 4
Final answer: 4

Think of it like:
(2 ^ 2) ^ (3 ^ 3) ^ 4
= 0 ^ 0 ^ 4
= 4 */
