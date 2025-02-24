class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap <Integer , Integer> hash = new HashMap <>();
        for(int i=0 ; i<nums.length ; i++){
            int num = nums[i];
            int rem = target - num;
            if(hash.containsKey(rem)){
                ans[0] = hash.get(rem);
                ans[1] = i;
            }
            hash.put(nums[i] , i);
        }
        return ans;
    }
}