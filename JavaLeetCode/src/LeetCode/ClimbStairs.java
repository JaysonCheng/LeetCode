package LeetCode;

public class ClimbStairs {

    public int climbStairs(int n) {
        // DP
        if (n < 4) return n;

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for (int i = 4; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1] + dp[n - 2];

        // Recursion Bottom up Approach
//        if(n<=3){
//            //the numbers down of 3 no need a process
//            return n;
//        }else{
//            n=climbStairs(n, 3,2,4);
//        }
//        return n;
//        }
//        //result1 is te answer of the number before of n result2 answer before of result 1 as the example
//        //so if we have already the way to follow as the sum of steps 2 numbers before
//        //example n=4 ans=5 why? the answer of n=3 ans=3 and one before n=2 ans=2  ans of 3 plus ans of 2 is 5
//        // if n=5 is the sum of ans of 4 and 3 = 5+3 this is the result of steps of the number 5
//        static int climbStairs(int n,int result1,int result2,int number){
//            if(number==n){
//                return result1+result2;
//            }else{
//                return climbStairs(n, result1+result2, result1, number+1);
//            }
//        }
    }
}
