/**
 * Created by liunian on 2017/4/24.
 */
public class RemoveDuplicatesfromSortedArrayII {
    //比较巧妙，count设定是第四个数，这样的话不满足条件就-1，很好
    public int removeDuplicates(int[] nums) {
        if (nums.length==0||nums==null)
            return 0;
        int count=0;
        for (int n: nums){
            nums[count]=n;
            count++;
            if (count<3){
                continue;
            }
            if (nums[count-1]==nums[count-2]&&nums[count-1]==nums[count-3])
                count--;

        }
        return count;

    }

    public int sd(int[] nums){
        if (nums.length==0||nums==null)
            return 0;
        int count=0;
        for (int n:nums){
            nums[count]=n;
            if (count>=2){
                if (nums[count]==nums[count-1]&&nums[count]==nums[count-2])
                    continue;
            }
            count++;

        }
        return count;
    }
}
