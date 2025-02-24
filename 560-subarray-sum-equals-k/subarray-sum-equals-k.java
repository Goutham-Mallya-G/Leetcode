class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int s = 0;
        int count = 0;
        for(int i = 0 ; i < nums.length ; i++){
            s = 0;
            for(int j =i ; j<nums.length ; j++){
                s += nums[j];
                if(s==k){
                    count++;
                }
            }
        }
        return count;
    }
}