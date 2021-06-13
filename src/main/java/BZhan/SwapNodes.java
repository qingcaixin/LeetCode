package BZhan;


import BZhan.ListNode;

import java.awt.*;

/**
 * @author wangxin
 * @data 2021/6/13 10:19
 * 交换链表中中相邻的两个节点
 */
public class SwapNodes {

    public ListNode swapPairs(ListNode head){

         if (head == null || head.next == null){
            return head;
        }
         ListNode res = new ListNode(0);

         res.next = head;
         ListNode cur = res;

         while (cur.next != null && cur.next.next != null){
             ListNode next = head.next;
             ListNode tmp = head.next.next;
             cur.next = next;
             next.next = head;
             head.next =tmp;
             cur = head;
             head = head.next;
         }

         return res.next;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,0};
        ListNode head = new ListNode(nums);
        SwapNodes swapNodes = new SwapNodes();
        ListNode listNode = swapNodes.swapPairs(head);
        System.out.println(listNode);
    }
}
