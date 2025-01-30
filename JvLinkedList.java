package problems;

import java.util.LinkedList;

class ListNode {
    int data;
    ListNode next;

    ListNode(int new_data) {
        data = new_data;
        next = null;
    }
}

public class JvLinkedList {
    public static void main(String[] args) {
         LinkedList<Integer> l = new LinkedList<Integer>();
         l.add(1);
         l.add(2);
         l.add(3);
         l.add(4);
         l.add(5);
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reverseList(head);
        System.out.println(l);
    }

    static ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next;
        while (curr != null){
            next = curr.next; 
            prev = next;
            next = curr;
            curr = prev;
        }
        head = prev;
        return head;
    }

}
