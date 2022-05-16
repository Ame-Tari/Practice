package cn;

import com.sun.org.apache.bcel.internal.generic.Instruction;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ametrin
 */
public class P66PlusOne {

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.plusOne(new int[]{1, 2, 3, 4});

    }

    static class Solution {
        public int[] plusOne(int[] digits) {
            ArrayList<Integer> list = new ArrayList<>();
            int temp = 0;
            for (int i = digits.length - 1; i >= 0; i--) {
                if ((digits[i] + 1) > 9) {
                    list.add(0);
                    temp = 1;
                    i--;
                }
                while (i >= 0 && (digits[i] + temp) > 9) {
                    list.add(0);
                    i--;
                }
                if (i < 0) {
                    list.add(1);
                    break;
                }
                if (temp == 1 ) {
                    list.add(digits[i] + temp);
                    temp = 0;
                }
                list.add(digits[i] + temp);
            }
            String reverse = new StringBuilder(list.toString()).reverse().toString();
            int[] ints = new int[reverse.length()];
            for (int i = 0; i < reverse.length(); i++) {
                ints[i] = Integer.valueOf(reverse.charAt(i));
            }
            return ints;
        }
    }


}
