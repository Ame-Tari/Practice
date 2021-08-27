### 解题思路
此处撰写解题思路

### 代码

```java
class Solution {
    public int myAtoi(String s) {
        //nStart表示数字开始，has_sign表示否有负号
        boolean nStart = false, has_sign = false;
        s = s.trim();//去除首尾的空格
        if(s.equals("")) {
            return 0;
        }
        //如果第一个字符不是数字则返回0，此处过滤的是w123456
        if(!Character.isDigit(s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+') {
            return 0;
        }
        //如果第一个字符是符号，则看下一个字符是否是数字，此处过滤的是+-23这种
        if(s.charAt(0) == '+' || s.charAt(0) == '-') {
            if(s.length() == 1) {
                return 0;
            }else if(!Character.isDigit(s.charAt(1))) {
                return 0;
            }
        }

        long res = 0;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '-' || c == '+') {//如果说是符号
                if (nStart) {//如果数字已经开始连续，标明可以结束了。例如-123+456。
                    break;
                }else if(c == '-') {//如果是负号，则将has_sign改成true
                    has_sign = true;
                }
                continue;//此处如果不加continue的话下面要改成else if ()
            }
            if(Character.isDigit(c)) {//如果它是数字就将他每次*10 + 当前字符-'0',并将nStart改成true
                res = res * 10 + c - '0';
                nStart = true;
                if(res >= Integer.MAX_VALUE && !has_sign) {//如果说符号为+，且数超出整型范围，则返回整型最大值
                    return Integer.MAX_VALUE;
                }else if(has_sign && -res <= Integer.MIN_VALUE ) {//此处一定要先判断是否有负号，然后在判断是否超出整型下届。
                    return Integer.MIN_VALUE;
                }
            }else {//如果它不是数字字符表示可以结束了，例如-1232wdd。
                break;
            }
        }

        if(has_sign) { //有负号将它变成负数
            res = 0- res;
        }

        return (int)res;

    }
}
```