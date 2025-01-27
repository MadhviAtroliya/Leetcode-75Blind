package main

import "math"

func maxProfit(prices []int) int {
	maxProfit := 0.0
	buy_price := prices[0]
	for i := 1; i < len(prices); i++ {
		if buy_price < prices[i] {
			maxProfit = math.Max(float64(maxProfit), float64(prices[i]-buy_price))
		} else {
		buy_price = prices[i]
		}
	}
	return int(maxProfit)
}