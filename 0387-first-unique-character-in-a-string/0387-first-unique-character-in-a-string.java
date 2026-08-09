class Solution {
    public int firstUniqChar(String s) {
        int [] freq = new int[256];
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i++){
            freq[ch[i]]++;
        }
        for(int i=0;i<ch.length;i++){
            if(freq[ch[i]]==1) return i;
        }
        return -1;
    }
}