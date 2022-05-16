package cn;

import java.util.HashMap;
import java.util.Set;

/**
 * @author ametrin
 */
public class Del {

    public static void main(String[] args) {
        String str = "1,1,2,3,4,4,5,6";
        String[] ints = str.split(",");
        HashMap<String, String> map = new HashMap<>();
        for (String temp : ints) {
            map.put(temp, temp);
        }
        String result = "";
        for (String key : map.keySet()) {
            result += key + ",";
        }
        System.out.println(result.substring(0, result.length() - 1));
    }
}
