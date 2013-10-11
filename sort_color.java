public class Solution {
    public void sortColors(int[] A) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int[] count={0,0,0};
        for(int i=0;i<A.length;i++){
            count[A[i]]++;
        }
        int begin=0;
        for(int i=0;i<count[0];i++){
            A[begin]=0;
            begin++;
        }
        for(int i=0;i<count[1];i++){
            A[begin]=1;
            begin++;
        }
        for(int i=0;i<count[2];i++){
            A[begin]=2;
            begin++;
        }
    }
}