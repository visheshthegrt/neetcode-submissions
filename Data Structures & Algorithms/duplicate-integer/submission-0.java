class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen_nos=new HashSet<>();
        for (int num:nums){
            if(seen_nos.contains(num)) return true;
        
            seen_nos.add(num);
        }
        return false;
    }
}