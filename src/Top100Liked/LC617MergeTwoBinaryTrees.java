package Top100Liked;

/**
 * Solution class to #617: merge two binary trees (with addition)
 * <p>
 * You are given two binary trees root1 and root2.
 * <p>
 * Imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not. You need to merge the two trees into a new binary tree. The merge rule is that if two nodes overlap, then sum node values up as the new value of the merged node. Otherwise, the NOT null node will be used as the node of the new tree.
 * <p>
 * Return the merged tree.
 * <p>
 * Note: The merging process must start from the root nodes of both trees.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
 * Output: [3,4,5,5,4,null,7]
 * Example 2:
 * <p>
 * Input: root1 = [1], root2 = [1,2]
 * Output: [2,2]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in both trees is in the range [0, 2000].
 * -104 <= Node.val <= 104
 */
public class LC617MergeTwoBinaryTrees {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /**
     * solution method: recursively adds node from each tree
     *
     * @param root1 root of first tree
     * @param root2 root of second tree
     * @return root of combined tree ( in-place, so tree 1 )
     */
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {

        // Recurse through tree until child node is reached

        // If one side is empty, make the combined node in tree 1 equal to the opposite node
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        // If neither side is empty, make the combined node in tree 1 equal to their addition
        root1.val += root2.val;

        // Continue to set its left and right nodes until one or both are null
        root1.left = mergeTrees(root1.left, root2.left);
        root1.right = mergeTrees(root1.right, root2.right);

        // Return the head
        return root1;
    }

}
