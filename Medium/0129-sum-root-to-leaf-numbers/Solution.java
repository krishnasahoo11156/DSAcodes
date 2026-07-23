class Solution {

    public int sumNumbers(TreeNode root) {

        if (root == null)
            return 0;

        Queue<TreeNode> nodes = new LinkedList<>();
        Queue<Integer> nums = new LinkedList<>();

        nodes.offer(root);
        nums.offer(root.val);

        int sum = 0;

        while (!nodes.isEmpty()) {

            TreeNode node = nodes.poll();
            int current = nums.poll();

            if (node.left == null && node.right == null)
                sum += current;

            if (node.left != null) {
                nodes.offer(node.left);
                nums.offer(current * 10 + node.left.val);
            }

            if (node.right != null) {
                nodes.offer(node.right);
                nums.offer(current * 10 + node.right.val);
            }
        }

        return sum;
    }
}