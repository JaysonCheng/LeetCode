package LeetCode;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> q = new LinkedList<>();

        if(root == null) return res;

        q.offer(root);

        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                innerList.add(temp.val);

                if(temp.left != null) {
                    q.offer(temp.left);
                }
                if(temp.right != null) {
                    q.offer(temp.right);
                }
            }
            res.add(0, innerList);
        }

        return res;
    }
}
