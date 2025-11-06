import java.util.*;
public class sliding_window_max_queue {

    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> res = new ArrayList<>();

        // 1st window
        for (int i = 0; i < k; i++) {
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }
            dq.offerLast(i);
        }

        for (int i = k; i < nums.length; i++) {
            res.add(nums[dq.peekFirst()]);

            // remove not part of curr wind
            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
                dq.pollFirst();
            }

            // remove the smaller vals
            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
                dq.pollLast();
            }

            dq.offerLast(i);
        }

        res.add(nums[dq.peekFirst()]);

        // Convert result to array
        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) result[i] = res.get(i);
        return result;
    }

    public  void main(String[] args) {
        // Solution sol = new Solution();
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] ans = maxSlidingWindow(nums, k);
        for (int x : ans) System.out.print(x + " ");
    }
}

