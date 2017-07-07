import java.util.ArrayList;

/**
 * Created by liunian on 2017/4/27.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        //重点：row，col的增减在添加完每一行每一列的元素后进行，动态的进行这样下标表现就好好多。。
        List<Integer> rtlist = new ArrayList<Integer>();
        if (matrix.length==0)return rtlist;
        int rowbegin=0,rowend = matrix.length-1,colbegin=0,colend=matrix[0].length-1;

        while (colbegin<=colend&&rowbegin<=rowend){
            //四个方向
            for (int i=colbegin; i<=colend;i++){
                rtlist.add(matrix[rowbegin][i]);

            }
            rowbegin++;
            for (int i=rowbegin;i<=rowend;i++){
                rtlist.add(matrix[i][colend]);
            }
            colend--;
            if(rowbegin <= rowend){
                for (int i=colend;i>=colbegin;i--){
                    rtlist.add(matrix[rowend][i]);
                }}
            rowend--;

            if(colbegin<=colend){
                for (int i= rowend;i>=rowbegin;i--){
                    rtlist.add(matrix[i][colbegin]);
                }
            }
            colbegin++;
        }
        return rtlist;
    }
}