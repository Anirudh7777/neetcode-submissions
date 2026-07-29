class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> count = new HashMap<>();
        for(int num : nums){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        List<Integer>[] buckets = new List[nums.length+1];
        for(int i=0;i< buckets.length;i++){
            buckets[i] = new ArrayList<>();
        }
        for(Map.Entry<Integer,Integer> entry : count.entrySet()){
            buckets[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index =0;

        for(int freq=buckets.length-1;freq>=0 && index<k;freq--){
            for(int num : buckets[freq]){
                res[index++] = num;
                if(index==0) break;
            }
            
        } 
        return res;
        
    }
}
