package dongtaiguihua.zuichanggonggongzixulie;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * 最长公共子序列
 */
public class Test1 {

    public static void main(String[] args) {
        String text1 = "sea";
        String text2 = "eat";
        System.out.println(longestCommonSubsequence(text1,text2));
    }

    public static int longestCommonSubsequence(String text1, String text2) {

        int n1 = text1.length();
        int n2 = text2.length();

        int[][] dp = new int[n1+1][n2+1];
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                if(text1.charAt(i-1) == text2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else {
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n1][n2];
    }


    public static void print(int[][] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(j == array[0].length-1){
                    System.out.print(array[i][j]);
                }else {
                    System.out.print(array[i][j] + ",");
                }
            }
            System.out.println();
        }
    }
}
