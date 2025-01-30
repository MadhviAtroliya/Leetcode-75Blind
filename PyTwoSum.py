from typing import List

def twoSum(nums: List[int], target: int) -> List[int]:

        nmap = {}
        for i in range(len(nums)) :
            diff = target - nums[i]
            if diff in nmap:
                return [nmap[diff], i]
            nmap[nums[i]] = i
        return []

nums = [2,7,11,15]
target = 9
output = twoSum(nums, target)
print(output)