package DFS;

import com.sun.source.tree.Tree;

public class sumRootToLeaf_lc129 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(9);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(1);

        System.out.println(new sumRootToLeaf_lc129().sumNumbers(root)); // 1026
    }

    int num = 0;

    public int sumNumbers(TreeNode root) {
        return calculate(root , 0);
    }

    public static int calculate(TreeNode root , int prev) {
        if (root == null ) {
            return 0;
        }

        prev = prev * 10 + root.val;

        if (root.left == null && root.right == null) {
            return prev;
        } //we have to return the value up until that part of the tree

        return calculate(root.left , prev) + calculate(root.right , prev); //left sum + right sum
    }
}
