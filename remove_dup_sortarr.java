public class Solution {
    public int removeDuplicates(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int begin=0;
        int count=1;
        if(A.length==0)return 0;
        for(int i=1;i<A.length;i++){
            if(A[i]!=A[begin]){
                begin++;
                A[begin]=A[i];
                count=1;
            }
            else{
                if(count==1){
                    begin++;
                    A[begin]=A[i];
                    count++;
                }
            }
        }
        return begin+1;
    }
}