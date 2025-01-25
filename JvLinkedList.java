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

    }

    static ListNode reverseList(ListNode head) {
        
        return head;
    }

}
