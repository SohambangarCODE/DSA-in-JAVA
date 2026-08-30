class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        long sum = 0;
        long maxSum = 0;
        for(int i = 0; i<k; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
            sum += nums[i];
        }
        if(hm.size()==k) {
                maxSum = sum;
            }
        for(int j = k; j<nums.length; j++){
                hm.put(nums[j], hm.getOrDefault(nums[j], 0)+1);
            sum += nums[j];
            int outgoing = nums[j - k];
            hm.put(outgoing, hm.get(outgoing) - 1);
            if (hm.get(outgoing) == 0) {
                hm.remove(outgoing);
            }
            sum -= outgoing;
                if (hm.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}