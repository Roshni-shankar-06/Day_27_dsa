class Solution {
    public int minPatches(int[] nums, int n) {
        int patches = 0;
        int i = 0;
        // 'miss' represents the smallest integer we cannot currently form.
        // We use a long to prevent integer overflow when doubling 'miss'.
        long miss = 1; 

        while (miss <= n) {
          
