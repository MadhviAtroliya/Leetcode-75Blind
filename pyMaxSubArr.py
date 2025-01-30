from typing import List


def maxSubArray(nums: List[int]) -> int:
    currSum = nums[0]
    maxSum = nums[0]
    if len(nums) == 1:
        return nums[0]
    for i in range (1, len(nums)):
        currSum += nums[i] # -2
        currSum = max(currSum, nums[i]) # -2
        maxSum = max(currSum, maxSum) #
    return maxSum


nums = [-2,1,-3,4,-1,2,1,-5,4]
print(maxSubArray(nums))