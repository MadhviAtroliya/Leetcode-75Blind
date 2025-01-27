package main

func containsDuplicate(nums []int) bool {
    numMap := make(map[int]bool)

	for i:=0;i<len(nums);i++{
		if _, ok := numMap[nums[i]]; ok{
			return true;	
		}
		numMap[nums[i]] = true
	}
	return false
}