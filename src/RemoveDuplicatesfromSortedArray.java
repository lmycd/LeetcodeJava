/**
 * Created by liunian on 2017/4/11.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        int l=0,r=0,dup=0;
        for (int i=0; i<nums.length;i++){
            if (i==0||nums[i]!=nums[l]) {
                nums[dup]=nums[i];
                dup += 1;
                l=i;

            }

        }
        return dup;

    }
}
