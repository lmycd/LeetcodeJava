/**
 * Created by liunian on 2017/5/4.
 */
import java.util.ArrayList;
import java.util.List;
public class BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
    return helper(root,ls);
    }
    public List<Integer> helper(TreeNode root, List<Integer> ls){
        if (root==null) return ls;
        ls.add(root.val);
        helper(root.left,ls);
        helper(root.right,ls);

        return ls;
    }
}
