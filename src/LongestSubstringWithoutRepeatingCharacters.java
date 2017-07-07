import java.util.HashMap;
import java.util.Map;

/**
 * Created by liunian on 2017/4/11.
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int max=0;
        for(int i=0, j=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1); //因为map保存的是所有的字符，所以j比
            }
            map.put(s.charAt(i),i);    //这个方法map保存的是s中的字符，不过是遍历的时候时刻更新字符的最新位置
            max = Math.max(max, i-j+1);  //j和i之间没有任何重复数字，一旦i发现有之间有重复数字，j就移动到重复的位置的后一个字符，任何时候都没有重复数字
        }
        return max;
    }
}
