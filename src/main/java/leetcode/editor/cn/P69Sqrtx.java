//实现 int sqrt(int x) 函数。
// 计算并返回 x 的平方根，其中 x 是非负整数。
// 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
// 示例 1:
// 输入: 4
//输出: 2
// 示例 2:
// 输入: 8
//输出: 2
//说明: 8 的平方根是 2.82842...,
//     由于返回类型是整数，小数部分将被舍去。
// Related Topics 数学 二分查找
// 👍 757 👎 0


package leetcode.editor.cn;
//Java：x 的平方根

/**
 * @author huangmingtao
 */
public class P69Sqrtx{
    public static void main(String[] args) {
        Solution solution = new P69Sqrtx().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int mySqrt(int x) {
        int left = 0;
        int right = x;
        for (int i = 0; i < x; i++) {
            int temp = (left + right) / 2;
            if (temp * temp > x && (temp - 1) * (temp - 1) < x) {
                left--;
            } else {
                right++;
            }
        }
        return 0;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
