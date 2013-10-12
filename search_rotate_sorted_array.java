public class Solution {
    public boolean search(int[] A, int target) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(A.length==0)return false;
        return search(A,0,A.length-1,target);
    }
    public boolean search(int[] A,int begin, int end, int target){
        if(begin>end)return false;
        int mid=begin+(end-begin)/2;
        if(A[mid]==target)return true;
        if(A[begin]<A[mid]){
            if(target<A[mid]&&target>=A[begin])return search(A,begin,mid-1,target);
            else return search(A,mid+1,end,target);
        }
        else if(A[begin]>A[mid]){
            if(target>A[mid]&&target<=A[end])return search(A,mid+1,end,target);
            else return search(A,begin,mid-1,target);
        }
        else return search(A,begin+1,end,target);
    }
}