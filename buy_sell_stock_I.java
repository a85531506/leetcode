public class Solution {
    public int maxProfit(int[] prices) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int ans=0;
        if(prices.length==0)return 0;
        int min=prices[0];
        for(int i=1;i<prices.length;i++){
            int diff=prices[i]-min;
            if(diff>ans)ans=diff;
            if(prices[i]<min)min=prices[i];
        }
        return ans;
    }
}