package LeetCode;

public class SameTree {
    public String preOrderTraversal(TreeNode node, String str) {
        str += node.val;

        if(node.left != null) {
            str = preOrderTraversal(node.left, str);
        } else {
            str += "-1";
        }

        if(node.right != null) {
            str = preOrderTraversal(node.right, str);
        } else {
            str += "-1";
        }

        return str;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        String pTree = "";
        String qTree = "";
        if(p != null) {
            pTree = preOrderTraversal(p, pTree);
        }
        if(q != null) {
            qTree = preOrderTraversal(q, qTree);
        }

        if(pTree.equals(qTree)) return true;

        return false;
    }
}
