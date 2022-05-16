package cn;

import sun.security.pkcs11.wrapper.Constants;

public class P283 {

    public static void main(String[] args) {
        P283.Solution solution = new P283().new Solution();
        solution.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }

    public class Solution {
        public void moveZeroes(int[] ints) {
            if (ints == null || ints.length == 0) {
                return;
            }
            int left = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] != 0) {
                    ints[left] = ints[i];
                    left++;
                }
            }
            for (int i = left; i < ints.length; i++) {
                ints[i] = 0;
            }
        }
    }
}
