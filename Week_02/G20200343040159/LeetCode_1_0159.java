/**
*1. 两数之和 <p>
* https://leetcode-cn.com/problems/two-sum/description/
*@author tim@timloong.win 
* 
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(target-nums[i])){
                map.put(nums[i],i);
            }else{
                return new int[]{map.get(target-nums[i]),i};
            }
        }

        return null;
    }
}