import java.util.Arrays;

public class MissingNumb {
    public static void main(String[] args) {
        int[] input = {9,6,4,2,3,5,7,0,1};
        System.out.println(missingNumber(input));
    }
    private static int missingNumber(int[] nums) {
        int result=0;
        int sum =0;
        for (int index = 0; index < nums.length; index++){
            sum+=index+1;
            result+=nums[index];

        }

        return sum-result;
    }

}
