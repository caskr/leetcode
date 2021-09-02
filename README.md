# leetcode
记录刷题之旅

------

| #     | title                                                        | solution                                                     | idea                                                         |
| ----- | ------------------------------------------------------------ | ------------------------------------------------------------ | ------------------------------------------------------------ |
| 105   | [从前序与中序遍历序列构造二叉树](https://leetcode-cn.com/leetbook/read/bytedance-c01/eiqm25/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_105.java) | 哈希表；前序第一位为根，递归                                 |
| 172   | [阶乘后的零](https://leetcode-cn.com/leetbook/read/bytedance-c01/ei6om6/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_172.java) | 零由5得到，n/5为有1个5的个数，再/5为有2个5的个数，以此类推   |
| ZJ_3  | [古生物血缘远近判定](https://leetcode-cn.com/leetbook/read/bytedance-c01/eug83v/) | [java](https://github.com/caskr/leetcode/blob/main/java/ZJ_3.java) | [编辑距离问题](https://www.jianshu.com/p/a617d20162cf)（递归法时间不过，用动态规划） |
| 85    | [最大矩形](https://leetcode-cn.com/leetbook/read/bytedance-c01/eik5p2/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_85.java) | [单调栈法](https://blog.csdn.net/ailinyingai/article/details/100534563) |
| 1739  | [放置盒子](https://leetcode-cn.com/leetbook/read/bytedance-c01/eikfoc/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_1739.java) | [数学+贪心](https://blog.csdn.net/chenbb1989/article/details/113133278) 1\3\6\10\15\... n*(n+1)/2 [二分法也很好](https://blog.csdn.net/qq_43765535/article/details/113720980) |
| 1675  | [数组的最小偏移量](https://leetcode-cn.com/leetbook/read/bytedance-c01/eigcei/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_1675.java) | 奇数元素先*2变大（因为后续可以通过偶数/2变小），与偶数元素入[TreeSet](https://blog.csdn.net/a1439775520/article/details/95373610)，求当前最大距离。再对Set中最大的元素进行处理，若是偶数则/2，求当前最大距离；若是奇数则算法结束。 |
| 753   | [破解保险箱](https://leetcode-cn.com/leetbook/read/bytedance-c01/eiz49e/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_753.java) | [贪心算法](https://leetcode-cn.com/problems/cracking-the-safe/solution/yi-bu-yi-bu-tui-dao-chu-0ms-jie-fa-tan-xin-gou-zao/)+[dfs](https://leetcode-cn.com/problems/cracking-the-safe/solution/po-jie-bao-xian-xiang-by-leetcode-solution/) 找欧拉图路径（没太懂） |
| 22    | [括号生成](https://leetcode-cn.com/leetbook/read/bytedance-c01/eisgxg/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_22.java) | dfs+回溯 即尝试加左括号和加右括号至不满足条件                |
| 638   | [大礼包](https://leetcode-cn.com/leetbook/read/bytedance-c01/ei1ujj/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_638.java) | 贪心+dfs 遍历 对于可用的大礼包用或不用的情况 求最小金额      |
| NC78  | [反转链表](https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=190&tqId=35203&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_78.java) | 三个指针，pre,cur,next                                       |
| NC4   | [判断链表是否有环](https://www.nowcoder.com/practice/650474f313294468a4ded3ce0f7898b9?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_4.java) | 快慢指针or逐个删除                                           |
| NC45  | [实现二叉树先序、中序和后序遍历](https://www.nowcoder.com/practice/a9fec6c46a684ad5a3abd4e365a9d362?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_45.java) | 普通做法，加了非递归做法。先序出栈栈顶元素，按右左顺序入栈；中序不断入栈左节点，设为空，至无左节点则出栈中间节点，若有右节点则入栈，以此类推；后序与先序相反，出栈栈顶元素，按左右顺序入栈，最后所有结果反过来即是后续结果。（注：非递归需要中序在最后，因为会将左节点设空，改变了） |
| NC119 | [最小的K个数](https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=190&tqId=35976&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_119.java) | 快排思想法，先分类，若前者=k，则返回前k个即是结果/系统函数排序/优先队列法/先排序前K 再跟第k个比较，若小则插入 |
| NC15  | [求二叉树的层序遍历](https://www.nowcoder.com/practice/04a5560e43e24e9db4595865dc9c63a3?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_15.java) | 队列（要注意计算队列元素个数的时机）                         |
| NC88  | [寻找第K大](https://www.nowcoder.com/practice/e016ad9b7f0b45048c58a9f27ba618bf?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_88.java) | 快排：以一个数为基准，小的放前面，大的放后面，递归           |
| NC61  | [两数之和](https://www.nowcoder.com/practice/20ef0972485e41019e39543e8e895b7f?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_61.java) | 一次遍历+哈希表                                              |
| NC33  | [合并有序链表](https://www.nowcoder.com/practice/a479a3f0c4554867b35356e0d57cf03d?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_33.java) | 归并排序                                                     |
| NC68  | [跳台阶](https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_68.java) | 递归or斐波拉契数列思想：f3=f2+f1,f4=f3+f2 即只需要三个变量存储fn,fn-1,fn-2即可 |
| NC3   | [链表中环的入口节点](https://www.nowcoder.com/practice/6e630519bf86480296d0f1c868d425ad?tpId=196&tqId=37047&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-total%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_3.java) | 快慢指针or自我删除（类似NC4）                                |
| NC5   | [二叉树根节点到叶子节点的所有路径和](https://www.nowcoder.com/practice/185a87cd29eb42049132aed873273e83?tpId=194&tqId=35773&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-client%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_5.java) | dfs+递归                                                     |
| NC60  | [判断一棵二叉树是否为搜索二叉树和完全二叉树](https://www.nowcoder.com/practice/f31fc6d3caf24e7f8b4deb5cd9b5fa97?tpId=194&tqId=38022&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-client%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_60.java) | 完全二叉树：bfs连续；搜索二叉树，左边比右边小                |
| NC36  | [在两个长度相等的排序数组中找到上中位数](https://www.nowcoder.com/practice/6fbe70f3a51d44fa9395cfc49694404f?tpId=194&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-client%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_36.java) | 二分法                                                       |
| NC76  | [用两个栈实现队列](https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=117&tqId=37774&companyId=134&rp=1&ru=%2Fcompany%2Fhome%2Fcode%2F134&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_76.java) | pop的时候从栈1弹出到栈2，pop栈2                              |
| NC19  | [子数组的最大累加和问题](https://www.nowcoder.com/practice/554aa508dd5d4fefbf0f86e5fe953abd?tpId=117&tqId=37797&companyId=134&rp=1&ru=%2Fcompany%2Fhome%2Fcode%2F134&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_19.java) | 若加起来等于负数则不再叠加                                   |
| NC50  | [链表中的节点每k个一组反转](https://www.nowcoder.com/practice/b49c3dc907814e9bbfa8437c251b028e?tpId=117&tqId=37746&companyId=134&rp=1&ru=%2Fcompany%2Fhome%2Fcode%2F134&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_50.java) | 每k个反转后返回新头部，旧头部递归指向下一个k部分的新头部。   |
| NC52  | [括号序列](https://www.nowcoder.com/practice/37548e94a270412c8b9fb85643c8ccc2?tpId=117&tqId=37749&companyId=134&rp=1&ru=%2Fcompany%2Fhome%2Fcode%2F134&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_52.java) | 入栈，可以入栈自身，也可以入栈对应的括号                     |
| NC1   | [大数加法](https://www.nowcoder.com/practice/11ae12e8c6fe48f883cad618c2e81475?tpId=117&tqId=37842&companyId=134&rp=1&ru=%2Fcompany%2Fhome%2Fcode%2F134&qru=%2Fta%2Fjob-code-high%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_1.java) | 一位一位加，记录进位，StringBuilder一位位添加，反转          |
| NC41  | [找到字符串的最长无重复字符子串](https://www.nowcoder.com/practice/b56799ebfd684fb394bd315e89324fb4?tpId=190&tqId=35220&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_41.java) | HashMap                                                      |
| NC22  | [合并两个有序的数组](https://www.nowcoder.com/practice/89865d4375634fc484f3a24b7fe65665?tpId=190&tqId=35185&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_22.java) | 归并排序                                                     |
| NC53  | [删除链表的倒数第n个节点](https://www.nowcoder.com/practice/f95dcdafbde44b22a6d741baf71653f6?tpId=190&tqId=35195&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_53.java) | 快慢指针                                                     |
| NC14  | [二叉树的之字形层序遍历](https://www.nowcoder.com/practice/47e1687126fa461e8a3aff8632aa5559?tpId=190&tqId=35183&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_14.java) | reverse的时候加在链表的方向不同                              |
| NC127 | [最长公共子串](https://www.nowcoder.com/practice/f33f5adc55f444baa0e0ca87ad8a6aac?tpId=190&tqId=36002&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_14.java) | 动规 str1[i-1]!=str2[j-1]时dp=0                              |
| NC66  | [两个链表的第一个公共节点](https://www.nowcoder.com/practice/6ab1d9a29e88450685099d45c9e31e46?tpId=190&tqId=35197&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_66.java) | a+b==b+a 两个链表相连，若相等则为公共节点                    |
| NC40  | [两个链表生成相加链表](https://www.nowcoder.com/practice/c56f6c70fb3f4849bc56e33ff2a50b6b?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_40.java) | 反转链表+大数相加                                            |
| NC102 | [在二叉树中找到两个节点的最近公共祖先](https://www.nowcoder.com/practice/e0cc33a83afe4530bcec46eba3325116?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_102.java) | 递归，如果节点都在右边或都在左边，则返回右边或左边的递归值，若分别在左右两边，则返回当前节点值。 |
| NC103 | [反转字符串](https://www.nowcoder.com/practice/c3a6afee325e472386a1c4eb1ef987f3?tpId=190&tqId=35226&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_103.java) | 前面和最后的调转                                             |
| NC38  | [螺旋矩阵](https://www.nowcoder.com/practice/7edf70f2d29c4b599693dc3aaeea1d31?tpId=190&tqId=35349&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_38.java) | 没啥特别的，一层层来                                         |
| NC65  | [斐波那契数列](https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_65.java) | 递归or不递归                                                 |
| NC13  | [二叉树的最大深度](https://www.nowcoder.com/practice/8a2b2bf6c19b4f23a9bdb9b233eefa73?tpId=188&tqId=38323&rp=1&ru=%2Factivity%2Foj&qru=%2Fta%2Fjob-code-high-week%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_13.java) | 递归                                                         |
| 1838  | [最高频元素的频数](https://leetcode-cn.com/problems/frequency-of-the-most-frequent-element/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_1838.java) | 滑动窗口（从前向后依次滑动 初始操作步数加上差距 若大于递增步数 右移左界限 减去差距步数  画图即清晰）+//暴力解法 |
| 1877  | [数组中最大数对和的最小值](https://leetcode-cn.com/problems/minimize-maximum-pair-sum-in-array/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_1877.java) | 证明最小情况是首尾相加时，所以排序，遍历即可                 |
| 138   | [复制带随机指针的链表](https://leetcode-cn.com/problems/copy-list-with-random-pointer/) | [java](https://github.com/caskr/leetcode/blob/main/java/LC_138.java) | 哈希，第一种第一次赋值val和next 第二种第一次赋值val（代码更简洁） |
| NC93  | [设计LRU缓存结构](https://www.nowcoder.com/practice/e3769a5f49894d49b871c09cadd13a61?tpId=117&tags=&title=&difficulty=0&judgeStatus=0&rp=1) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_93.java) | 利用哈希表和双向链表 可以实现get setO(1)的复杂度             |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |

