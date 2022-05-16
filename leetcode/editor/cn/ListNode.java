package cn;


import java.util.ArrayList;
import java.util.Arrays;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {
    }
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

//java 超简单的思路，完全扩展合并两个有序链表的思路，用一个数组来存k个链表的指针，每次找到一个最小的值所对应的指针，然后新建一个列表挂上去，之后向后移动即可
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(ListNode one : lists){
            while(one != null){
                list.add(one.val);
                one = one.next;
            }
        }
        Integer[] all = list.toArray(new Integer[list.size()]);
        Arrays.sort(all);
        ListNode head = new ListNode();
        ListNode first = head;
        for(Integer i : all){
            first.next = new ListNode(i);
            first = first.next;
        }

        return head.next;
    }
}