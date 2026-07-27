class Solution {
    public int[] rearrangeArray(int[] nums) {
        int positive=0;
        int negative=1;
        int[] ans = new int[nums.length];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                ans[positive]=nums[i];
                positive +=2;
            }
            else{
                ans[negative]=nums[i];
                negative+=2;
            }
            
        }
        return ans;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna