/**
 * Created by liunian on 2017/4/13.
 */
//看的别人的找的思路：先把矩阵专治然后按行兑换，结束
public class RotateImage {
    public void rotate(int[][] matrix) {
        int n =matrix.length;
        int temp=0;
        //选中上三角或者下三角区域
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        //按行以中间的数交换两边；
        for (int i=0;i<n;i++){
            for (int j=0;j<n/2;j++){
                temp =matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;

            }
        }

    }
}
