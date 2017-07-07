/**
 * Created by liunian on 2017/4/27.
 */
public class SpiralMatrixII {
    public int[][] generateMatrix(int n) {
//和之前的题目，差不多，先建立n的平房大小的返回数组，按上一题的顺序遍历，塞入数据
        int[][] matrix = new int[n][n];

        //int[] num = new int[(int)Math.pow(n,2)];
        int number=1;

        if (n==0)return matrix;
        int rowbegin=0,rowend = matrix.length-1,colbegin=0,colend=matrix[0].length-1;

        while (colbegin<=colend&&rowbegin<=rowend){
            //四个方向
            for (int i=colbegin; i<=colend;i++){
                matrix[rowbegin][i]=number++;

            }
            rowbegin++;
            for (int i=rowbegin;i<=rowend;i++){
                matrix[i][colend]=number++;
            }
            colend--;
            if(rowbegin <= rowend){
                for (int i=colend;i>=colbegin;i--){
                    matrix[rowend][i]=number++;
                }}
            rowend--;

            if(colbegin<=colend){
                for (int i= rowend;i>=rowbegin;i--){
                    matrix[i][colbegin]=number++;
                }
            }
            colbegin++;
        }
        return matrix;
    }
}
