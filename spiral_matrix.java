public class Solution {
    public ArrayList<Integer> spiralOrder(int[][] matrix) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        ArrayList<Integer> ans=new ArrayList<Integer>();
        if(matrix.length==0)return ans;
        int rownum=matrix.length;
        int colnum=matrix[0].length;
        spiralOrder(matrix,ans,rownum,0,colnum,0);
        return ans;
    }
    public void spiralOrder(int[][] matrix, ArrayList<Integer> arr, int rownum, int rowbegin, int colnum, int colbegin){
        if(rownum==0||colnum==0)return;
        if(rownum==1){
            for(int i=colbegin;i<colbegin+colnum;i++)arr.add(matrix[rowbegin][i]);
            return;
        }
        if(colnum==1){
            for(int i=rowbegin;i<rowbegin+rownum;i++)arr.add(matrix[i][colbegin]);
            return;
        }
        for(int i=colbegin;i<colbegin+colnum-1;i++)arr.add(matrix[rowbegin][i]);
        for(int i=rowbegin;i<rowbegin+rownum-1;i++)arr.add(matrix[i][colbegin+colnum-1]);
        for(int i=colbegin+colnum-1;i>colbegin;i--)arr.add(matrix[rowbegin+rownum-1][i]);
        for(int i=rowbegin+rownum-1;i>rowbegin;i--)arr.add(matrix[i][colbegin]);
        spiralOrder(matrix,arr,rownum-2,rowbegin+1,colnum-2,colbegin+1);
    }
}