import java.util.Scanner;

public class StringSplit {
    public static void main(String[] args) {
        /*
        * Given a string,S , matching the regular expression [A-Za-z !,?._'@]+,
        * split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
        * Then, print the number of tokens, followed by each token on a new line.
        * Note: You may find the String.split method helpful in completing this challenge.
        *
        * */

        var scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        scanner.close();
//        String testCase = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
//        tokens(testCase);
//      + - * / ^
        String toCalculate = "12/2";
        operationString(toCalculate);


    }
    private static void operationString(String input){
        var splitted = input.split("[+]");
        if (splitted.length > 2){

        }
//        String[] splitted = input.split("[*-+/^]");
//        var nr = Integer.parseInt(input);
    }
    private static void tokens(String input){
        /*
        * This function will split the string
        * will print the number of items
        * and for each item in the array it will print out the item
        * */
        if (!input.isEmpty()){
            String trimmedStr = input.trim();
            String[] slicedString = trimmedStr.split("[, '@._!?]+");
            System.out.println(slicedString.length);
            for (String item:
                 slicedString) {
                System.out.println(item);
            }

        }
    }
}
