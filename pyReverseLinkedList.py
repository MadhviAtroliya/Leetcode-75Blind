from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
    curr = head
    prev = None
    next = None
    while(curr != None):
        next = curr.next
        prev = next
        next = curr
        curr = prev
    head = prev
    return head

def hasCycle(self, head: Optional[ListNode]) -> bool:
    if head == None and head.next == None:
        return False
    slow = head
    fast = head
    if fast.next == None and fast.next == None:
        slow = slow.next
        fast = fast.next.next
    if fast == slow:
        return True
    return False