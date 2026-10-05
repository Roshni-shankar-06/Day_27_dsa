class Solution {
    public int[] replaceElements(int[] arr) {
        // Initialize the maximum element from the right side as -1
        int maxOfRight = -1;
        
        // Traverse the array backwards from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            int currentVal = arr[i]; // Store the original value before overwriting
            arr[i] = maxOfRight;     // Replace current element with the max seen so far
            maxOfRight = Math.max(maxOfRight, currentVal); // Update the max for the next element
        
