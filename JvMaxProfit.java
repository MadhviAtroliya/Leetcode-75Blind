package problems;

public class JvMaxProfit {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) { 
        int maxProfit = 0;
        int buy = prices[0];
        for (int i=1;i<prices.length;i++){
           if (buy>prices[i]){
               buy = prices[i];
           } 
           maxProfit = Math.max(maxProfit, prices[i]-buy);
        }
        return maxProfit;
    }
}
