public class Solution {

    public int[] twoSum(int[] nums, int target) {
        int size = nums.length;
        int[] result = new int[2];
        for (int i = 0; i < size-1; i++) {
            for (int j = i+1; j < size; j++) {
                if((nums[i] + nums[j]) == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {3, 2, 4, 15};
        int target = 6;
        System.out.print(java.util.Arrays.toString(solution.twoSum(nums, target)));
    }
    
}
