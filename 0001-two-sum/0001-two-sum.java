class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = nums.length;
        for(int i=0;i<s;i++){
            for(int j=i+1;j<s;j++){
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
    }
    return new int[]{};
}
}