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

package leetcode.editor.cn.doc.p15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Java：三数之和
public class ThreeSum{
    public static void main(String[] args) {
        Solution solution = new ThreeSum().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
        ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<>();
        List<int[]> ints = Arrays.asList(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            int temp = nums[left] + nums[right];
            if (ints.contains(-temp)){
                arrayList.add(nums[left]);
                arrayList.add(nums[right]);
                arrayList.add(ints.indexOf(-temp));
            }
            arrayLists.add(arrayList);
            while (nums[left] == nums[left + 1]) {
                left++;
            }
            while (nums[right] == nums[right - 1]) {
                right--;
            }

        }
        return arrayLists;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}