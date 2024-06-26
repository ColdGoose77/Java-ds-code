public class LeetCode152 {

    public int maxProduct(int[] nums) {
        int n = nums.length;

        int[] f = new int[n + 1];
        int[] g = new int[n + 1];
        f[0] = 1;
        g[0] = 1;

        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            f[i] = Math.max(nums[i - 1], Math.max(f[i - 1] * nums[i - 1], g[i - 1] * nums[i - 1]));
            g[i] = Math.min(nums[i - 1], Math.min(g[i - 1] * nums[i - 1], f[i - 1] * nums[i - 1]));

            if (max < f[i]) {
                max = f[i];
            }
        }

        return max;
    }
}
