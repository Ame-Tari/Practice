//实现 pow(x, n) ，即计算 x 的 n 次幂函数（即，xn）。
// 示例 1：
//输入：x = 2.00000, n = 10
//输出：1024.00000
// 示例 2：
//输入：x = 2.10000, n = 3
//输出：9.26100
// 示例 3：
//输入：x = 2.00000, n = -2
//输出：0.25000
//解释：2-2 = 1/22 = 1/4 = 0.25
// 提示：
// -100.0 < x < 100.0
// -231 <= n <= 231-1
// -104 <= xn <= 104
// Related Topics 递归 数学
// 👍 724 👎 0


package leetcode.editor.cn.doc.p50;
//Java：Pow(x, n)

/**
 * @author huangmingtao
 */
public class P50PowxN{
    public static void main(String[] args) {
        Solution solution = new P50PowxN().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public double myPow(double x, int n) {
        boolean flag = true;
        x = (x * x);
        if (n > 0) {
            myPow(x, n - 1);
        }
        if (n < 0) {
            myPow(x, n + 1);
        }
        if (n > 0) {
            flag = true;
        }else {
            flag = false;
        }
        if (n == 0 &&flag==true) {
            return x;
        }else {
            return 1 / x;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
