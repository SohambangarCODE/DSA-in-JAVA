class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hm.containsKey(nums[i])){
                int li = hm.get(nums[i]);
                if((i-li)<=k){
                    return true;
                }
            }
            hm.put(nums[i], i);
        }
        return false;
    }
}