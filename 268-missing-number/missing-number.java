class Solution {
    public int missingNumber(int[] nums) {

        int n= nums.length;
        int expextedsum =n*(n+1)/2;
        int actualsum=Arrays.stream(nums).sum();
        int j = expextedsum-actualsum;
        return j;
        
    }
}