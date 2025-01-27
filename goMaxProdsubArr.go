package main

func maxProduct(nums []int) int {
	//-2,3,-4
	//currProd := nums[0]
	leftProd := 1
	rightProd := 1
	maxProd := nums[0]

	for i:=0;i<len(nums);i++ {
		if leftProd==0 {leftProd = 1}
		if rightProd==0 {rightProd = 1}
		leftProd *= nums[i]
		rightProd *= nums[len(nums)-1-i]
		maxProd = max(maxProd, max(leftProd, rightProd))
	}
	return maxProd
}
