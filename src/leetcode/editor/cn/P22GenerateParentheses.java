//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
// 有效括号组合需满足：左括号必须以正确的顺序闭合。
//
//
//
// 示例 1：
//
//
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
//
//
// 示例 2：
//
//
//输入：n = 1
//输出：["()"]
//
//
//
//
// 提示：
//
//
// 1 <= n <= 8
//
// Related Topics 字符串 动态规划 回溯
// 👍 1994 👎 0


package leetcode.editor.cn;
//Java：括号生成

import java.util.ArrayList;
import java.util.List;

public class P22GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new P22GenerateParentheses().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        ArrayList<String> res = new ArrayList<>();
        public List<String> generateParenthesis(int n) {
            if (n <= 0) {
                return res;
            }
            getParenthesis("", n, n);
            return res;
        }

        private void getParenthesis(String str, int left, int right) {
            if (left == 0 && right == 0) {
                res.add(str);
                return;
            }
            if (left == right) {
                getParenthesis(str+"(", left--, right);
            } else if (left < right) {
                if (left > 0) {
                    getParenthesis(str+"(",left--,right);
                }
                getParenthesis(str + ")", left, right--);
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
