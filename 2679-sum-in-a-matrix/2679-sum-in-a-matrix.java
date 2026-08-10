import java.util.Arrays;

class Solution {
    public int matrixSum(int[][] nums) {
        int score = 0;
        int rows = nums.length;
        int cols = nums[0].length;
        for (int i = 0; i < rows; i++) {
            Arrays.sort(nums[i]);
        }
        for (int j = 0; j < cols; j++) {
            int maxInCol = 0;
            for (int i = 0; i < rows; i++) {
                maxInCol = Math.max(maxInCol, nums[i][j]);
            }
            score += maxInCol;
        }
        return score;
    }
}