/**
 * Created by liunian on 2017/4/17.
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0)return null;
        return  helper(nums,0,nums.length-1);

    }
    public TreeNode helper(int[] nums, int start,int end){
        if(start>end)return null;
        int mid =start+(end-start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        if (start<end) {
            node.left = helper(nums, start, mid-1);//[0,1]的情况就变成[0,-1],需要处理
            node.right = helper(nums, mid + 1, end);//[0,1]的情况变成[1,1],
        }
        return node;


    }

}
