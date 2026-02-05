/* Given a 2x n board and tiles of size 2x1, count the number of ways to tile the given board using the 2x1 tiles. A tile can either be placed horizontally or vertically. 
*/ 
public class TilingProblem{
    public static int tilingProblem(int n ){ // 2x n (floor size)
        // Base Case
        if(n == 0 || n== 1) return 1;
        
      //kaam    
        int verticalTiles = tilingProblem(n-1);   //vertical choice
        int horizontalTiles = tilingProblem(n-2); //horizontal choice

        int totalWays = verticalTiles + horizontalTiles;
        return totalWays;
    }
    public static void main(String[] args){
        System.out.println(tilingProblem(3));
    }
}