public class max_subarray {

    public int maxSubArray(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            maxSum = (maxSum >= sum) ? maxSum : sum;

            if (sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }

    public void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
}
}