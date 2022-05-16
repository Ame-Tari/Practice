//给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。
//
// 在「杨辉三角」中，每个数是它左上方和右上方的数的和。
//
// 示例 1:
//输入: numRows = 5
//输出:
// [[1]
// ,[1,1]
// ,[1,2,1]
// ,[1,3,3,1]
// ,[1,4,6,4,1]]
// 示例 2:
//输入: numRows = 1
//输出: [[1]]
// 提示:
// 1 <= numRows <= 30
//
// Related Topics 数组 动态规划
// 👍 563 👎 0


package leetcode.editor.cn;
//Java：杨辉三角

import java.util.ArrayList;
import java.util.List;

public class P118PascalsTriangle{
    public static void main(String[] args) {
        Solution solution = new P118PascalsTriangle().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    class Solution {
        public List<List<Integer>> generate(int numRows) {
            int[][] res = {{1,0}};
            List<List<Integer>> arrayLists = new ArrayList<>();
            for (int i = 0; i < numRows-1; i++) {
                List<Integer> integers = new ArrayList<>();
                for (int j = 0; j < i + 1; j++) {
                    res[i][j] = res[i - 1][j] + res[i][j];
                    integers.add(res[i][j]);
                }
                arrayLists.add(integers);
            }
            return arrayLists;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
