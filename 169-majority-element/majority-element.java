class Solution {
    public int majorityElement(int[] nums) {
        //better
        HashMap <Integer , Integer> hash = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            int value = hash.getOrDefault(nums[i] , 0);
            hash.put(nums[i] , value + 1);
        }

        for(Map.Entry<Integer , Integer> key : hash.entrySet()){
            if(key.getValue() > nums.length / 2){
                return key.getKey();
            }
        }
        return -1;
    }
}