import java.util.HashMap;
import java.util.Map;

/**
 * Created by liunian on 2017/4/13.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> map = new HashMap<Character,Integer>();
        if (s.length()!=t.length()) return false;
        for (int i=0;i<s.length();i++){
            if (map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);}
            else map.put(s.charAt(i),1);
        }
        for (int i=0;i<t.length();i++){
            if (map.containsKey(t.charAt(i))){
                if (map.get(t.charAt(i))==0){
                    return false;
                }

                map.put(t.charAt(i),map.get(t.charAt(i)-1));
            }
            else return false;
        }



        return true;
       //不知道怎么用反正以后有啥函数看不懂就直接查api collection = map.values()
    }
}
