package LeetCode;

public class MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return 0;

        q.offer(root);
        int depth = 1;
        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                TreeNode t = q.poll();
                if(t.left == null && t.right == null) {
                    return depth;
                }
                if(t.left != null) {
                    q.offer(t.left);
                }
                if(t.right != null) {
                    q.offer(t.right);
                }
            }
            depth++;
        }

        return depth;
    }
}
