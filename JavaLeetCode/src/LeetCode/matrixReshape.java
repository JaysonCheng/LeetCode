package LeetCode;

public class matrixReshape {

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;

        if(r*c != m*n) return nums;

        int[][] ans = new int[r][c];

        int k = 0;
        int l = 0;
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                ans[i][j] = nums[k][l];
                l++;
                if(l == n) {
                    k++;
                    l = 0;
                }
            }
        }
        return ans;
    }
}
