public class Solution{

    public static int countStrings(int n){
        
        int [][][] dp = new int[n+1][2][3];
        for(int i = 0; i<n+1;i++){
            for(int j = 0; j<2; j++){
                for(int k = 0; k<3; k++){
                    dp[i][j][k] = -1;
                }
            }
        }

       return countstr(dp,n, 1,2);
        
        
    }
    public static int countstr(int [][][] dp,int n, int bCount, int cCount){
        
        if(bCount <0 || cCount <0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        if(bCount == 0 && cCount == 0){
            return 1;
        }
        
        if(dp[n][bCount][cCount] != -1){
            return dp[n][bCount][cCount]%1000000007;
        }
        int res = countstr(dp, n-1,bCount, cCount)%1000000007;
        res+=countstr(dp, n-1, bCount-1, cCount)%1000000007;
        res+=countstr(dp, n-1, bCount, cCount-1)%1000000007;
        
        return (dp[n][bCount][cCount] = res%1000000007);
    }
}

