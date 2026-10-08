class Solution:
    def missingNumber(self, nums: list[int]) -> int:
        n = len(nums)
        actual_sum = sum(nums)
        total = n*(n+1)//2
        j = total-actual_sum
        return j 