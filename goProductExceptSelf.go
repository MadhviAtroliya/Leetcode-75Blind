package main

func productExceptSelf(nums []int) []int {
	prodArr := make([]int, len(nums))
	prodArr[0] = 1;
	for i := 1;i<len(nums); i++{
		prodArr[i] = prodArr[i-1]*nums[i-1];
	}
	prodSuffix := 1
	for i:=len(nums)-2;i>=0;i--{
		prodSuffix *= nums[i+1]
		prodArr[i] *= prodSuffix
	}
	return prodArr
}