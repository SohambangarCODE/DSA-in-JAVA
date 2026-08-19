class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        for(int i =0; i<nums.length; i++){
            int req_num =  target - nums[i];
            if(hm.containsKey(req_num)){
                int last_idx = hm.get(req_num);
                return new int[] {last_idx, i};
            }
            hm.put(nums[i], i);
        }
        return null;
    }
}