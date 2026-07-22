class Solution {

    Integer[] dp;

    public int numTrees(int n) {

        dp=new Integer[n+1];

        return solve(n);
    }

    int solve(int n){

        if(n<=1)
            return 1;

        if(dp[n]!=null)
            return dp[n];

        int ans=0;

        for(int root=1;root<=n;root++){

            ans+=solve(root-1)*solve(n-root);

        }

        return dp[n]=ans;
    }
}