class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Map: Key is the sorted string ("aet"), Value is the list of anagrams (["eat", "tea", "ate"])
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Create the "Key" by sorting the string's characters
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedKey = new String(chars);

            // 2. If we haven't seen this sorted key before, put it in the map with a blank list
            if (!map.containsKey(sortedKey)) {
                map.put(sortedKey, new ArrayList<>());
            }

            // 3. Add the original string (e.g., "tea") to the list belonging to its sorted key ("aet")
            map.get(sortedKey).add(s);
        }

        // 4. We don't care about the keys anymore, just return all the grouped lists!
        return new ArrayList<>(map.values());
    }
}