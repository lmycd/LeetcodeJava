/**
 * Created by liunian on 2017/4/24.
 */

//n牛逼 贪心做对了，因为题目的问题肯定有解的话，那么在相同的步骤里，跳的越远就代表越容易到终点，典型的贪心算法，应该是题目保证有解才可以用贪心
public class JumpGameII {
    public int jump(int[] nums) {
        if (nums.length==1)return 0;
        int bindex=nums[0];
        int sum=0;
        int maxindex=0;
        int index=0;
        for (int i=0;i<nums.length;i++){
            if (i<=bindex)
                maxindex=Math.max(maxindex,nums[i]+i);

            else
                {bindex=maxindex;
                    maxindex=Math.max(maxindex,nums[i]+i);
                sum+=1;
                if (bindex>=nums.length-1)
                    return sum+1;
            }


        }
        return sum+1;

    }

}
