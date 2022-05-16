package cn;

import java.util.Arrays;
import java.util.Scanner;

public class P111 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int teamTotal = in.nextInt();
        int[] teamArr = new int[teamTotal];
        for (int i = 0; i < teamTotal; i++) {
            teamArr[i] = in.nextInt();
        }

        Arrays.sort(teamArr);        int power = in.nextInt();
        int count = initCount(teamArr, power);

        count = calTeamCount(teamTotal, teamArr, power, count);

        System.out.println(count);
    }

    private static int initCount(int[] nums, int power) {
        int count = 0;
        for (int num : nums) {
            if (num >= power) {
                count++;
            }
        }
        return count;
    }

    private static int calTeamCount(int teamTotal, int[] teamArr, int power, int count) {
        int left = 0;
        int right = teamTotal - count - 1;
        while (left < right) {
            if (teamArr[left] + teamArr[right] >= power) {
                count++;
                left++;
                right--;
                continue;
            }
            left++;
        }
        return count;
    }
}
