
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // 1. Build the frequency map
        HashMap<Integer, Integer> count = new HashMap<>();
        for (int num : nums) {
            // Using the handy getOrDefault trick!
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        // 2. Put the entries (both Key and Value together) into a List
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(count.entrySet());

        // 3. Sort the list by Value (Frequency) in DESCENDING order
        // This is the exact pattern we learned for sorting HashMaps by value!
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        // 4. Create the final integer array of size 'k' to return
        int[] result = new int[k];
        
        // 5. Grab the top 'k' items from our sorted list
        for (int i = 0; i < k; i++) {
            // .get(i) gets the Map.Entry block. 
            // .getKey() extracts the actual number we were counting.
            result[i] = entryList.get(i).getKey(); 
        }

        return result;
    }
}