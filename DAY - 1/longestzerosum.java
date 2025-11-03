import java.util.*;

public class longestzerosum {

    public static int longestZeroSumSubarray(int[] arr) {
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0)
                maxLen = i + 1;

            if (prefixSum.containsKey(sum)) {
                maxLen = Math.max(maxLen, i - prefixSum.get(sum));
            } else {
                prefixSum.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -2, -3, 3};

        System.out.println("Length of longest zero sum subarray: " +
                longestZeroSumSubarray(arr));
    }
}