public class MultidimensionalArray {
    public static void main(String[] args){
        int[][] grid ={
                {0,1,2},
                {3,4,5},
                {6,7,8}
        };
        //System.out.println(grid[2][2]);

        for(int row=0;row<grid.length;row++){
            for(int col=0;col<grid.length;col++){
                System.out.print(grid[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
