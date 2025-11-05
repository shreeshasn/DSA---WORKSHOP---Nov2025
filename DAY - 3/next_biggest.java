import java.util.*;

public class next_biggest {
    public  int[] nextGreaterElement(int[] arr) {
        int[] ans = new int[arr.length];
        int[] stack = new int[arr.length];
        int top = -1;
        stack[++top] = arr[arr.length-1];
        ans[arr.length-1] = -1;

        for(int i=arr.length-2; i>=0; i--)
        {
           if( stack[top] > arr[i]) 
           {
                ans[i] = stack[top];
                stack[++top] = arr[i];
           }
           else
           {
                int dummy = -1;
                while(top>-1)
                {
                    if( stack[top] > arr[i] )
                    {
                        dummy = stack[top];
                    }
                    else
                    {
                        top--;
                    }
                }
                ans[i] = dummy;
                stack[++top] = arr[i];
           }
        }
        return ans;
        }

    public  void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] ans = nextGreaterElement(arr);

        System.out.print("Next Greater Elements: ");
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}