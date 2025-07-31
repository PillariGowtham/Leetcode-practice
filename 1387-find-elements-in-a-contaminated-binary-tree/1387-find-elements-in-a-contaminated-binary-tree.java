/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    static HashSet<Integer> h;
    public FindElements(TreeNode root) {
        h=new HashSet<>();
        helper(root);
    }
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        if(root.val==-1){
            root.val=0;
        }
        if(root.left!=null){
            root.left.val=root.val*2+1;
        }
        if(root.right!=null){
            root.right.val=root.val*2+2;
        }
        h.add(root.val);
        helper(root.left);
        helper(root.right);
    }
    public boolean find(int target) {
        if(h.contains(target)){
            return true;
        }
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */