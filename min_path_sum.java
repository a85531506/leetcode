public class Solution {
    public int minPathSum(int[][] grid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(grid.length==0)return 0;
        int rownum=grid.length;
        int colnum=grid[0].length;
        int[][] sum=new int[rownum][colnum];
        for(int i=0;i<rownum;i++){
            for(int j=0;j<colnum;j++){
                if(i==0&&j==0)sum[i][j]=grid[i][j];
                else if(i==0)sum[i][j]=grid[i][j]+sum[i][j-1];
                else if(j==0)sum[i][j]=grid[i][j]+sum[i-1][j];
                else sum[i][j]=grid[i][j]+Math.min(sum[i-1][j],sum[i][j-1]);
            }
        }
        return sum[rownum-1][colnum-1];
    }
}