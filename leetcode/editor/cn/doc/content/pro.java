package cn.doc.content;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * @author ametrin
 */
public class pro {
    public static void main(String[] args) {
        int[][] ints = {{1, 4, 5}, {1, 3, 4}, {2, 6}};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                list.add(ints[i][j]);
            }
        }

        Collections.sort(list);
        System.out.println(list);


    }

}
