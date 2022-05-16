package cn;

public class Solve {


    public static void main(String[] args) {
        int[] ints = {11, 22, 33, 45, 66, 77, 88, 99, 100};
        int dan = 0;
        int shuang = 0;
        for (int i = 0; i < ints.length; i++) {
            if (i % 2 == 0) {
                shuang += ints[i];
            } else {
                dan += ints[i];
            }
        }

        int a = 2 > 3 ? 1 : 2;


        System.out.println(dan);
        System.out.println(shuang);
    }
}
