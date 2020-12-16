package LeetCode;

public class RemoveDuplicatesfromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = new ListNode(0);
        ListNode curr = res;
        ListNode currHead = head;

        int currValue = Integer.MIN_VALUE;

        while(currHead != null) {
            int headValue = currHead.val;
            if(headValue != currValue) {
                currValue = headValue;
                curr.next = new ListNode(currValue);
                curr = curr.next;
            }

            currHead = currHead.next;
        }

        return res.next;

        // Two pointer
//        if(head==null)return head;
//
//        ListNode temp=head.next;
//        ListNode prev=head;
//
//
//        while(temp!=null){
//
//            if(temp.val!=prev.val){
//                prev.next=temp;
//                prev=temp;
//            }e
//            temp=temp.next;
//
//        }
//        prev.next=null;
//        return head;
    }
}
