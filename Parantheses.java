import java.util.*;

public class Parantheses {
    public static void main(String[] args) {
        String input = "()[]{}";
        String input2 = "[{)]";
//        var paranthesesMap = new HashMap<Character,Integer>();
        /*
        ( : 40
        ) : 41
        ] : 93
        [ : 91
        { : 123
        } : 125
        */

//        char[] inputChar = input.toCharArray();
//        for (char c :
//                inputChar) {
//            System.out.println(c+" : "+(int)c);
//            paranthesesMap.put(c,(int)c);
//        }

        System.out.println(validParanthese(input2));


    }

    private static boolean validParanthese(String input){
        Stack<Character> stack = new Stack<>();
        char[] charInput = input.toCharArray();
        for (int i = 0; i< charInput.length;i++){
            char current = charInput[i];
            if (current == '(' || current == '[' || current == '{'){
                stack.add(current);
            } else if (current == ')' || current == ']' || current == '}'){
                if (stack.empty()){
                    return false;
                }
                char top = stack.pop();
                int topAsci = (int) top;
                int currentAsci = (int)charInput[i];
                if ((topAsci - currentAsci != -2) && (topAsci - currentAsci != -1)){
                    return false;
                }
            }
        }

        return stack.empty();
    }
}
