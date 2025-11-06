import java.util.*;

public class celebrity_stack {

    public static int getCelebrity(int[][] arr) {
        // push all person's index to stack
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++)
            stack.push(i);

            // sort out person's who know other people and push who could be a celebrity
        while (stack.size() > 1) {
            int a = stack.pop();
            int b = stack.pop();
            if (arr[a][b] == 1)
                stack.push(b);
            else    
                stack.push(a);
        }
        
        // cehck who is the actual celeb
        int celeb=stack.pop();
        for(int i=0; i<arr.length; i++)
        {
            if( arr[celeb][i] !=1 || arr[i][celeb]!=0)
                return -1;
        }

        return celeb;
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