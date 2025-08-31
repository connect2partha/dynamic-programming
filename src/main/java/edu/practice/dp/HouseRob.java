package edu.practice.dp;

// Find the max amount can be robbed, provided no adjacent houses are robbed
public class HouseRob {
    public static void main(String[] args) {
        HouseRob obj = new HouseRob();
        int[] amounts = new int[]{4, 3, 1, 2, 5, 6, 1, 8, 7};
        System.out.println(HouseRob.rob(amounts));
    }

    private static int rob(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-2] + nums[i], dp[i-1]);
        }
        return dp[dp.length-1];
    }
}
