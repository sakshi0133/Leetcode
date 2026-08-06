class Solution {
    public boolean detectCapitalUse(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))) c++;
            }
            if(c==0) return true;
            if(c==word.length()) return true;
            if(c==1 && Character.isUpperCase(word.charAt(0))) return true;
            return false;
        }
    }
