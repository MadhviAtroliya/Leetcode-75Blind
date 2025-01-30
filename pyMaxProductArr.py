from typing import List

def maxProduct(nums: List[int]) -> int:
    leftProd = 1
    rightProd = 1
    maxProd = nums[0]
    for i in range (len(nums)):
        if leftProd==0 :
            leftProd = 1
        if rightProd==0:
            rightProd = 1
        leftProd *= nums[i]
        rightProd *= nums[len(nums)-1-i]
        maxProd = max(maxProd, max(leftProd, rightProd))
    return maxProd


nums = [-3,0,1,-2]
print(maxProduct(nums))

