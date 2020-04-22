<?php
/**
 * 寻找旋转排序数组中的最小值
 */
class Solution{
	function findMinFromSortedRotatedArray($nums) {
		$left = 0;
		$right = count($nums) - 1;
		if ($right == 0 || $nums[0] < $nums[$right]) return $nums[0];

		while ($left < $right) {
			$mid = $left + floor(($right - $left) / 2);
			if ($nums[$mid] > $nums[$mid + 1]) return $nums[$mid + 1];
			if ($nums[$mid] < $nums[$mid - 1]) return $nums[$mid];
			if ($nums[0] < $nums[$mid]) {
				$left = $mid + 1;
			} else {
				$right = $mid - 1;
			}
		}
		return null;
	}
}