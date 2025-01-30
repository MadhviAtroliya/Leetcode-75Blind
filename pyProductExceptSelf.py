from typing import List


def productExceptSelf(nums: List[int]) -> List[int]:
    prodArr = [1] * len(nums)
    prodArr[0]=1
    for i in range(1, len(nums)):
        prodArr[i] = prodArr[i-1] * nums[i-1]

    prodSuff = 1
    for i in range(len(nums)-2, -1, -1):
        prodSuff *= nums[i+1]
        prodArr[i] *= prodSuff

    return prodArr

nums = [1,2,3,4]
print(productExceptSelf(nums))