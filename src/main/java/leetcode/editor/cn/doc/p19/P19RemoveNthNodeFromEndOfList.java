//给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
//
// 进阶：你能尝试使用一趟扫描实现吗？
//
//
//
// 示例 1：
//
//
//输入：head = [1,2,3,4,5], n = 2
//输出：[1,2,3,5]
//
//
// 示例 2：
//
//
//输入：head = [1], n = 1
//输出：[]
//
//
// 示例 3：
//
//
//输入：head = [1,2], n = 1
//输出：[1]
//
//
//
//
// 提示：
//
//
// 链表中结点的数目为 sz
// 1 <= sz <= 30
// 0 <= Node.val <= 100
// 1 <= n <= sz
//
// Related Topics 链表 双指针
// 👍 1528 👎 0


package leetcode.editor.cn.doc.p19;
//Java：删除链表的倒数第 N 个结点

/**
 * @author huangmingtao
 */
public class P19RemoveNthNodeFromEndOfList{
    public static void main(String[] args) {
        Solution solution = new P19RemoveNthNodeFromEndOfList().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
/*        ListNode tail = null;
        ListNode temp = head;
        tail.next = head.next;
        tail = temp;
        while (n != 0) {


            n--;*/
        //必须要有一个链表维持原来的状态
        ListNode temp = head;
        ListNode dummy = new ListNode(0, head);
        int len = 0;
        while (head != null) {
            len++;
            temp.next = head;
            head = head.next;
        }
        int i = len - n;
        for (int j = 0; j < i; j++) {
            temp = temp.next;
        }
        //删除该值



        return null;
        }
        //删除第n个节点


}
//leetcode submit region end(Prohibit modification and deletion)

}
