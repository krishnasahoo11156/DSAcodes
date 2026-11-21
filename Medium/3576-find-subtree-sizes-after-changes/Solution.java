import java.util.*;

class Solution {
    List<Integer>[] tree;
    int[] ans;
    int[] last = new int[26];

    public int[] findSubtreeSizes(int[] parent, String s) {

        int n = parent.length;

        tree = new ArrayList[n];
        ans = new int[n];

        Arrays.fill(last, -1);

        for (int i = 0; i < n; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int i = 1; i < n; i++) {
            tree[parent[i]].add(i);
        }

        dfs(0, parent, s);

        return ans;
    }

    private void dfs(int node, int[] parent, String s) {

        int ch = s.charAt(node) - 'a';
        int previous = last[ch];

        last[ch] = node;
        ans[node] = 1;

        for (int child : tree[node]) {
            dfs(child, parent, s);
        }

        int newParent = previous != -1 ? previous : parent[node];

        if (newParent != -1) {
            ans[newParent] += ans[node];
        }

        last[ch] = previous;
    }
}
