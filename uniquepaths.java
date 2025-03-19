public class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }
        
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] += dp[j-1];  
            }
        }
        
        return dp[n-1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.uniquePaths(3, 7));  
        System.out.println(solution.uniquePaths(3, 2));  
    }
}
