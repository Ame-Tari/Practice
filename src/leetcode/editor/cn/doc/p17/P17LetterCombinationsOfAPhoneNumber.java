//给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。答案可以按 任意顺序 返回。
// 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
// 示例 1：
//输入：digits = "23"
//输出：["ad","ae","af","bd","be","bf","cd","ce","cf"]
// 示例 2：
//输入：digits = ""
//输出：[]
// 示例 3：
//输入：digits = "2"
//输出：["a","b","c"]
// 提示：
// 0 <= digits.length <= 4
// digits[i] 是范围 ['2', '9'] 的一个数字。
// Related Topics 哈希表 字符串 回溯
// 👍 1470 👎 0


package leetcode.editor.cn.doc.p17;
//Java：电话号码的字母组合

import java.util.HashMap;
import java.util.List;

/**
 * @author huangmingtao
 */
public class P17LetterCombinationsOfAPhoneNumber{
    public static void main(String[] args) {
        Solution solution = new P17LetterCombinationsOfAPhoneNumber().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<String, String> map = new HashMap<>();


        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
