package prefixSum;

public class RangeSumQuery_lc303 {
    int[] nums;

    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 3, 5};

        RangeSumQuery_lc303 obj = new RangeSumQuery_lc303(nums);

        System.out.println(obj.sumRange(1, 3));
        System.out.println(obj.sumRange(0, 2));
        System.out.println(obj.sumRange(2, 4));
    }

    public RangeSumQuery_lc303(int[] nums) {
        this.nums = nums;

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
    }

    public int sumRange(int left, int right) {
        if (left == 0) {
            return nums[right];
        }

        return nums[right] - nums[left - 1];
    }
}
