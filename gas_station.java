public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int sum=0;
        int subsum=0;
        int start=0;
        for(int i=0;i<gas.length;i++){
            sum+=(gas[i]-cost[i]);
            subsum+=(gas[i]-cost[i]);
            if(subsum<0){
                subsum=0;
                start=i+1;
            }
        }
        if(sum>=0)return start;
        else return -1;
        
    }
}