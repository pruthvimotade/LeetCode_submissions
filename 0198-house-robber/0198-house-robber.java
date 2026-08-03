class Solution {
    int [] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return maxLoot(nums,0);
    }
    public int maxLoot (int[] arr,int i )
    {
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int pick = arr[i] + maxLoot(arr,i+2);
        int skip = maxLoot(arr,i+1);
        int ans = Math.max(pick,skip);
        dp[i] = ans;
        return ans ;
    }
}