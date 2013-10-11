public class Solution {
    public boolean isPalindrome(int x) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int reverse=0;
        int temp=x;
        while(temp>0){
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        return reverse==x;
    }
}