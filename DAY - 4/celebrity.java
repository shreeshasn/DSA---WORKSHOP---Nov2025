import java.util.*;

public class celebrity {

    public static int getCelebrity(int[][] arr) {
        // int celeb=-1;
        for(int i=0; i<arr.length; i++)
        {
            int col_sum=0; int row_sum=0;
            for(int j=0; j<arr.length; j++)
            {
                row_sum = row_sum+arr[i][j];
                col_sum = col_sum+arr[j][i];
            }
            if(row_sum==0 && col_sum== arr.length-1)
                return i;
            else
                continue;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {
            {1, 0, 0, 0, 1},
            {1, 0, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 0, 0, 0, 0}
        };

        int ans = getCelebrity(arr);

        if (ans == -1)
            System.out.println("No celebrity found");
        else
            System.out.println("Celebrity is person " + (ans+1));
    }
}