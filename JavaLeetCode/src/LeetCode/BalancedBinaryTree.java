package LeetCode;

public class BalancedBinaryTree {

    // O(n) runtime solution
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        int res = getTreeHeight(root);
        if(res >= 0) return true;
        return false;
    }

    public int getTreeHeight(TreeNode node) {
        if(node == null) return 0;
        int left = getTreeHeight(node.left);
        int right = getTreeHeight(node.right);
        if(Math.abs(left - right) > 1 || left == -1 || right == -1) return -1;
        return Math.max(left, right) + 1;
    }

    // O(n^2) solution
//    public boolean isBalanced(TreeNode root) {
//        if(root == null) return true;
//
//        return (Math.abs(getTreeHeight(root.left) - getTreeHeight(root.right)) <= 1)
//                && isBalanced(root.left)
//                && isBalanced(root.right);
//    }
//
//    public int getTreeHeight(TreeNode node) {
//        if(node == null) return 0;
//        int left = getTreeHeight(node.left);
//        int right = getTreeHeight(node.right);
//        return Math.max(left, right) + 1;
//    }
}
