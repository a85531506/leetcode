public class Solution {
    public int searchInsert(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==0)return 0;
        if(target<A[0])return 0;
        for(int i=0;i<A.length;i++){
            if(A[i]==target)return i;
            if(A[i]>target&&A[i-1]<target)return i;
        }
        return A.length;
    }
}