import java.util.ArrayList;
import java.util.List;

import static java.lang.Long.reverse;

public class ReverseArray {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);
        arr.add(9);
        arr.add(10);
        reverse(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void reverse(List<Integer> arr) {
        for (int i = 0; i < arr.size() / 2; i++) {
            int temp = arr.get(i);
            arr.set(i, arr.get(arr.size() - i - 1));
            arr.set(arr.size() - i - 1, temp);

        }
    }
}
