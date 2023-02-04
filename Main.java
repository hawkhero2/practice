import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] myarr = new int[20];
        for (int i = 0; i < myarr.length; i++) {
            myarr[i] = random.nextInt(100);

        }
        System.out.println("before:");
        System.out.println(Arrays.toString(myarr));

        quicksort(myarr,0, myarr.length-1);

        System.out.println("after:");
        System.out.println(Arrays.toString(myarr));
//        System.out.println(Arrays.toString(bubblesort(myarr)));

    }

    private static int[] bubblesort(int[] input) {
        int temp;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }

        }
        return input;
    }


    private static void quicksort(int[] input, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex){
            return;
        }
        int pivot = input[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer){
            while(input[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }
            while(input[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }
            swap(input,leftPointer,rightPointer);
        }
        swap(input,leftPointer,highIndex);
        quicksort(input,lowIndex,leftPointer-1);
        quicksort(input,leftPointer+1,highIndex);
    }

    private static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}