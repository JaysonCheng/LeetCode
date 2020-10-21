package LeetCode;

public class MergeTwoSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        while(currL1 != null || currL2 != null) {
            int p = 0;
            int q = 0;
            if(currL1 != null) {
                p = currL1.val;
            } else {
                p = Integer.MAX_VALUE;
            }

            if(currL2 != null) {
                q = currL2.val;
            } else {
                q = Integer.MAX_VALUE;
            }

            if(p == q) {
                curr.next = new ListNode(p);
                curr = curr.next;
                curr.next = new ListNode(q);
                curr = curr.next;

                if(currL1 != null) currL1 = currL1.next;
                if(currL2 != null) currL2 = currL2.next;
            } else if (p < q) {
                curr.next = new ListNode(p);
                curr = curr.next;
                if(currL1 != null) currL1 = currL1.next;
            } else if (p > q) {
                curr.next = new ListNode(q);
                curr = curr.next;
                if(currL2 != null) currL2 = currL2.next;
            }
        }
        return res.next;
    }
}
