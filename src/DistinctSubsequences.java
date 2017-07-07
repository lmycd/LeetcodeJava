/**
 * Created by liunian on 2017/5/4.
 */
public class DistinctSubsequences {
    public int numDistinct(String s, String t) {
        //一个思路相对而言简单算法，都找两个窜第一个匹配，递归的找，空串久违1
        if (t.length()==0)return 1;
        if (s.length()==0) return (t.length()==0?1:0);
        int count=0;
        for (int i =0;i<s.length();i++){//找s中有几个和t的第一个字符串相同的，有相同的都递归的求一下，递归需要脑回路山路十八弯
            if (s.charAt(i)==t.charAt(0))
                count += numDistinct(s.substring(i+1), t.substring(1));
        }
        return count;

    }


    public int numDistinct1(String s, String t){
        //
        int[][] d = new int[s.length()+1][t.length()+1];//因为0，0代表没有字符串s，t都是空窜，所以数组长度都要加1，数组序号1就代表第一个字符
        d[0][0]=1;
        for (int i=1;i<s.length()+1;i++){
            d[i][0] = 1;
        }

        for (int i=1; i<t.length()+1;i++){
            d[0][i] = 0;
        }

        for (int i=1;i<s.length()+1;i++){
            for (int j=1;j<t.length()+1;j++){
                if (s.charAt(i-1)==t.charAt(j-1))
                    d[i][j]=d[i-1][j] +d[i-1][j-1];
                else d[i][j]=d[i-1][j];

            }
        }
        return d[s.length()+1][t.length()+1];
    }
}
