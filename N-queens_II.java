public class Solution {
    int total;
    public int totalNQueens(int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        total=0;
        int[] seq=new int[n];
        total(n,0,seq);
        return total;
    }
    public void total(int n, int index, int[] seq){
        if(index==n){
            total++;
            return;
        }
        int j;
        int i;
        for(i=0;i<n;i++){
            for(j=0;j<index;j++){
                if(seq[j]==i)break;
                if(Math.abs(seq[j]-i)==index-j)break;
            }
            if(j==index){
               seq[index]=i;
            total(n,index+1,seq); 
            }
            
        }
    }
}