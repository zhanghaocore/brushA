public class MaxSumArray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);

        nums = new int[]{1};
        maxSum = getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);

        nums = new int[]{5,4, -1, 7, 8};
        maxSum = getMaxSum(nums);
        System.out.println("max sum is :" + maxSum);
    }

    public static int getMaxSum(int[] nums) {
        if (null == nums || 0 == nums.length) {
            return 0;
        }
        int pre = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            pre = pre < 0 ? num : pre + num;
            maxSum = Math.max(maxSum, pre);
        }
        return maxSum;
    }
}
