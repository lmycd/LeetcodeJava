/**
 * Created by liunian on 2017/4/12.
 */
public class SearchinRotatedSortedArray {
//    public int search(int[] nums, int target) {
//        for (int i=0;i<nums.length;i++){
//            if(target==nums[i])
//                return i;
//        }
//        return -1;
//    }
    //虽然说数组被转换了，但是还是有顺序的，找规律
public int search(int[] nums, int target) {
    if (nums.length==0)
        return -1;
    //定义start
    int start=0,end=nums.length-1;
    while(start+1<end){// 停止条件不能end与start相差1，因为这样会可能结束不了
        int mid=start+(end-start)/2;
        if(nums[mid]==target)
            return mid;
        else if (nums[mid]>nums[start]){
            if (target>=nums[start]&target<=nums[mid])//等于号必须，因为没等与的号的话会把边界的值排除
                end=mid;
            else start=mid;
        }
        else {
            if (target>=nums[mid]&target<=nums[end])
                start=mid;
            else end=mid;
        }


    }
    if (nums[start]==target)
        return start;
    if (nums[end] ==target)
        return end;
    return -1;

}

}
