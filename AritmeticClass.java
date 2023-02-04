import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ArithmeticClass {

    List<String> arithmeticOrder = new ArrayList<>();
    List<String> arithmeticOperators = Arrays.asList("-", "+", "*", "/", "%");
    public void getArithmeticOperator(String s) {
        for(String operator: arithmeticOperators)
        {
            if (s.contains(operator)) {
                arithmeticOrder.add(operator);
            }
        }
    }

    public float parseNumber(String number) {
        try {
            return Float.parseFloat(number);
        } catch (NumberFormatException e) {
            return Integer.parseInt(number);
        }
    }

    public String doArithmeticOperation(String input) {
        String[] stringArray = input.split("[-+*/%]");
        List<Float> numbersList = new ArrayList<>();
        getArithmeticOperator(input);
        for(String nr: stringArray) {
            numbersList.add(parseNumber(nr));
        }
        float result = 0;
        while(!numbersList.isEmpty()) {
            float operator1 = 0;
            operator1 = numbersList.remove(0);
            if (!arithmeticOrder.isEmpty() || numbersList.get(0) != null) {
                String arithmeticOperator = arithmeticOrder.remove(0);
                float operator2 = numbersList.remove(0);
                float operation = 0;
                if (arithmeticOperator.contains("-")) {
                    operation = operator1 - operator2;
                } else if (arithmeticOperator.contains("+")) {
                    operation = operator1 + operator2;
                } else if (arithmeticOperator.contains("*")) {
                    operation = operator1 * operator2;
                } else if (arithmeticOperator.contains("/")) {
                    operation = operator1/operator2;
                } else if (arithmeticOperator.contains("%")) {
                    operation = operator1%operator2;
                }
                result = result + operation;
            } else {
                result = result + operator1;
            }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args) {
        ArithmeticClass arithmeticClass = new ArithmeticClass();
        System.out.println(arithmeticClass.doArithmeticOperation("3/2"));
    }
}