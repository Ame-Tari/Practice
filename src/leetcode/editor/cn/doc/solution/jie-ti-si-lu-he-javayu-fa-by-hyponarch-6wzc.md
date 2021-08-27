# 二重循环

使用Java来做这道题的话，我们可以先来温习一下Java的语法
1. 声明一个int数组： `int[] ans = new int[2]`，格式为`类型[] 变量名 = new 类型[大小]`，其中类型表示该数组的类型，大小表示该数组的容量（可以放几个该类型的值）。Java是一种静态、强类型语言，与动态、弱类型的Python不一样，每个变量必须有对应的类型，而且不可改变。这里我们定义了一个int类型的数组，名字叫ans，容量为2，可以存2个int数值，分别为ans[0]和ans[1]。
2. for循环语句：`for(int i = 0; i < n; i++){}`, for循环语句的括号里包含3条语句，第一条`int i = 0`;声明了一个int类型的变量i，并且赋值为0；第二条语句`i < n`表示只有在i < n时才会执行，换言之当i >= n时，循环就停止了；第三条语句`i++`表示该循环每执行一轮，i就会加1.
   然后回到这道题本身，我们要找到2个数，使得它们的和等于target，那么最简单的思路就是遍历所有的数（n个数里选2个），检查它们的和是否等于target

* 

```
class Solution {
    public int[] twoSum(int[] nums, int target) {
        //我们要找到2个数之和等于target
        //即我们需要找到nums[i] + nums[j] == target，并且返回他们的下标，即i和j，其中i != j
        int[] ans = new int[2]; //声明一个大小为2的数组用来保存结果
        //我们通过循环来遍历所有的数字
        int n = nums.length;  //用一个变量len保存nums的长度
        //i为第一个数的下标，nums一共有n个数，所以i的取值范围是[0, n-1]
        for(int i = 0; i < n; i++){
            //j为第二个数的下标。
            for(int j = i + 1; j < n; j++){
                //对于每个数nums[i]，我们验证一遍其他数（nums[j]）跟它的和是否等于target
                //如果满足条件
                if(nums[i] + nums[j] == target){
                    //将下标写入返回值数组里
                    ans[0] = i;
                    ans[1] = j;
                    //返回
                    return ans;
                }
            }
        }
        //默认返回值
        return new int[0];
    }
}
```

# 利用HashMap提升效率

&emsp;&emsp;二重循环的做法虽然简单明了，但是时间效率较差，因为有2层循环，每一层的时间复杂度都是O(n)，总的时间复杂度为O(n)*O(n)=O(n^2)。
&emsp;&emsp;要获得更高的时间效率，我们来分析这个问题，首先第一层循环，我们遍历每个数nums[i]，确定是否有跟它之和等于target的数，这步每个数肯定是必须执行一次的，无法优化。
&emsp;&emsp;第二层循环，我们是在找与nums[i]之和等于target的nums[j]。在二重循环里，我们使用了遍历（也就是线性查找）的方式来确定这个nums[j]，是否存在效率更高的查询方式呢？答案是存在的，我们可以通过哈希表的方式来在O(1)的时间复杂度里找到nums[j]，从而使得总的时间复杂度变成O(n)。
&emsp;&emsp;首先我们来复习一下Java里的HashMap：
1. 首先我们`import java.util.HashMap;` java几乎所有常用的数据结构和工具类都在java.util包下，这个包是java最重要的包之一。
2. HashMap是一个由键值对key-value组成的数据结构，相当于Python里的dict，key是由哈希函数来获取的，读写效率都是O(1)，是提升时间效率最常用的数据结构。
3. 然后是声明：`HashMap<Integer, Integer> map = new HashMap<>();`  首先是类型是HashMap，然后<Integer, Integer>表示key和value的类别都是Integer，Integer是int的包装类，可以近似认为跟int是一样的。变量名叫map。new表示创建对象，创建的是一个HashMap，后面的<>里面按完整写法也是需要写成<Integer, Integer>的，不过现在java有局部类型推断的，可以不写。

* 

```
class Solution1 {
    //已知一个数a，找到等于target-a的另一个数
    //直接遍历数组的话是O(n)，查找哈希表可以优化为O(1)，总的时间复杂度从O(n^2)变为O(n)
    //空间复杂度从O(1)变为O(n)
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        //声明一个HashMap，key和value的类型都是int，变量名叫map。key和value分别记录数值和下标
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++){
            //如果存在nums[j] + nums[i] == target，那么nums[j] = target - nums[i]
            int diff = target - nums[i];
            //如果存在diff，则返回diff和nums[i]的下标
            //HashMap的containsKey方法判断该HashMap中是否存在这个key
            if(map.containsKey(diff)){
                //返回的时候直接创建一个数组，创建数组时可以直接初始化，就不需要填大小了，比如说new int[]{1, 2, 3};
                //此时创建一个大小为2的数组，第一个元素为map.get(diff)也就是map中对应diff的value，第二个元素就是i，也就是2个数的下标
                return new int[]{map.get(diff), i};
            }else   //否则，将nums[i]存入map中
                map.put(nums[i], i);
        }
        return new int[0];
    }
}
```

两数之和是一道非常经典的题目，其他很多复杂的算法题都有这道题的影子。里面包含的一些解题思想可以看做是算法起步的种子，会随着不断练习逐渐萌芽。万事开头难，最开始因为不熟悉语法或者不熟悉算法做不出来都是很正常的事情，看过题解之后，学会了思路，自己再重新做一遍，就能收获很多东西了。
