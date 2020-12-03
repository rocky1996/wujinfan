package dongtaiguihua.dongtai;

/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-11-15
 */
/**
 * Created by IntelliJ IDEA.
 * User: wujinfan
 * Date: 2020-09-04
 */
public class Test2 {

//    public static void main(String[] args) {
//        int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
//        System.out.println(minPathSum(grid));
//    }
//    /**
//     *  [[1,3,1],
//     *  [1,5,1],
//     *  [4,2,1]]
//     */
//    public static int minPathSum(int[][] grid){
//        if(grid.length == 0 || grid[0].length == 0){
//            return 0;
//        }
//
//        int m = grid.length;
//        int n = grid[0].length;
//        int[] dp = new int[n];
//
//        for(int i=0;i<m;i++){
//            for(int j=0;j<n;j++){
//                if(j == 0){
//                    // 只能从上侧走到该位置
//                    dp[j] = dp[j];
//                } else if(i == 0){
//                    //只能从左侧走到该位置
//                    dp[j] = dp[j - 1];
//                } else {
//                    dp[j] = Math.min(dp[j - 1], dp[j]);
//                }
//                dp[j] += grid[i][j];
//                System.out.println(dp[j]);
//            }
//        }
////        6,7,8
////        for(int i=0;i<dp.length;i++){
////            System.out.println(dp[i]);
////        }
//        return dp[n - 1];
//    }
//
//    public static int uniquePaths(int m, int n) {
//        int[] dp = new int[n];
//        Arrays.fill(dp, 1);
//        for (int i = 1; i < m; i++) {
//            for (int j = 1; j < n; j++) {
//                dp[j] = dp[j] + dp[j - 1];
//            }
//        }
//        return dp[n - 1];
//    }

//    static int m = 3;
//    static int n = 3;
//    static int sum = 0;
//    static int[][] state = {{1,3,1},{1,5,1},{4,2,1}};
//    static int[][] matrix = new int[m][n];
//
//    /**
//     * 1，3，5，9
//     * 2，1，3，4
//     * 5，2，6，7
//     * 6，8，4，3
//     */
//
//    public static void dynamic_1(){
//        for(int i = 0; i < m; i++){
//            sum = sum + state[i][0];
//            matrix[i][0] = sum;
//        }
//        printtttt(matrix);
//
//        System.out.println("--------");
//
//        sum = 0;
//        for(int j = 0; j < n; j++){
//            sum = sum + state[0][j];
//            matrix[0][j] = sum;
//        }
//
//        printtttt(matrix);
//        System.out.println("--------");
////
//        for(int i = 1; i < m; i++){
//            for(int j = 1; j < n; j++){
//                matrix[i][j] = state[i][j] + Math.min(matrix[i - 1][j], matrix[i][j - 1]);
//            }
//        }
//
//        printtttt(matrix);
//        System.out.println(matrix[m-1][n-1]);
////
////        for(int i = 0; i < m; i++){
////            for(int j = 0; j < n; j++){
////                System.out.print(matrix[i][j] + " ");
////            }
////            System.out.println();
////        }
//    }
//
//    public static void main(String[] argv){
//        dynamic_1();
//    }
//
//    public static void printtttt(int[][] arr){
//        int m = arr.length;
//        int n = arr[0].length;
//        for(int i = 0;i < m;i++){
//            for(int j = 0;j < n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }

    /**
     //     * 1，3，5，9
     //     * 2，1，3，4
     //     * 5，2，6，7
     //     * 6，8，4，3
     //     */
    public static void main(String[] args) {
        int[][] array = {{1, 3, 5, 9}, {2, 1, 3, 4}, {5, 2, 6, 7}, {6, 8, 4, 3}};

        System.out.println("************");
        print(array);
        System.out.println("************");
        System.out.println();

        System.out.println(function2(array));
    }

    private static int function(int[][] array){
        int m = array.length;
        int n = array[0].length;
        int[][] resultArray = new int[m][n];
        int sumx = 0;
        int sumy = 0;

        for(int i=0;i<m;i++){
            sumx += array[i][0];
            resultArray[i][0] = sumx;
        }

        print(resultArray);

        for(int j=0;j<n;j++){
            sumy += array[0][j];
            resultArray[0][j] = sumy;
        }

        print(resultArray);

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                resultArray[i][j] = array[i][j] + Math.min(resultArray[i-1][j],resultArray[i][j-1]);
            }
        }
        print(resultArray);

        return resultArray[n-1][m-1];

    }

    private static void print(int[][] array){
        int m = array.length;
        int n = array[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }

    //***************************************

    private static int function2(int[][] array){
        int m = array.length;
        int n = array[0].length;
        int[][] resultArray = new int[m][n];
        int sumx = 0;
        int sumy = 0;

        for(int i=0;i<m;i++){
            sumx += array[i][0];
            resultArray[i][0] = sumx;
        }

        printFunction(resultArray);

        for(int j=0;j<n;j++){
            sumy += array[0][j];
            resultArray[0][j] = sumy;
        }

        printFunction(resultArray);

        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                resultArray[i][j] = array[i][j] + Math.min(resultArray[i-1][j],resultArray[i][j-1]);
            }
        }

        printFunction(resultArray);

        return resultArray[n-1][m-1];
    }

    private static void printFunction(int[][] array){
        int m = array.length;
        int n = array[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(array[i][j]+",");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}
