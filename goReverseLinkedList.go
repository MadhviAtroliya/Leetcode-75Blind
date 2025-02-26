package main

type ListNode struct {
	Val int
	Next *ListNode
} 

func reverseList(head *ListNode) *ListNode {
	var curr = head
	var prev *ListNode
	var next *ListNode

	for curr!=nil {
		next = curr.Next
		curr.Next = prev
		prev = curr
		curr = next
	}
	head = prev

	return head



}