public class Solution {
    public int climbStairs(int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int int1=1;
        int int2=2;
        if(n==1)return 1;
        if(n==2)return 2;
        int sum=0;
        for(int i=3;i<=n;i++){
            sum=int1+int2;
            int1=int2;
            int2=sum;
        }
        return sum;
    }
}