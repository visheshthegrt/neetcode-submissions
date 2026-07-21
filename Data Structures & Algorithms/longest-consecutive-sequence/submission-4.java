public class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hnums = new HashSet<>(nums.length);
        for(int i:nums){
                hnums.add(i);
        }
        int longeststreak=0;
        
        for(int i:hnums){
            if(!hnums.contains(i-1)){
                int currstreak=1;
                while(hnums.contains(i+1)){
                    currstreak+=1;
                    i++;
                }
                longeststreak=Math.max(currstreak,longeststreak);
            }
            
            
            
            
        }
        return longeststreak;
    }
}
