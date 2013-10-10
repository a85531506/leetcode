public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int rownum=matrix.length;
        int colnum=matrix[0].length;
        int i=0;
        int j=colnum-1;
        while(j>=0&&i<rownum){
            if(matrix[i][j]==target)return true;
            else if(matrix[i][j]>target)j--;
            else i++;
        }
        return false;
    }
}