public class Stock {

    public int maxProfit(int[] prices) {
        int max=0;
        for(int i =0; i<prices.length; i++)
        {
            for(int j=i+1; j<prices.length; j++)
            {
                if(prices[j] > prices[i] && max < (prices[j]-prices[i]) )
                {
                    max = prices[j]-prices[i];
                }
            }
        }
        return max;
    }
    public  void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
}
