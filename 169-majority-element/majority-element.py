class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candid = nums[0]
        count = 0 
        for num in nums:
            if candid == num:
                count +=1
            else:
                count -=1
                if count<0:
                    candid= num
                    count=1
        return candid