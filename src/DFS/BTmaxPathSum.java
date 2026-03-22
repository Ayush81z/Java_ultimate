package DFS;

public class BTmaxPathSum {
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

        TreeNode root = new TreeNode(-10);

        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(new BTmaxPathSum().maxPathSum(root)); // 42
    }

    int sum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        findmax(root);
        return sum;
    }

    public int findmax(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = findmax(root.left);
        int right = findmax(root.right);

        // to avoid negative
        left = Math.max(0,left);
        right = Math.max(0,right);

        int pathsum = left + right + root.val;
        sum = Math.max(sum , pathsum);

        return Math.max(left , right) + root.val;
    }
}
