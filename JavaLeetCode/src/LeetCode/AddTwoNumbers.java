package LeetCode;

public class AddTwoNumbers {

    class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        ListNode next = null;
        ListNode currL1 = l1;
        ListNode currL2 = l2;
        int carry = 0;

        while(currL1 != null || currL2 != null) {
            int val1 = 0;
            int val2 = 0;
            if(currL1 != null) {
                val1 = currL1.val;
            } else {
                val1 = 0;
            }

            if(currL2 != null) {
                val2 = currL2.val;
            } else {
                val2 = 0;
            }

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if(currL1 != null)  currL1 = currL1.next;

            if(currL2 != null)  currL2 = currL2.next;
        }

        if(carry > 0) {
            curr.next = new ListNode(carry);
        }

        return res.next;
    }
}
