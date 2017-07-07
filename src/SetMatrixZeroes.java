/**
 * Created by liunian on 2017/4/19.
 */

//空间复杂度o（m+n）
public class SetMatrixZeroes {
    public void setZeroes(int[][] matrix) {
        //if (matrix == null || matrix.length == 0 || matrix[0].length
        int m=matrix.length;
        int n=matrix[0].length;
        boolean[] row =new boolean[m];
        boolean[] col =new boolean[n];
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                if (matrix[i][j]==0)
                {
                    row[i]=true;
                    col[j]=true;
                }
            }
        }


        for (int i =0;i<m;i++){
            for (int j=0;j<m;j++){
                if (row[i]==true||col[j]==true)
                    matrix[i][j]=0;
            }
        }

    }
}
