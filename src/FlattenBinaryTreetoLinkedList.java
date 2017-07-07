import apple.laf.JRSUIUtils;

/**
 * Created by liunian on 2017/5/4.
 */
public class FlattenBinaryTreetoLinkedList {
    private TreeNode prev =null;
    public void flatten(TreeNode root) {
        if (root==null) return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;

    }
}
