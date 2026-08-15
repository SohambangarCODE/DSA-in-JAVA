class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int n: nums){
            hm.put(n, hm.getOrDefault(n, 0)+1);
        }
        
        for(int key: hm.keySet()){
            int freq = hm.get(key);
            if(bucket[freq]==null){
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }
        int[] res = new int[k];
        int counter = 0;
        for(int pos = bucket.length-1; pos>=0 && counter<k; pos--){
            if(bucket[pos] != null){
                for(int integer: bucket[pos]){
                    res[counter++] = integer;
                }
            }
        }
        return res;   
    }
}