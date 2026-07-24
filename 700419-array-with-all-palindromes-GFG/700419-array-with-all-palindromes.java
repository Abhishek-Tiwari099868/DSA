class Solution {
    public static boolean isPalinArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int original = arr[i];
            int num = arr[i];
            int rev = 0;

            while (num > 0) {

                int digit = num%10;
                rev = rev*10+digit;
                num = num/10;
                

            }

            if(rev!=original)
              return false;
            

        }

        return true;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna