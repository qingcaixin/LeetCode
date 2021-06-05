package TeaTea;

/**
 * @author wangxin
 * @data 2021/6/5 16:00
 */
public class LC206_ReverseLinkedList {
    public ListNode reverseList(ListNode head){

        ListNode prev = null;
        ListNode curr = null;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;

    }


}
