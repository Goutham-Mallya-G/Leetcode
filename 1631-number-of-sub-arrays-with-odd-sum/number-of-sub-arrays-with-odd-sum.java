class Solution {
    public int numOfSubarrays(int[] arr) {
        final int mod =1_000_000_007;
        int sum = 0;
        int even = 1;
        int odd = 0;
        int ans = 0;
        //Iterating all the elements in the array
        for(int i=0 ; i<arr.length ; i++){
            //adding every element one by one
            sum+= arr[i];
            //check if current sum is even
            if(sum%2==0){
                //even + odd gives odd
                ans = (ans + odd);
                //since it is a even add even +1
                even++;
            }
            //it will be odd
            else{
                //odd+even is odd
                ans = (ans + even) ;
                //since it is odd add +2
                odd++;
            }
            ans %= mod;
        }
        return ans;
    }
}