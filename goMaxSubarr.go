package main

func maxSubArray(nums []int) int {
    currSum := nums[0]
	maxsum := nums[0]

	for i:=0;i<len(nums);i++ {
		currSum += nums[i]
		currSum = max(currSum, nums[i])
		maxsum = max(currSum, maxsum)
	}
	return maxsum
}