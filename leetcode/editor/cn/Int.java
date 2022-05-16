package cn;

public class Int {


    public static void main(String[] args) {
        //新建数值的值，长度由你给的数据定
        int[] ints = {1, 2, 3, 4, 5};
        //输出长度
        System.out.println("数组长度为：" + ints.length);
        //输出对应坐标为2的值，实际为第三个字符的值
        System.out.println("int[2]的值为：" + ints[2]);
        //直接定义数组的长度
        int[] ints1 = new int[6];
        //foriApi直接输出ints的全部值
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

    }
}
