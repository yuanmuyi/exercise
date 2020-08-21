package algorithm;

import java.util.List;

/**
 * 合并两个有序链表
 * @author yuanyang
 * @date 2020/5/20 11:07
 */
public class MergeTwoSortList {




    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(2);

        ListNode listNode2 = new ListNode(3);
        listNode2.next = new ListNode(4);

        mergeTwoLists(listNode1,listNode2);
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        if(l1.val < l2.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }
}
