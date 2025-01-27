package main

func twoSum(nums []int, target int) []int {
    //output := []int{2}
	nmap := make(map[int]int)
	for i, val := range nums{
		diff := target - val;

		if index, found := nmap[diff]; found{
			return []int{index, i}
		}
		nmap[val] = i
	}
return []int{}
}

// func main(){
// 	nums := []int{2,7,11,15}
// 	target := 9
// 	print(twoSum(nums, target))
// }