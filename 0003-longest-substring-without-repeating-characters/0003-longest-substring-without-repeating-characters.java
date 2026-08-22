class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int left = 0;
        int lenMax = 0;

        for(int right = 0; right< s.length(); right++){
            char c = s.charAt(right);

            if(hm.containsKey(c) && hm.get(c) >= left){
                left = hm.get(c)+1;
            }
            hm.put(c, right);
            lenMax = Math.max(lenMax, right-left + 1);
            
        }
        return lenMax;
    }
}