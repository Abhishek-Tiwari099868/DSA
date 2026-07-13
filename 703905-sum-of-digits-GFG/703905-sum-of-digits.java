class Solution {
    static int sumOfDigits(int n) {
        int sum = 0;
        for(;n >0; n =n/10){
            int digit = n%10;
            sum = sum+digit;
            
        }
        return sum;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna