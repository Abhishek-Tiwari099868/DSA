class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedsum = n*(n+1)/2;
        int actualsum = 0;
        for(int i=0; i<n ;i++){
            actualsum = actualsum+nums[i];
        }
        return expectedsum-actualsum;
            
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna