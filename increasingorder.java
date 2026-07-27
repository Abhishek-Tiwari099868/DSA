class Solution {
    public long minMoves(int[] nums) {

        long moves = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < nums[i - 1]) {

                moves += (nums[i - 1] - nums[i]);

                nums[i] = nums[i - 1];
            }
        }

        return moves;
    }
}
