import java.util.LinkedList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
//        if (head.val < 1 || head.val > 100)
//            return null;
//        List<Integer> list = new LinkedList<>();
//        if (head.next == null && (head.val < 1 || head.val > 100))
//            return new ListNode(head.val);
//        list.add(head.val);
//        while (head.next != null) {
//            head = head.next;
//            list.add(head.val);
//        }
//        int size = list.size();
//        if (size % 2 == 0) {
//            return new ListNode(size / 2 + 1);
//        } else if (size % 2 != 0) {
//            return new ListNode(size / 2 + 1);
//        } else {
//            return null;
//        }
        // solution 1
//        int length = 1;
//        ListNode current = head;
//        while (current.next != null) {
//            current = current.next;
//            length++;
//        }
//
//        int middle = length / 2;
//        current = head;
//        int i = 0;
//        while (i < middle) {
//            current = current.next;
//            i++;
//        }
//        return current;

        // solution 2
        ListNode slow = head, fast = head;
        // fast is twice as slow
        while (fast != null || fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}