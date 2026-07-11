class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s:strs){
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sortedkey = new String(chars);
            if(!map.containsKey(sortedkey)){
                map.put(sortedkey,new ArrayList<>());
            }
            map.get(sortedkey).add(s);
        }
        return new ArrayList<>(map.values());
    }
}