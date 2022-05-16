package cn;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class P123 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int n = sc.nextInt();
        Deque<Character> deque = new LinkedList<>();
        int length = num.length();
        for (int i = 0; i < length; ++i) {
            char digit = num.charAt(i);
            while (!deque.isEmpty() && n > 0 && deque.peekLast() > digit) {
                deque.pollLast();
                n--;
            }
            deque.offerLast(digit);
        }

        for (int i = 0; i < n; ++i) {
            deque.pollLast();
        }

        StringBuilder strBuilder = new StringBuilder();
        boolean firstZero = true;
        while (!deque.isEmpty()) {
            char digit = deque.pollFirst();
            if (firstZero && digit == '0') {
                continue;
            }
            firstZero = false;
            strBuilder.append(digit);
        }
        String res = strBuilder.length() == 0 ? "0" : strBuilder.toString();
        System.out.println(res);
    }
}
