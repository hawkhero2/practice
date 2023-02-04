import java.lang.reflect.Array;
import java.util.Arrays;

public class ConcantArray {
    public static void main(String[] args) {
        int[] input = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(input)));
    }
    private static int[] getConcatenation(int[] nums) {
        int[] result = new int[nums.length*2];
        for (int index = 0; index < result.length/2; index++){
            result[index] = nums[index];
            result[index + result.length/2] = nums[index];
        }
        return result;
    }
}
