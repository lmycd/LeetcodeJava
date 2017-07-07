import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.Object;
/**
 * Created by liunian on 2017/4/20.
 */
public class Subsets {
    static List<Integer> candlt = new ArrayList<>();
   // static  List<List<Integer>> rt = new ArrayList<>(); //准备用两个全局变量的，结果发现 下一个测试案例继承了上一个测试案例的rt 的结果
    //尴尬 应该是因为全局变量的缘故，加上纸雕用了下面的函数，不是重新new 整个类的对象
    // 改进方法，candlt不用改，因为案例结束他为空  ，rt改为函数参数，因为类型是List<List<Integer>>的缘故，所以应该是饮用，所以在递归的时候rt知识一个rt，
    //并且在不断改变，结束；

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> rt = new ArrayList<>();

        return  helper(nums,rt);}
    public List<List<Integer>> helper(int[] nums,  List<List<Integer>> rt){
        rt.add(new ArrayList<>(candlt));
        for (int i=0;i<nums.length;i++){
            candlt.add(nums[i]);
            //rt.add(candlt.clone());//出错方法可以用生成器直接生成

            helper(Arrays.copyOfRange(nums,i+1,nums.length),rt);
            candlt.remove(candlt.size()-1);
        }

        return rt;

    }
}
