public class NumberOfIslands {
    public int numIslands(char[][] grid) {
        if(grid==null || grid.length==0||grid[0].length==0)
            return 0;

        int v = grid.length;
        int h = grid[0].length;

        int output = 0;
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < h; j++) {
                if (grid[i][j] == '1') {
                    output++;
                    merge(grid, i, j);
                }
            }
        }
        return output;
    }

    public void merge(char[][] grid, int i, int j) {
        int v = grid.length;
        int h = grid[0].length;

        if (i < 0 || i >= v || j < 0 || j >= h || grid[i][j] != '1')
            return;
        grid[i][j] = 'x';

        merge(grid, i - 1, j);
        merge(grid, i + 1, j);
        merge(grid, i, j - 1);
        merge(grid, i, j + 1);
    }

}
