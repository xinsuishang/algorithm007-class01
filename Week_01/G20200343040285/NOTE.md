学习笔记

1. 两数之和
搜素差。时间，O（n）,空间O(1)

15. 三数之和

夹逼，时间复杂度：O(n^2) ，空间复杂度：O(1)

11. 盛最多水的容器

两边往中间找高的，时间复杂度：O(n) ，空间复杂度：O(1)


21. 合并两个有序链表
比较，尾插，时间复杂度：O(m+n) ，空间复杂度：O(1)

24. 两两交换链表中的节点
保存交环后的下一个，交换对的尾。


26. 删除排序数组中的重复项
两边双指针，相同右边前进一步。否则，复制到i下一个。i，j更新。 时间复杂度：O(n) ，空间复杂度：O(1)

66. 加一
无进位，直接返回。
否则，看进位至哪位，是否补位。时间复杂度：O(n) ，空间复杂度：O(1)

70. 爬楼梯

斐波那契 + 缓存 ，时间复杂度：O(n) ，空间复杂度：O(1)

88. 合并两个有序数组
方法一：合并排序，时间复杂度：O((m+n)log(m+n)) ，空间复杂度：O(1)

方法二：双指针从前往后，时间复杂度：O(m+n) ，空间复杂度：O(m)

方法三：双指针从后往前，时间复杂度：O(m+n) ，空间复杂度：O(1)

141. 环形链表
方法一：set ，时间复杂度：O(n) ，空间复杂度：O(n)

方法二：快慢指针相遇问题，时间复杂度：O(n) ，空间复杂度：O(1)


189. 旋转数组
三次反转，时间复杂度：O(n) ，空间复杂度：O(1)


206. 反转链表
就地逆置法， 时间复杂度：O(n) ，空间复杂度：O(1)


283. 移动零
双指针法，交换，0放到一边。时间复杂度：O(n) ，空间复杂度：O(1)