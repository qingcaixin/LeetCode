package BZhan;

/**
 * @author wangxin
 * @data 2021/6/14 10:38
 * 合并两个链表 递归法
 */
public class MergeTwoListsRecursion {

    public ListNode mergeTwoListsRecursion(ListNode l1, ListNode l2){

        if (l1 == null || l2 == null){
            return l1 == null ? l2 : l1;
        }
        if (l1.val <= l2.val){
            l1.next = mergeTwoListsRecursion(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoListsRecursion(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1,3,8,9};
        int[] nums2 = {2,6,7,8};

        ListNode l1 = new ListNode(nums1);
        ListNode l2 = new ListNode(nums2);

        MergeTwoListsRecursion aa = new MergeTwoListsRecursion();

        ListNode result = aa.mergeTwoListsRecursion(l1, l2);

        System.out.println(result);
    }
}
