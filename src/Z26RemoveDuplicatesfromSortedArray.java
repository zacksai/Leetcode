public class Z26RemoveDuplicatesfromSortedArray {

    public int removeDuplicates(int[] nums) {

        // Store unique value position
        int u = 0;

        // Iterate through array starting with second position
        for (int j = 1; j < nums.length; j++) {

            // If value at this iteration is different than pointer value, increment & set pointer
            if (nums[u] != nums[j]) {
                nums[++u] = nums[j];
            }
        }

        // Return total (pointer + 1
        return u + 1;
    }


}
