import java.util.HashSet;
import java.util.Set;

class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        Set<Integer> seen = new HashSet<>();
        int count = 0;

        for (int num : nums) {
            seen.add(num);
        }

        for (int num : nums) {
            if (seen.contains(num - diff) && seen.contains(num - 2 * diff)) {
                count++;
            }
        }

        return count;
    }
}