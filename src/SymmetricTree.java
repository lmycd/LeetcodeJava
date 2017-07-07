    import java.util.ArrayList;
    import java.util.List;

/**
 * Created by liunian on 2017/5/3.
 */

//很容易想到的方法 但是不知道那里是错的，忧伤，两种遍历方法，存入数组
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return helper(root.left,root.right);

    }
    public boolean helper(TreeNode left, TreeNode right){
        if (left==null || right==null)
            return left==right;
        if (left.val!=right.val)
            return false;
        return helper(left.left,right.right) && helper(left.right, right.left);
    }

    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        List<Integer> rtl = new ArrayList<>();
        List<Integer> rtr = new ArrayList<>();
       return helperleft(root.left,rtl).equals( helperleft(root.right,rtr));

    }
    public List<Integer> helperleft(TreeNode root,List<Integer> rt){
        //List<Integer> rt = new ArrayList();
        if (root==null)return null;
        helperleft(root.left,rt);
        helperleft(root.right,rt);
        rt.add(root.val);
        return rt;

    }

//    public List<Integer> helperright(TreeNode root,List<Integer> rt){
//       // List<Integer> rt = new ArrayList();
//        if (root==null)return null;
//
//        helperright(root.right,rt);
//        helperright(root.left,rt);
//        rt.add(root.val);
//        return rt;
//
//
//    }

}
