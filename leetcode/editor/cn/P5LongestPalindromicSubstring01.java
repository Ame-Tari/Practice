/**
 * 题目Id：5
 * 题目：最长回文子串
 * 日期：2022-07-16 13:09:25
 */
//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母组成 
// 
// Related Topics 字符串 动态规划 👍 5460 👎 0

package cn;

public class P5LongestPalindromicSubstring01 {
    public static void main(String[] args) {
        Solution solution = new P5LongestPalindromicSubstring01().new Solution();
        String result = solution.longestPalindrome("acdbbdaa");
        System.out.println(result);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public String longestPalindrome(String s) {
            int strLen = s.length();
            int left = 0;
            int right = 0;
            int len = 1;
            int maxStart = 0;
            int maxLen = 0;
            if (s.length() == 0) {
                return "";
            }
            String result = "";
            for (int i = 0; i < strLen; i++) {
                left = i - 1;
                right = i + 1;
                while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                    len++;
                    left--;
                }
                while (right < strLen && s.charAt(right) == s.charAt(i)) {
                    len++;
                    right++;
                }
                while (left >= 0 && right < strLen && s.charAt(right) == s.charAt(left)) {
                    len = len + 2;
                    left--;
                    right++;
                }
                if (len > maxLen) {
                    maxLen = len;
                    maxStart = left;
                }
                len = 1;
            }
            return s.substring(maxStart + 1, maxStart + maxLen + 1);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 