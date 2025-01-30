from typing import List, Set


def containsDuplicate(self, nums: List[int]) -> bool:
    s = set()
    for i in range(len(nums)):
        if nums[i] in s:
            return True
        s.add(nums[i])
    return False

nums = [1,2,3,1]
print(containsDuplicate(any, nums))