from typing import List

class PyMaxProfit:
    def maxProfit(prices: List[int]) -> int:
        profit = 0
        buy_price = prices[0]
        for i in range(1,len(prices)):
            if buy_price>prices[i]:
                    buy_price = prices[i]
            profit = max(profit, prices[i]-buy_price)
        return profit
    
    prices = [7,1,5,3,6,4]
    output = maxProfit(prices)
    print(output)
    
     