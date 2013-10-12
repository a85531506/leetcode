public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int rownum=obstacleGrid.length;
        int colnum=obstacleGrid[0].length;
        int[][] path=new int[rownum][colnum];
        for(int i=0;i<rownum;i++){
            for(int j=0;j<colnum;j++){
                if(obstacleGrid[i][j]==1)path[i][j]=0;
                else{
                    if(i==0&&j==0)path[i][j]=1;
                    else if(i==0)path[i][j]=path[i][j-1];
                    else if(j==0)path[i][j]=path[i-1][j];
                    else path[i][j]=path[i-1][j]+path[i][j-1];
                }
            }
        }
        return path[rownum-1][colnum-1];
    }
}