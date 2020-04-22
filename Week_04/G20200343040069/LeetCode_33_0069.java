class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1, mid =0;

        while(left < right){
            mid = (left + right) /2;

            if (nums[mid] >= nums[0] && (target > nums[mid] || target < nums[0])){
                left = mid + 1;

            } else if(target > nums[mid] && target < nums[0]){
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left == right && nums[left] == target? left : -1;
    }
}