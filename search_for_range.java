public class Solution {
    public int[] searchRange(int[] A, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int b=0;
        int e=A.length-1;
        int[] range=new int[2];
        range[0]=-1;
        range[1]=-1;
        while(b<e){
            int mid=b+(e-b)/2;
            if(target<A[mid])e=mid-1;
            else b=mid+1;
        }
        if(A[b]==target)range[1]=b;
        else if(b-1>=0&&A[b-1]==target)range[1]=b-1;
        b=0;
        e=A.length-1;
        while(b<e){
            int mid=b+(e-b)/2;
            if(target>A[mid])b=mid+1;
            else e=mid-1;
        }
        if(A[b]==target)range[0]=b;
        else if(b+1<=A.length-1&&A[b+1]==target)range[0]=b+1;
        return range;
    }
}