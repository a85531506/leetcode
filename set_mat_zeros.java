public class Solution {
    public void setZeroes(int[][] matrix) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        int rownum=matrix.length;
        int colnum=matrix[0].length;
        boolean[] row=new boolean[rownum];
        boolean[] col=new boolean[colnum];
        for(int i=0;i<rownum;i++){
            for(int j=0;j<colnum;j++){
                if(matrix[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<rownum;i++){
            for(int j=0;j<colnum;j++){
                if(row[i]||col[j])matrix[i][j]=0;
            }
        }
    }
}