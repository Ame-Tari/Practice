//给定一个不含重复数字的数组 nums ，返回其 所有可能的全排列 。你可以 按任意顺序 返回答案。
// 示例 1：
//输入：nums = [1,2,3]
//输出：[[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
// 示例 2：
//输入：nums = [0,1]
//输出：[[0,1],[1,0]]
// 示例 3：
//输入：nums = [1]
//输出：[[1]]
// 提示：
// 1 <= nums.length <= 6
// -10 <= nums[i] <= 10
// nums 中的所有整数 互不相同
//
// Related Topics 数组 回溯
// 👍 1525 👎 0


package leetcode.editor.cn;
//Java：全排列

import sun.security.util.Length;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author huangmingtao
 */
public class P46Permutations{
    public static void main(String[] args) {
        Solution solution = new P46Permutations().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        //随机取值
        List<List<Integer>> lists = new ArrayList<>();
        int length = nums.length;
        int left = 0;
        int right = length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if (left > 0) {
            int temp = per(nums, left, right);
            arrayList.add(temp);
        }
        if (length == 0) {
            lists.add(arrayList);
        }
        return lists;
    }

    public int per(int[] nums, int left, int right) {
        if (left > 0) {
            return nums[left];
        }else {
            return nums[right];
        }

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
