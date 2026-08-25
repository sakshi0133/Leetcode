class Solution {
    public int numTeams(int[] rating) {
        int n = rating.length;
        int total =0;
        for(int j=0;j<n;j++){
            int ls=0,ll=0;
            int rs =0,rl =0;
            for(int i=0;i<j;i++){
                if(rating[i]<rating[j]) ls++;
                else if (rating[i]>rating[j]) ll++;
            }
            for(int k=j+1;k<n;k++){
                if(rating[k]>rating[j]) rl++;
                else if (rating[k]<rating[j]) rs++;
            }
            total+=(ls*rl)+(ll*rs);
        }
        return total;
    }
}