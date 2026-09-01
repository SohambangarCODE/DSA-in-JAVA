class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for(String word: strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars);
            hm.computeIfAbsent(key, k -> new ArrayList<>()).add(word);
        }
        return new ArrayList<>(hm.values());
    }
}