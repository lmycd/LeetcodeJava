import java.util.Arrays;

/**
 * Created by liunian on 2017/4/19.
 */
public class UniquePathsII {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=obstacleGrid[0].length;
        if (m==1||n==1)return 1;
        int[][] d = new int[m][n];
        for (int i=0;i<m;i++){
            Arrays.fill(d[i],1);

        }

        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){

                //d[i][j]=d[i][j-1]+d[i-1][j];
                d[i][j]=(obstacleGrid[i-1][j]==0)?(d[i-1][j]):0 ;
                d[i][j]+=(obstacleGrid[i][j-1]==0)?d[i][j-1]:0;

            }

        }
        return d[m-1][n-1];

    }

}
