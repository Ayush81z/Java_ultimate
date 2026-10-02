package Arrays;

public class MoveZeroes_lc283 {
    public void moveZeroes(int[] nums) {
        //two pointer slow and fast
        int slow = 0;
        for (int fast = 0; fast < nums.length ; fast++) {

            // slow points to the position where the next non-zero element should be placed.
            if (nums[fast] != 0) {
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
        }
    }
}
