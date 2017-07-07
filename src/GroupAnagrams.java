import java.util.*;

/**
 * Created by liunian on 2017/4/13.
 */
public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        //这么做，不好弄，越弄越复杂
//        for (int i=0;i<strs.length;i++){
//            for (int j=i+1;j<strs.length;j++){
//                if (isAnagram(strs[i],strs[j]))
        //思路：建立hashmap，value部分就可以是List<string>，key部分是正序的string，掉渣天的hashmap，python的dict是不可以这么做的匹配运用数组排序，
        if (strs==null)return new List<List<String>>();
        List<List<String>> rt = new ArrayList<List<String>>();
        Map<String,List<String>> map = new HashMap<String,List<String>>();
        for (String str:strs){
            char[] s = str.toCharArray();
            Arrays.sort(s);
            String keystr =String.valueOf(s);
            if (!map.containsKey(keystr)){
                map.put(keystr, new ArrayList<String>());
            }
            map.get(keystr).add(str);
        }
        return new ArrayList<List<String>>(map.values());//可以直接用构造器，输入是个collection
//        for (List<String> s:map.values()){
//            rt.add(s);
//
//        }
//        return rt;
    }
}
