package week2.homework;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class LeetCode_01_0227 {
    public int[] twoSum(int[] nums, int target) {
        return method2(nums, target);
    }

    /**
     * 暴力法
     *
     * @param nums
     * @param target
     * @return
     */
    private int[] method1(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }

    /**
     * hash
     *
     * @param nums
     * @param target
     * @return
     */
    private int[] method2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length - 1; i++) {
            int v = nums[i];
            if (map.containsKey(target - v)) {
                return new int[]{i, map.get(target - v)};
            }
            map.put(v, i);
        }
        return null;
    }
}
