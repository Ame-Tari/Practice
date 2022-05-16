//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
//
// 有效括号组合需满足：左括号必须以正确的顺序闭合。
// 示例 1：
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 示例 2：
//输入：n = 1
//输出：["()"]
// 提示：
// 1 <= n <= 8
//
// Related Topics 字符串 动态规划 回溯
// 👍 1994 👎 0


package leetcode.editor.cn.doc.p22;
//Java：括号生成

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author huangmingtao
 */
public class P22GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new P22GenerateParentheses().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public List<String> generateParenthesis(int n) {
            Stack<Character> stack= new Stack<>();
            ArrayList<String> strings = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    String ss = "";
                    char temp = ss.charAt(j);
                    while (stack.peek() == '(' && temp == ')' || stack.peek() == ')' && temp == '(') {
                        stack.pop();
                    }
                    if (stack == null) {
                        strings.add(ss);
                    }
                }
            }
            return strings;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
