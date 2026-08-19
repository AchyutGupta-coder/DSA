class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] positive = new int[n/2];
        int[] negative = new int[n/2];
        int p =0;
        int ng = 0;
        for(int i=0;i<n;i++){
            if(nums[i]>=0)
        {
            positive[p] = nums[i];
            p++;
        }
        else{
            negative[ng] = nums[i];
            ng++;
        }
        }
        int[] result = new int[n];
        int index=0;
        for(int i=0;i<n/2;i++){
            result[index] = positive[i];
            index++;
            result[index] = negative[i];
            index++;

        }
        return result;
    }
}