class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        int i = 0;
        // 'miss' represents the smallest integer we cannot currently form.
        // We use a long to prevent integer overflow when doubling 'miss'.
        long miss = 1; 

        while (miss <= n) {
            if (i < nums.length && nums[i] <= miss) {
                // If the current element can cover our 'miss', 
                // we expand our reachable range up to [1, miss + nums[i] - 1]
                miss += nums[i];
                i++;
            } else {
                // If the current element is too large or we ran out of numbers,
                // we greedily patch 'miss' itself into the array.
                // This doubles our range to [1, 2 * miss - 1]
                miss += miss;
                patches++;
            }
        }
        
        return patches;
    }
}
