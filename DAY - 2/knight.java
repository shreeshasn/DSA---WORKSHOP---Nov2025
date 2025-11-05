public class knight{

    public boolean checkValidGrid(int[][] grid) {

        if(grid[0][0]!=0) return false;

        return helper(0,0,grid);
    }

    public static boolean helper(int r,int c,int[][] grid){

        if(grid[r][c]==(grid.length*grid.length)-1){
            return true;
        }

        int[][] dir={{-2,-1},{-2,+1},{+2,-1},{+2,+1},{-1,+2},{+1,+2},{-1,-2},{+1,-2}};
        for(int[] co:dir){
            if(isValid(r+co[0],c+co[1],grid) && grid[r+co[0]][c+co[1]]==grid[r][c]+1 ){
                grid[r][c]=-1;
                return helper(r+co[0],c+co[1],grid);
            }
        }

        return false;
    }

    public static boolean isValid(int r,int c,int[][] grid){
        return r>=0 && r<grid.length && c>=0 && c<grid.length;
    }

    public static void main(String[] args) {
        
    }

}