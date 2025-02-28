class Solution {
    public void sortColors(int[] nums) {
        //better
        int num0 = 0;
        int num1 = 0; 
        int num2 = 0;
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i] == 0){
                num0++;
            }else if(nums[i] == 1){
                num1++;
            }else{
                num2++;
            }
        }
        for(int i = 0 ; i<num0 ; i++){
            nums[i] = 0;
        }
        for(int i = num0 ; i<num0+num1 ; i++){
            nums[i] = 1;
        }
        for(int i = num0+num1 ; i<nums.length ; i++){
            nums[i] = 2;
        }
    }
}