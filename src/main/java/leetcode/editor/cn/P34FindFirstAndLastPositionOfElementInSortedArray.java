//给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
// 如果数组中不存在目标值 target，返回 [-1, -1]。
// 进阶：
// 你可以设计并实现时间复杂度为 O(log n) 的算法解决此问题吗？
// 示例 1：
//输入：nums = [5,7,7,8,8,10], target = 8
//输出：[3,4]
// 示例 2：
//输入：nums = [5,7,7,8,8,10], target = 6
//输出：[-1,-1]
// 示例 3：
//输入：nums = [], target = 0
//输出：[-1,-1]
// 提示：
// 0 <= nums.length <= 105
// -109 <= nums[i] <= 109
// nums 是一个非递减数组
// -109 <= target <= 109
// Related Topics 数组 二分查找
// 👍 1176 👎 0


package leetcode.editor.cn;
//Java：在排序数组中查找元素的第一个和最后一个位置

/**
 * @author huangmingtao
 */
public class P34FindFirstAndLastPositionOfElementInSortedArray{
    public static void main(String[] args) {
        Solution solution = new P34FindFirstAndLastPositionOfElementInSortedArray().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarySearch(nums, target - 1);
        int right = binarySearch(nums, target) - 1;
        if (left <= right && nums[left] == target) {
            return new int[]{left, right};
        }
        return new int[]{-1, -1};
    }


    public int binarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
