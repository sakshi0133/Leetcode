class Solution {
    public int majorityElement(int[] nums) {
        int can =0;
        int s =0;
        for(int num:nums){
            if(s==0){
                can = num;
            }
            if(num==can) s++;
            else s--;
        }
        return can;
    }
}