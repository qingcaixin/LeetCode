package BZhan;

/**
 * @author wangxin
 * @data 2021/6/14 10:23
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1,ListNode l2){

        ListNode res = new ListNode();
        ListNode cur = res;
        while (l1 != null && l2 != null){
            if (l1.val <= l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 == null){
            cur.next = l2;
        }
        if (l2 == null){
            cur.next = l1;
        }

        return res.next;
    }

    public static void main(String[] args) {

        int[] nums1 = {1,3,8,9};
        int[] nums2 = {2,6,7,8};

        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        MergeTwoLists aa = new MergeTwoLists();

        ListNode result = aa.mergeTwoLists(l1, l2);

        System.out.println(result);

    }
}
