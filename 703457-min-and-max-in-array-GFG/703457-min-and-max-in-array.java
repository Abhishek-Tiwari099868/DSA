class Solution {
	public ArrayList<Integer> getMinMax(int[] arr) {
		int min = arr[0];
		int max = arr[0];
		
		for (int num :arr) {
			if (num < min) {
				min = num;
			}
			
			if (num > max) {
				max = num;
			}
		}
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(min);
		result.add(max);
		
		return result;
		
	}
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna