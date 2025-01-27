package main

func findMin(nums []int) int {
    minVal := nums[0]
	if(len(nums)==1) {return nums[0]}
	for i:=1;i<len(nums);i++ {
		minVal = min(minVal, nums[i])
	}
	return minVal
}