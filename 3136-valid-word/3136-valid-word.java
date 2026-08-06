class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        boolean v = false;
        boolean c = false;
        if(n>=3){
            for(int i=0;i<n;i++){
                char ch = word.charAt(i);
                if((ch>='A'&&ch<='Z')||(ch>='0'&& ch<='9')||(ch>='a'&&ch<='z')){
                    if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                        v = true;}
                    else if((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')){ c = true;}
                }
                else {return false;}
            }
        }
        return v&&c;
    }
}