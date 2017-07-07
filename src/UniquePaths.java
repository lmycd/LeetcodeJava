/**
 * Created by liunian on 2017/4/18.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] d = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                if (i==0)
                    d[i][j]=1;
                if (j==0)
                    d[i][j]=1;
                d[i][j]=(i>=1)?(d[i-1][j]):0 ;
                d[i][j]+=(j>=1)?d[i][j-1]:0;

            }

        }
        return d[m-1][n-1];



    }
}
