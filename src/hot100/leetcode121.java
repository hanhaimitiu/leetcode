package hot100;

public class leetcode121 {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length==0){
            return 0;
        }
        int n = prices.length;
        int [][]dp = new int[n][2];

        /*
            设dp[i][0]为 第i天的时候，要买或不动   买
            dp[i][1] 第i天前东西已经卖了，dp[i-1][1];第i天要卖dp[i-1][1]+prices[i]           卖

         */
        dp[0][0]=-prices[0];
        dp[0][1]=0;
        for(int i=1;i<n;i++){
            dp[i][0]=Math.max(dp[i-1][0],-prices[i]);
            dp[i][1]=Math.max(dp[i-1][1],prices[i]+dp[i-1][0]);
        }
        return dp[n-1][1];


    }
}
