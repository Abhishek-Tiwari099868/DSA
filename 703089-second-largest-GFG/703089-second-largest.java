class Solution {
    public int getSecondLargest(int[] arr) {

        int max = -1;
        int secondMax = -1;

        for (int num : arr) {

            if (num > max) {
                secondMax = max;
                max = num;
            }

            else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return secondMax;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna