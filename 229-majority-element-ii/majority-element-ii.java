import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        int threshold = nums.length / 3;
        
        for (int i : nums) {
            // getOrDefault acts like your if/else to add 1 to the count
            freq.put(i, freq.getOrDefault(i, 0) + 1);
            
            // Check if it's strictly greater than n/3 AND not already in result
            if (freq.get(i) > threshold && !result.contains(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}