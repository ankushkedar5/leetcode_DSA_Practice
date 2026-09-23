class Solution {
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int cols = grid[0].length;
        int landCells = 0;
        int adjacentPairs = 0;

        for(int i=0; i<row; i++) {
            for(int j=0; j<cols; j++) {
                if(grid[i][j] == 1) {
                    landCells++;
                    if(i>0 && grid[i-1][j] == 1) adjacentPairs++;
                    if(j>0 && grid[i][j-1] == 1) adjacentPairs++;
                }
            }
        }
        return landCells * 4 - adjacentPairs * 2;
    }
}