class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        int[][] ans = new int[rows * cols][2];
        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> queue = new LinkedList<>();

        queue.offer(new int[]{rCenter, cCenter});
        visited[rCenter][cCenter] = true;

        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        int index = 0;

        while (!queue.isEmpty()) {

            int[] cell = queue.poll();

            ans[index++] = cell;

            for (int[] d : dir) {

                int nr = cell[0] + d[0];
                int nc = cell[1] + d[1];

                if (nr >= 0 && nr < rows &&
                    nc >= 0 && nc < cols &&
                    !visited[nr][nc]) {

                    visited[nr][nc] = true;
                    queue.offer(new int[]{nr, nc});
                }
            }
        }

        return ans;
    }
}