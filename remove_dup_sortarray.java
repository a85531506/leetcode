public class Solution {
    public int removeDuplicates(int[] A) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int begin=0;
        if(A.length==0)return 0;
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[begin]){
                begin++;
                A[begin]=A[i];
            }
        }
        return begin+1;
    }
}