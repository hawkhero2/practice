import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void main(String[] args) {
        int input = 3;
        generateP(input);
        String[] som;
    }

    private static List<String> generateP(int input) {
        List<String> result = new ArrayList<>();
        /*
        n=2
        (())
        ()()
         */
        char[] temp = new char[input*2];
        if (input == 1){
            result.add("()");
            return result;
        }
        if (input > 1){
            for (int i = 0; i < input*2; i++){
                String n3 ="((()))" +
                        "(()())" +
                        "(())()" +
                        "()(())" +
                        "()()()";
            }
        }
        return result;
    }
}
