class Solution {
    public static int findEquilibrium(int arr[]) {
       int leftsum = 0;
       int rightsum = 0;
       int totalsum = 0;
       for(int i = 0; i<arr.length; i++){
           totalsum = totalsum+arr[i];
          
       }
       for(int i = 0; i<arr.length; i++){
          rightsum = totalsum - leftsum - arr[i];
          if(leftsum==rightsum){
              return i;
        
          }
          else{
              leftsum += arr[i];
          }
       }
      return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna