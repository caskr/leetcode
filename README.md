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
| NC45  | [实现二叉树先序、中序和后序遍历](https://www.nowcoder.com/practice/a9fec6c46a684ad5a3abd4e365a9d362?tpId=190&tags=&title=&diffculty=0&judgeStatus=0&rp=1&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_45.java) | 普通做法                                                     |
| NC119 | [最小的K个数](https://www.nowcoder.com/practice/6a296eb82cf844ca8539b57c23e6e9bf?tpId=190&tqId=35976&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_119.java) | 系统函数排序/先排序前K 再跟第k个比较，若小则插入             |
| NC15  | [求二叉树的层序遍历](https://www.nowcoder.com/practice/04a5560e43e24e9db4595865dc9c63a3?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_15.java) | 队列（要注意计算队列元素个数的时机）                         |
| NC88  | [寻找第K大](https://www.nowcoder.com/practice/e016ad9b7f0b45048c58a9f27ba618bf?tpId=190&rp=1&ru=%2Fta%2Fjob-code-high-rd&qru=%2Fta%2Fjob-code-high-rd%2Fquestion-ranking&tab=answerKey) | [java](https://github.com/caskr/leetcode/blob/main/java/NC_88.java) | 快排：以一个数为基准，小的放前面，大的放后面，递归           |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |
|       |                                                              |                                                              |                                                              |

