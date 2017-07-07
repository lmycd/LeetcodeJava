import java.util.*;

/**
 * Created by liunian on 2017/5/10.
 */
public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

//        //ac不过 好像是没考虑重复数字的问题
//            Arrays.sort(nums);
//            int count=1;
//            int max =0;
//            if (nums.length==1)return 0;
//            for (int i = 1;i<nums.length;i++){
//                if (nums[i]-nums[i-1]==1)
//                    count++;
//                else {
//
//                    count=1;
//                }
//                max = Math.max(count,max);
//
//            }
//
//            return max==1?0:max;
        //方法1：建立hash表，只遍历一次
//        Map<Integer,Integer> map = new HashMap<>();
//        int max = 0;
//        for (int i: nums){
//            if (!map.containsKey(i)){
//                int left = map.containsKey(i-1)? map.get(i-1):0;
//                int right = map.containsKey(i+1)? map.get(i+1) : 0;
//                int sum = left +right+1;
//                map.put(i, sum);
//                max = Math.max(max,sum);
//                //最重要的一步，序列中加入了新的元素应该更新每个元素的value/11！！11!!c!!!!!!不是每个元素，只是边缘的元素，序列中间的元素没有用
//                map.put(i-left,sum);
//                map.put(i+right,sum);
//
//
//            }
//            else
//                continue;
//        }
//        return max;

        // 方法2：感觉不像是o（n）复杂度
        Set<Integer> s = new HashSet<>();
        for (int i:nums){
            s.add(i);
        }
        int max =0;
        for (int i: s){
            if (!s.contains(i-1)){
                int k = i+1;
                int count = 1;
                while (s.contains(k)){
                    count++;
                    k++;

                }
                max = Math.max(max, count);
            }
        }
return max;
    }
}
