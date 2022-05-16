/**
 * 题目Id：283
 * 题目：移动零
 * 日期：2022-05-17 17:21:35
 */
//给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。 
//
// 请注意 ，必须在不复制数组的情况下原地对数组进行操作。 
//
// 
//
// 示例 1: 
//
// 
//输入: nums = [0,1,0,3,12]
//输出: [1,3,12,0,0]
// 
//
// 示例 2: 
//
// 
//输入: nums = [0]
//输出: [0] 
//
// 
//
// 提示: 
// 
//
// 
// 1 <= nums.length <= 10⁴ 
// -2³¹ <= nums[i] <= 2³¹ - 1 
// 
//
// 
//
// 进阶：你能尽量减少完成的操作次数吗？ 
// Related Topics 数组 双指针 👍 1592 👎 0

package cn;

/**
 * @author ametrin
 */
public class P283MoveZeroes {
    public static void main(String[] args) {
        Solution solution = new P283MoveZeroes().new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int[] moveZeroes(int[] nums) {
            int[] solve = new int[nums.length];
            int left = 0;
            for (int i = 0; i < nums.length; i++)  {
                if (nums[i] != 0) {
                    solve[left] = nums[i];
                    left++;
                }
            }
            return solve;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

} 