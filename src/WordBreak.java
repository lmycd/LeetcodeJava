/**
 * Created by liunian on 2017/5/17.
 */
import java.util.*;
public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] d = new boolean[s.length()+1];
        d[0]=false;
        for (int i = 1 ; i < s.length()+1; i++){
            for (int j = 0 ; j < i ; j++){
                if (d[j]&&wordDict.contains(s.substring(j,i)))
                {
                    d[i] = true;
                    break;
                }
            }
        }
        return d[s.length()];
     }
}
