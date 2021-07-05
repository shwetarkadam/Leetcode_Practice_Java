class Solution {
    public int countVowelPermutation(int n) {
        long [][]dp=new long[n][5];
        Arrays.fill(dp[0],1);
      
          int mod=1000_000_007;
        for(int i=1;i<n;i++){
            for(int j=0;j<5;j++){
                if(j==0){//a
                    dp[i][j]=dp[i-1][1];
                } 
                else if(j==1){//e
                    dp[i][j]=dp[i-1][0]+dp[i-1][2];
                }
                else if(j==2){//i
                    dp[i][j]=dp[i-1][0]+dp[i-1][1]+dp[i-1][3]+dp[i-1][4];
                }
                else if(j==3){//o
                    dp[i][j]=dp[i-1][2]+dp[i-1][4];
                }
                else if(j==4){//u
                    dp[i][j]=dp[i-1][0];
                }
                dp[i][j]=dp[i][j]%mod;
            }
        }
       long ans=0;
        for(int p=0;p<5;p++)
            ans+=dp[n-1][p];
        
        return (int)(ans%mod);
    }
}
