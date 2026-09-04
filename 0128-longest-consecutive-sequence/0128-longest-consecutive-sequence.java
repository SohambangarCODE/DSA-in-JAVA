class Solution {
    public int longestConsecutive(int[] nums) {
        Set <Integer> set = new HashSet<>();

        for(int i:nums){
            set.add(i);
        }
        int ans = 0;
        for(int i: set){
            if(!set.contains(i-1)){
                int current = i+1;
                while(set.contains(current)){
                    current++;
                }
                int lastEl = current-1;
                ans = Math.max(ans, lastEl-i+1);
            }
        }
        return ans;
    }
}