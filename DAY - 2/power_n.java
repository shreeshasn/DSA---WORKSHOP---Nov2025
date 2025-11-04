import java.util.*;

public class power_n {

    public static void printSubsets(int[] arr, List<Integer> ans, int i) {
        if (i == arr.length) {
            System.out.println(ans);
            return;
        }

        ans.add(arr[i]);
        printSubsets(arr, ans, i + 1);

        ans.remove(ans.size() - 1);
        printSubsets(arr, ans, i + 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<Integer> ans = new ArrayList<>();
        printSubsets(arr, ans, 0);
    }
}
