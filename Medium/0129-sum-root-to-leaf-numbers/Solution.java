class Solution {

    public int sumNumbers(TreeNode root) {

        if (root == null)
            return 0;

        Stack<TreeNode> stack = new Stack<>();
        Stack<Integer> values = new Stack<>();

        stack.push(root);
        values.push(root.val);

        int sum = 0;

        while (!stack.isEmpty()) {

            TreeNode node = stack.pop();
            int current = values.pop();

            if (node.left == null && node.right == null)
                sum += current;

            if (node.right != null) {
                stack.push(node.right);
                values.push(current * 10 + node.right.val);
            }

            if (node.left != null) {
                stack.push(node.left);
                values.push(current * 10 + node.left.val);
            }
        }

        return sum;
    }
}