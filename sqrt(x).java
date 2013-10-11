public class Solution {
    public int sqrt(int x) {
        // Start typing your Java solution below
        // DO NOT write main() function
        long mid=x/2;
        long low=0;
        long up=x;
        while(true){
            if(mid*mid==x||mid*mid<x&&(mid+1)*(mid+1)>x)return (int)mid;
            else if(mid*mid>x){
                up=mid-1;
                mid=(up+low)/2;
            }
            else{
                low=mid+1;
                mid=(up+low)/2;
            }
        }
    }
}