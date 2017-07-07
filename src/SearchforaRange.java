import java.util.ArrayList;
import java.util.List;

/**
 * Created by liunian on 2017/4/15.
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {

        //for (int i=0;i<nums.;i++)
        int s = helper(nums, target);
        if (s == nums.length || nums[s] != target)
            return new int[]{-1, -1};
        return new int[]{s, helper(nums, target + 1) - 1};
    }

    public int helper(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (target > nums[mid]) {
                end = mid + 1;
            } else end = mid;
        }
        return start;


    }


}
