import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        
        System.out.println("input your number");
        int inputNumber = scanner.nextInt();
        System.out.println("now input operation: + - * /");
        String inputOperator = scanner.next();
        System.out.println("input your second number");
        int inputNumber2 = scanner.nextInt();

        System.out.println("your result is: " + calculate(inputNumber,inputNumber2,inputOperator));
    }
    private static int calculate(int first,int second,String operation){
        int result = 0;
        try {

        if(operation.equals("+")){
             result = first + second;
        }
        if (operation.equals("-")){
             result = first - second;
        }
        if (operation.equals("*")){
             result = first * second;
        }
        if (operation.equals("/")){
             result = first / second;
        }
        if (operation.equals("%")){
            result = first % second;
        }
        }catch (NumberFormatException e){
            System.out.println("please provide a valid number");
        }

        return result;
    }
}




















