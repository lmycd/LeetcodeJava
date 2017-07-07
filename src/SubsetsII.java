import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liunian on 2017/4/20.
 */
//在同一层循环中，将重复的元素跳过遍历//！！！！！先排序 ac 一次ac
public class SubsetsII {
    static List<Integer> candlt = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> rt = new ArrayList<>();
        Arrays.sort(nums);
        return helper(nums, rt);
    }


    public List<List<Integer>> helper(int[] nums, List<List<Integer>> rt) {
        rt.add(new ArrayList<>(candlt));
        for (int i = 0; i < nums.length; i++) {
            if (i==0||(i >= 1 && nums[i] != nums[i - 1])) {
                candlt.add(nums[i]);
                //rt.add(candlt.clone());//出错方法可以用生成器直接生成

                helper(Arrays.copyOfRange(nums, i + 1, nums.length), rt);
                candlt.remove(candlt.size() - 1);
            }

        }
        return rt;
    }
}