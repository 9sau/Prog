class UniquePaths1 {
    static int table[][];

    public static void main(String arg[]){
        UniquePaths1 paths = new UniquePaths1();
        System.out.print(paths.uniquePaths(7,3));
    }
    public int uniquePaths(int m, int n) {
        if(m == 0 || n==0)
            return 0;
        
        table = new int[m][n];
        table[0][0] = 1;
        return uniquePaths(m,n,0,0);
    }
    
    public void print(int[][] table){
        for (int row = 0; row<table.length; row++){
            for(int col = 0; col<table[row].length; col++)
                System.out.print(table[row][col]+"  ");
            System.out.println();
        }
    }
    public int uniquePaths(int m , int n, int row, int col){
        if(row < m && col < n){
            if(row !=0 && col != 00 && table[row][col] != 0)
                return table[row][col];

            if(row == m-1 && col == n-1){
                return 1;
            }
            
            table[row][col] = uniquePaths(m,n,row,col+1) + uniquePaths(m,n,row+1,col);
            return table[row][col];
        }
        else
            return 0;
    }
}