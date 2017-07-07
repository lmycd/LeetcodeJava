/**
 * Created by liunian on 2017/4/17.
 */
public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
        ListNode copy = head;
        ListNode[] node= new ListNode[]{head};
        int count=0;
        while (copy!=null){
            count++;
            copy = copy.next;
        }
        return helper(node,0,count-1);

    }
    public TreeNode helper(ListNode[] node, int start,int end){
        if(start>end)return null;
        int mid = start+(end-start)/2;
        TreeNode left = helper(node, start,mid-1); //直接用node做变量不行，不是饮用，可能在每次函数执行的时候，新创建了变量，不是饮用，可以将它放在数组里，这样的话就是饮用
        //活着将node设为类里的静态全局变量，这样的话每次递归node一直在改变
        //中递归，在每次递归的过程中，改变node的值（因为node是饮用），这样空间复杂度为o（1）
        //
        TreeNode root = new TreeNode(node[0].val);
        root.left = left;
        node[0] = node[0].next;
        TreeNode right = helper(node,mid+1, end);
        root.right = right;
        return root;

    }
}
