package DFS;

import com.sun.source.tree.Tree;

public class pathbwRootToLeaf {
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

        TreeNode root = new TreeNode(0);

        root.left = new TreeNode(1);
        root.right = new TreeNode(0);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        root.left.right.left = new TreeNode(0);
        root.left.right.right = new TreeNode(0);

        int[] arr = {0,1,1,0};

        System.out.println(new pathbwRootToLeaf().isValidSequence(root, arr)); // true
    }

    public boolean isValidSequence(TreeNode root , int[] arr) {
        return validated(root , arr , 0);
    }

    boolean validated(TreeNode root , int[] arr, int index) {
        if (root == null) {
            return false;
        }

        if (index >= arr.length-1 && root.val != arr[index]) {  //if the value is not equal then we check for the index , if the index is greater than the arr that means that its out of range
            return false;
        }

        if (root.left == null && root.right == null && index == arr.length-1) { //check for leaf and also to check if it is the last element
            return true;
        }

        return validated(root.left , arr , index + 1) || validated(root.right , arr , index + 1);
    }
}
