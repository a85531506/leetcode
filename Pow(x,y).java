public class Solution {
    public double pow(double x, int n) {
        // Start typing your Java solution below
        // DO NOT write main() function
        boolean isNeg=false;
        double ans=0;
        if(n<0){
            n=-n;
            isNeg=true;
        }
        if(n==0)return 1;
        if(n==1)ans=x;
        double res=pow(x,n/2);
        if(n%2==0)ans=res*res;
        else ans=res*res*x;
        if(isNeg)ans=1/ans;
        return ans;
    }
}