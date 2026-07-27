# DSA!!

## Problems Solved

### Increasing Array
**File**: `increasingarray.java`

**Problem**: Find the minimum number of moves required to make an array strictly increasing, where each move allows you to increment any element by 1.

**Approach**: Greedy algorithm that iterates through the array and increments elements that are smaller than the previous element.

**Solution**:
```java
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
```

**Complexity**:
- **Time**: O(n) - single pass through the array
- **Space**: O(1) - constant extra space

**Example**:
- Input: `[1, 2, 1, 2, 1]`
- Output: `3` (increment the 3rd element twice and the 5th element once)

---

### Other Problems
- [0007 - Reverse Integer](./0007-reverse-integer)
- [0026 - Remove Duplicates from Sorted Array](./0026-remove-duplicates-from-sorted-array)
