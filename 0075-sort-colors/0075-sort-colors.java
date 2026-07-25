class Solution {
    public void sortColors(int[] nums) {
        int count0=0;
        int count1=0;
        int count2=0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]==0){
                count0++;
            }
            else if(nums[i]==1){
                count1++;
            }
            else if(nums[i]==2){
                count2++;
            }
        }
        int change=0;
        for(int j = 0; j<count0; j++){
            nums[change++]=0;
        }
        for(int j = 0; j<count1; j++){
            nums[change++]=1;
        } 
        for(int j = 0; j<count2; j++){
            nums[change++]=2;
        }    
           

        
    }
}

//2approach optimized
class Solution {
    public void sortColors(int[] nums) {

        int start = 0;
        int mid = 0;
        int end = nums.length - 1;

        while (mid <= end) {

            if (nums[mid] == 0) {

                int temp = nums[start];
                nums[start] = nums[mid];
                nums[mid] = temp;

                start++;
                mid++;

            } else if (nums[mid] == 1) {

                mid++;

            } else { 

                int temp = nums[mid];
                nums[mid] = nums[end];
                nums[end] = temp;

                end--;
            }
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna
