import java.util.List;

/**
 * Created by liunian on 2017/4/12.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> rtlt = new ArrayList<String>();
        String s ="";
        gen(0,0,n,s,rtlt);
        return rtlt;



    }
    public void gen(int left, int right,int n,String s,List<String> list){
        if (left==n || right==n){
            list.add(s);

        }
        if (left<n){
            gen(left+1,right,n,s+'(',list);//用字符串拼接省去了进站出站的麻烦

        }
        if (right<left){
            gen(left,right+1,n,s+')',list);
        }
    }
}
