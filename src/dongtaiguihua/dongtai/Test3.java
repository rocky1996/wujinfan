package dongtaiguihua.dongtai;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
public class Test3 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,3));
    }

    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][0] = 1;
        }
        print(dp);

        for(int j=0;j<n;j++){
            dp[0][j] = 1;
        }
        print(dp);

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }

        print(dp);

        return dp[m-1][n-1];

    }

    private static void print(int[][] dp){
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                System.out.print(dp[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
}
