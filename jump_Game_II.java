public class Solution {
    public int jump(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(A.length==1)return 0;
        int dist=A[0];
        int step=1;
        int range=0;
        for(int i=1;i<A.length;i++){
            if(i<=dist){
                range=Math.max(range, i+A[i]);
            }
            else{
                step++;
                dist=range;
                range=Math.max(range, i+A[i]);
            }
        }
        return step;
    }
}