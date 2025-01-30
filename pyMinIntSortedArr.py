from typing import List


def findMin(nums: List[int]) -> int:
    minVal = nums[0]
    if (len(nums)==0):
         return nums[0]
    for i in range(1, len(nums)):
        minVal = min(minVal, nums[i])
    return minVal

nums = [4,5,6,7,0,1,2]
print(findMin(nums))