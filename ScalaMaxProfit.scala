object ScalaMaxProfit{
     def maxProfit(prices: Array[Int]): Int = {
        var profit = 0;
        var buy_prices = prices(0)
        for(i <- 1 to (prices.length-1)) {
            if(buy_prices>prices(i)){
                buy_prices = prices(i)
            } 
            profit = (profit).max(prices(i)-buy_prices)
        }
        return profit
    }

    def main(args: Array[String]) = {
        var prices = Array(7,1,5,3,6,4)
         println(maxProfit(prices))
    }
}