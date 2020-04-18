public class MinimumPathSum {
    public int minPathSum(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }
        int[][] g = new int[grid.length][grid[0].length];
        g[0][0] = grid[0][0];

        // get first down and right sum
        for (int i = 1; i < grid.length; i++)
            g[i][0] = g[i - 1][0] + grid[i][0];

        for (int i = 1; i < grid[0].length; i++)
            g[0][i] = g[0][i - 1] + grid[0][i];

        for (int i = 1; i < grid.length; i++)
            for (int j = 1; j < grid[0].length; j++)
                g[i][j] = Math.min(g[i - 1][j], g[i][j - 1]) + grid[i][j];


        return g[grid.length - 1][grid[0].length - 1];
    }
}
