/**
 * Created by liunian on 2017/5/4.
 */
public class TrappingRainWater {
        //关键搞清楚，对于一个bar的水的量是如何计算的，其实就是这个bar左右两边最大高度的较小值 是上限，知道这个就好办
    public int trap(int[] height) {
        int sum=0;
        int[] rt = new int[height.length];
        int lefttemp=0,righttemp=0;
        //从左向右遍历找个最大值
        for (int i =1 ; i<height.length ; i++ ){
            if (height[i-1]>lefttemp)
                lefttemp=height[i-1];
                rt[i]=lefttemp;
        }

        // 从右往左找个最大的
        for (int i =height.length-2;i>=1;i--){
            if (height[i+1]>righttemp){
                righttemp=height[i+1];
            }
            rt[i]=Math.min(righttemp,rt[i]);
            sum+=Math.max(rt[i]-height[i],0);
        }
        return sum;
    }
}
