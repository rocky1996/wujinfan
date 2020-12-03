package dongtaiguihua;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 * 背包问题
 */

import java.util.Arrays;

/**
 * 找零钱的硬币数组合
 * Input: amount = 5, coins = [1, 2, 5]
 * 5=5
 * 5=2+2+1
 * 5=2+1+1+1
 * 5=1+1+1+1+1
 */
public class Test1 {

    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        System.out.println(change2(5,coins));
    }


    public static int change2(int target, int[] coins) {
        if (coins == null) {
            return 0;
        }

        int dp[] = new int[target+1];
        dp[0] = 1;

        for(int coin:coins){
            for(int i=coin;i<=target;i++){
                dp[i] = dp[i] + dp[i-coin];
            }
        }

        return dp[target];
    }
}

//dp[1] = dp[1] + dp[0] = dp[1] + 1;
//dp[2] = dp[2] + dp[1];
//dp[3] = dp[3] + dp[2];
//dp[4] = dp[4] + dp[3];
//dp[5] = dp[5] + dp[4];

//dp[2] = dp[2] + dp[0] = dp[2] + 1 + dp[2] + dp[1] + dp[0] + 1;
//dp[3] = dp[3] + dp[1];
//dp[4] = dp[4] + dp[2];
//dp[5] = dp[5] + dp[3];

//dp[5] = dp[5] + dp[0] = dp[5] + 1;
/**
 * 1,1,1,1,1,1
 * 1,1,2,2,2,2
 * 1,1,2,2,2,2
 */
