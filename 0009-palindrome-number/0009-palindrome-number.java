class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int n = x;
        while(n>0){
            int last = n%10;
            rev = rev*10+last;
            n = n/10;
        }
        int temp = rev;
        if(temp==x) return true;
        else return false;
    }
}