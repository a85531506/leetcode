public class Solution {
    public int[] plusOne(int[] digits) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int car=1;
        for(int i=digits.length-1;i>=0;i--){
            int sum=digits[i]+car;
            digits[i]=sum%10;
            car=sum/10;
        }
        if(car>0){
            int[] ans=new int[digits.length+1];
            ans[0]=1;
            for(int i=1;i<ans.length;i++){
                ans[i]=digits[i-1];
            }
            return ans;
        }
        else return digits;
    }
}