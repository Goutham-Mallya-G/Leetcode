class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        Map<Integer,Integer> map = new TreeMap<>();

        for(int[] num : nums1){
            map.put(num[0] , num[1]);
        }

        for(int[] num : nums2){
            map.put(num[0], map.getOrDefault(num[0],0) + num[1]);
        }

        int size = map.size();
        int[][] ans = new int[size] [2];
        int index = 0;
        for(Map.Entry<Integer , Integer> entry : map.entrySet()){
            ans[index][0] = entry.getKey();
            ans[index][1] = entry.getValue();
            index++;
        }
        return ans;
    }
}