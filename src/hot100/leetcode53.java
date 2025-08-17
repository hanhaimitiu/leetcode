package hot100;

public class leetcode53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];
        /*
        设dp[i]为以i为结尾的最大连续字串的值
        dp[i] = dp[i-1]+nums[i] dp[i-1]>0
              = nums[i]         dp[i-1]<=0
         */
        dp[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i]=Math.max(dp[i-1]+nums[i],nums[i]);
        }

        return dp[nums.length - 1];
    }
}
