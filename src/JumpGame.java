/**
 * Created by liunian on 2017/4/24.
 */
public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length==1) return true;
        int maxindex = 0;
        for (int i=0;i<nums.length-1;i++){
            if (maxindex<i)
                return false;
            if (i+nums[i]>maxindex)
                maxindex=i+nums[i];
            if (maxindex>=nums.length-1)
                return true;


        }
        if (maxindex>=nums.length-1)
            return true;
            else return false;

//        if (nums.length==1) return true;
//        int sum=0;
//        int temp=0;
//        while (temp<=nums.length){
//            //sum +=nums[temp];
//            if (nums[temp]==0)
//                break;;
//            temp =temp+nums[temp];
//
//
//        }
//        if (temp!=nums.length-1)
//            return false;
//        else return true;

    }
}
