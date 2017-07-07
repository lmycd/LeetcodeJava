/**
 * Created by liunian on 2017/5/3.
 */
public class SingleNumberII {

    public int singleNumber(int[] nums) {
        int[] base = new int[32];
        int res=0;
        for (int i=0;i<32;i++){

            for (int j=0;j<nums.length;j++){
                base[i] += (nums[j]>>i)&1;// 右移i位代表此时到了第几位，位从0开始，然后判断是否为1，是1就累加，这边用与1判断
            }
            res |=(base[i]%3)<<i;
        }
        return res;
    }
}
