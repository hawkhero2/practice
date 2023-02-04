import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {
    public static void main(String[] args) {
        int[] nums = {2, 15, 11, 7};
        int target = 9;
        System.out.println(Arrays.toString(optimisedTwoSum(nums, target)));

    }

    private static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i=0; i < nums.length;i++){
            for (int j=1; j< nums.length; j++){
                if (nums[i]+nums[j] == target && i != j){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }

            }
        }
        return result;
    }
    private static int[] optimisedTwoSum(int[] nums, int target){
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numToIndex.containsKey(target - nums[i])) {
                return new int[] {numToIndex.get(target - nums[i]), i};
            }
            numToIndex.put(nums[i], i);
        }
        return new int[]{};
    }
}
