import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by liunian on 2017/4/14.
 */
//算法思路：先排序，在比较，打败百分之14的人
public class FindAllDuplicatesinanArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> rt = new ArrayList<>();
        //不是0（n）复杂度，看题目要求，每个元素的大小不超过数组的长度。可以把元素的值和数组的下表帮顶起来，对数组的下表的对应的值加负号做标记
        //反正所有的值都是正的没有影响,
//        Arrays.sort(nums);
//        for (int i=0;i<nums.length-1;i++){
//            if(nums[i]==nums[i+1]){
//                rt.add(nums[i]);
//                i++;
//
//            }
//
//        }
        for (int i=0;i<nums.length;i++){
            if (nums[Math.abs(nums[i])-1]<0)
                rt.add(Math.abs(nums[i]));
            else
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*(-1);
        }
        return rt;


    }
}
