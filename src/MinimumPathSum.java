/**
 * Created by liunian on 2017/4/20.
 */
public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        //int[][] d = new int[m][n];
        //用grid来存储sum path
        int m=grid.length,n= grid[0].length;

        for (int i=0;i<m;i++){
            for (int j=0;i<m;j++){
                if (i==0&&j==0)
                    grid[i][j]=grid[i][j];
                if (i==0&&j!=0)
                    grid[i][j]=grid[i][j-1]+grid[i][j];
                if (i!=0&&j==0)
                    grid[i][j]=grid[i-1][j]+grid[i][j];
                if (i!=0&&j!=0)
                    grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];

            }

        }
        return grid[m-1][n-1];

    }
}
