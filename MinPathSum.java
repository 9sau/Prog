class MinPathSum{
    int rMax = 0;
    int cMax = 0;
    static int grid[][] = {{1,3,1},{1,5,1},{4,2,1}};
    public static void main(String args[]){
        MinPathSum sum = new MinPathSum();
        System.out.println(sum.minPathSum(grid));
    }

    public int minPathSum(int[][] grid){
        rMax = grid.length;
        cMax = grid[0].length;
        return minPathSum(grid, 0, 0); 
    }

    public int minPathSum(int[][] grid, int row, int col){
        if(row < rMax && col < cMax){
            int right = minPathSum(grid, row, col+1);
            int down = minPathSum(grid, row+1, col);
            if(right == Integer.MAX_VALUE && down == Integer.MAX_VALUE){
                down = 0;
                right = 0;
            }
            return grid[row][col] + Math.min(right, down);
        }else
            return Integer.MAX_VALUE;
    }
}