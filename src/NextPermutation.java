import java.util.Arrays;

/**
 * Created by liunian on 2017/4/12.
 */
public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index = -1;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                index = i - 1;
                break;
            }

        }
        if (index == -1)
            Arrays.sort(nums);
        else {
            for (int i = nums.length - 1; i > index; i--) {
                if (nums[index] < nums[i]) {
                    int temp = nums[index];
                    nums[index] = nums[i];
                    nums[i] = temp;
                    break;
                }
            }
            //对index后的元素生序
            Arrays.sort(nums, index + 1, nums.length - 1);

        }
    }
}
