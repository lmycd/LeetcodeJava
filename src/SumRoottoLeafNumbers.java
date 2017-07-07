import java.util.Stack;

/**
 * Created by liunian on 2017/5/5.
 */
public class SumRoottoLeafNumbers {
    static int sum=0;
    Stack<Integer> sta = new Stack<>();
    public int sumNumbers(TreeNode root) {
        if (root==null) return 0;
        sta.push(root.val);
        sumNumbers(root.left);
        sumNumbers(root.right);
        if (root.left==null&&root.right==null) {
            //迭代器的用法：java.util.Itreator  method hasnext();.next

            while (sta.iterator().hasNext() ){
                sum+=sta.iterator().next();
            }
        }
        sta.pop();
        return sum;
    }
}
