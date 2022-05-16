package cn;

import java.util.Scanner;

public class no {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        int l = 0;
        for (int i = 0; i < s.length(); i++) {
            String c = String.valueOf(s.charAt(i));
            if (stringBuilder.indexOf(c) >= 0) {
                stringBuilder.delete(0, stringBuilder.indexOf(c) + 1);
            }
            stringBuilder.append(c);
            l = Math.max(stringBuilder.length(), l);
        }
        System.out.println(l);
    }
}
