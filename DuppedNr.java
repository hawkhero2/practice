import java.util.HashMap;

public class DuppedNr {
    public static void main(String[] args) {
        int[] input = {1,3,4,2,2};
        System.out.println(shiki(input));
    }
//    private static int findDuplicate(int[] nums){
//        HashMap<Integer,Integer> hashed = new HashMap<>();
//        for (int index=0; index < nums.length; index++){
//            if(hashed.containsKey(nums[index])){
//                return nums[index];
//            }
//            hashed.put(nums[index],1);
//        }
//        return 0;
//    }

    private static int shiki(int[] nums){

        for (int index = 0; index < nums.length; index++){
            int index2 = nums[index];
            if (index2 <0){
                index2= -index2;
            }
            if (nums[index2] <0){
                return index2;
            }
            else
                nums[index2] = -nums[index2];
        }
        return 0;
    }
}
