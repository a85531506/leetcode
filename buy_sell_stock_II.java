public class Solution {
    public int maxProfit(int[] prices) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int sum=0;
        if(prices.length==0)return 0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i+1]-prices[i]>0)sum+=prices[i+1]-prices[i];
        }
        return sum;
    }
}