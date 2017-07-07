/**
 * Created by liunian on 2017/5/4.
 */
import java.util.ArrayList;
import java.util.List;
public class BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<Integer>();
        if(root==null)return ls;
        return helper(root,ls);
    }


    public List<Integer> helper(TreeNode root, List<Integer> ls){
        if (root==null) return null;
        helper(root.left,ls);
        helper(root.right,ls);
        ls.add(root.val);
        return ls;
    }
}
