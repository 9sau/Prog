class MinPathSumRefined{
    int rMax = 0;
    int cMax = 0;
    static int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
    public static void main(String args[]){
        MinPathSumRefined sum = new MinPathSumRefined();
        System.out.println(sum.minPathSum(grid));
    }

    public int minPathSum(int[][] grid){
        rMax = grid.length;
        cMax = grid[0].length;
        return minPathSumRefined(grid);
    }

    public int minPathSumRefined(int[][] grid){
        for(int row = 0; row<rMax; row++){
            for(int col = 0; col<cMax; col++){
                int left = Integer.MAX_VALUE;
                int up = Integer.MAX_VALUE;
                if(col-1 > -1)
                    left = grid[row][col-1];
                if(row-1 > -1)
                    up = grid[row-1][col];
                if(left == Integer.MAX_VALUE && up == Integer.MAX_VALUE){
                    left = 0;
                    up = 0;
                }
                grid[row][col] = grid[row][col] + Math.min(left, up);
            }
        }
        return (grid[rMax-1][cMax-1]);
    }

    public int getCost(int row, int col){
        if(row>-1 && col > -1 && row<rMax && col<cMax)
            return grid[row][col];
        return Integer.MAX_VALUE;
    }
}