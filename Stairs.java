class Stairs {
    static int lookup[];
    public static void main(String arg[]){
        Stairs stairs = new Stairs();
        System.out.println(stairs.climbStairs(44));
    }
    public int climbStairs(int n) {
        if(n<2)
            return 1;
        lookup = new int[n];
        lookup[0]=1;
        lookup[1]=2;
        return climbStairsUtil(n);        
    }
    public int climbStairsUtil(int n) {
        if(n < 1)
            return 0;
        if(lookup[n-1] != 0)
            return lookup[n-1];
        
        lookup[n-1] = climbStairsUtil(n-1) + climbStairsUtil(n-2);
        return lookup[n-1];
    }
    
}