/**
 * Created by liunian on 2017/4/19.
 */
public class Searcha2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length==0)return false;
        int m=matrix.length,n=matrix[0].length;
        int row =-1;
        for (int i=0;i<m-1;i++){
            if (matrix[i][0]==target)
                return true;
            if (matrix[i][0]<target&&matrix[i+1][0]>target)
                row=i;

        }
        if (row==-1) {
            if (target <= matrix[m - 1][n - 1] & target >= matrix[m - 1][0])
                row = m - 1;

            else return false;
        }
        for (int i=0;i<n;i++){
            if (target==matrix[row][i])
                return true;
        }
        return false;

    }
}
