/*给你一个字符串 s，找到 s 中最长的回文子串。
 示例 1：
输入：s = "babad"
输出："bab"
解释："aba" 同样是符合题意的答案。
 示例 2
输入s = "cbbd"
输出"bb"
 示例 3
输入s = "a"
输出"a"
 示例 4
输入s = "ac"
输出"a"
 提示：
 1 <= s.length <= 1000
 s 仅由数字和英文字母（大写和/或小写）组成

 Related Topics 字符串 动态规划
 👍 4025 👎 0*/


package leetcode.editor.cn;
//Java：最长回文子串

/**
 * @author huangmingtao
 */
public class P5LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution solution = new P5LongestPalindromicSubstring().new Solution();
        String s = solution.longestPalindrome("2313123131314141");
        System.out.println(s);
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    //从每一个位置出发，向两边扩散即可
     class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            int n = s.length();
            int left = 0, right = 0;
            int len = 1;
            int maxStart = 0, maxlen = 0;
            for (int i = 0; i < n; i++) {
                left = i - 1;
                right = i + 1;
                while (left > 0 && s.charAt(left) == s.charAt(i)) {
                    left--;
                    len++;
                }
                while (right < n && s.charAt(right) == s.charAt(i)) {
                    len++;
                    right++;
                }
                while (left >= 0 && right < n && s.charAt(left) == s.charAt(right)) {
                    len += 2;
                    left--;
                    right++;
                }
                if (len > maxlen) {
                    maxlen = len;
                    maxStart = left;
                }
                len = 1;
            }
            return s.substring(maxStart + 1, maxStart + maxlen + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
