class Solution {
    public int thirdMax(int[] nums) {
        int n = nums.length;
        int max = nums[0];
        for (int i = 0; i < n; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        int smax = 0;
        boolean foundSmax = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] != max) {
                if (!foundSmax || nums[i] > smax) {
                    smax = nums[i];
                    foundSmax = true;
                }
            }}
        if (!foundSmax) {
            return max;
        }
        int tmax = 0;
        boolean foundTmax = false;
        for (int i = 0; i < n; i++) {
            if (nums[i] != max && nums[i] != smax) {
                if (!foundTmax || nums[i] > tmax) {
                    tmax = nums[i];
                    foundTmax = true;
                }
            }
        }
        return foundTmax ? tmax : max;
    }
}