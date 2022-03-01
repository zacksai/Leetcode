package Top100Liked;

/**
 * Class to solve #104 Maximum Depth of Binary Tree
 *
 * Given the root of a binary tree, return its maximum depth.
 *
 * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: root = [3,9,20,null,null,15,7]
 * Output: 3
 * Example 2:
 *
 * Input: root = [1,null,2]
 * Output: 2
 *
 *
 * Constraints:
 *
 * The number of nodes in the tree is in the range [0, 104].
 * -100 <= Node.val <= 100
 */
public class LC104MaximumDepthOfBinaryTree {

    public class TreeNode {
        int val;
        LC617MergeTwoBinaryTrees.TreeNode left;
        LC617MergeTwoBinaryTrees.TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, LC617MergeTwoBinaryTrees.TreeNode left, LC617MergeTwoBinaryTrees.TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(LC617MergeTwoBinaryTrees.TreeNode root) {

        // Do not increment depth when node is null
        if (root == null) {
            return 0;
        }

        // Visit left and right node and set a variable equal to its max depth until above condition catches bottom^
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);

        // Add 1 and return larger of the two maxes
        return 1 + Math.max(l, r);



    }

}
