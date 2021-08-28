/*给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 0 且不重
复的三元组。
注意：答案中不可以包含重复的三元组。
示例 1：
输入：nums = [-1,0,1,2,-1,-4]
输出：[[-1,-1,2],[-1,0,1]]
示例 2：
输入：nums = []
输出：[]
示例 3：
输入：nums = [0]
输出：[]
提示：
0 <= nums.length <= 3000
-10⁵ <= nums[i] <= 10⁵
 Related Topics 数组 双指针 排序 👍 3677 👎 0*/

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：三数之和
public class P15ThreeSum {
    public static void main(String[] args) {
        Solution solution = new P15ThreeSum().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public List<ArrayList<Integer>> threeSum(int[] nums) {
        List<ArrayList<Integer>> arrayLists = new ArrayList<>();
        //排序
        Arrays.sort(nums);
        //双指针
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                return arrayLists;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int curr = nums[i];
            int left = i+1;
            int right = nums.length - 1;
            while (left < right) {
                int tmp = curr + nums[left] + nums[right];
                if (tmp == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(curr);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    arrayLists.add(list);
                    while (left < right && nums[left + 1] == nums[left]) {
                        ++left;
                    }
                    while (left < right && nums[right - 1] == nums[left]) {
                        --right;
                    }
                    ++left;
                    --right;

                } else if (tmp < 0) {
                    ++left;
                } else {
                    --right;
                }
            }

        }

        return arrayLists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
