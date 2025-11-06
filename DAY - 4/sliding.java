public class sliding {
    public int[] maxSlidingWindow(int[] nums, int k) {
        // int max=Integer.MIN_VALUE;
        int[] res = new int[nums.length-k+1];
        for(int i=0; i<= nums.length -k; i++)
        {   
            int max=Integer.MIN_VALUE;
            for(int j=i; j <= i+k-1; j++)
            {
                if(nums[j] > max)
                    max = nums[j];
            }
            res[i]=max;
        }
        return res;
    }
    public  void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int[] res = maxSlidingWindow(nums, 8);
        for(int i : res)
            System.out.print(i + " ");
    }
}