class Solution {
    static ArrayList<Integer> leaders(int arr[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int max = arr[n - 1];

        for (int i = n - 1; i >= 0; i--) {

            if (arr[i] >= max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }

        Collections.reverse(ans);
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna