package problems;

public class JvCoinChange {
    public static void main(String[] args) {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coins, amount));
    }

    static int coinChange(int[] coins, int amount){
        int[][] dp = new int[coins.length][amount+1];
        for(int i=1;i<=amount;i++){
            for(int j=0;j<coins.length;j++){
                if(i==j) dp[j][i]=0;
                else if(i%dp[j][i]==0) dp[j][i] = i%dp[j][i];
                else{
                    
                }
                System.out.println("dp["+j+"]["+i+"] = "+dp[j][i]);
            }  
        }
        return 0;
    }
}
