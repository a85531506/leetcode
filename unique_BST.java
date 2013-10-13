public class Solution {
    public int numTrees(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] rec=new int[n+1];
        if(n==0)return 0;
        if(n==1)return 1;
        rec[0]=1;
        rec[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<=i;j++){
                rec[i]+=rec[j-1]*rec[i-j];
            }
        }
        return rec[n];
    }
}