class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            // Even digit ranges: 2 digits (10-99), 4 digits (1000-9999), or 6 digits (100000)
            if ((num >= 10 && num <= 99) || (num >= 1000 && num <= 9999) || num == 100000) {
                count++;
            }
        }
        return count;
    }
}

