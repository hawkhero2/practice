import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {
    public static void main(String[] args) {
        String input = "LVIII";
        System.out.println(romanToInt(input));
        String romans=
                """
                I             1
                V             5
                X             10
                L             50
                C             100
                D             500
                M             1000
                """;
    }
    private static int romanToInt(String s){
        HashMap<Character,Integer> romanSymbolMap = new HashMap<>(Map.of(
                'I',1,
                'V',5,
                'X',10,
                'L',50,
                'C',100,
                'D',500,
                'M',1000
        ));
        int result = 0;
        for (int index = 0; index < s.length(); index++){
            if (index+1 < s.length() && romanSymbolMap.get(s.charAt(index+1)) >romanSymbolMap.get(s.charAt(index))){
                    result-=romanSymbolMap.get(s.charAt(index));
            }else {
                result+=romanSymbolMap.get(s.charAt(index));
            }
        }

//        if (s.length()>1){
//
//            for (int i = 0; i < s.toCharArray().length-1; i++) {
//
//                if (s.charAt(i) =='C' && s.charAt(i+1) != 'D' && s.charAt(i+1) != 'M'){
//                    result = result +100;
//                }
//                if ((s.charAt(i) == 'C') && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M')){
//                    result = result -100;
//                }
//                if (s.charAt(i) == 'I' && s.charAt(i+1) != 'V' && s.charAt(i+1) != 'X'){
//                    result = result +1;
//                }
//                if ((s.charAt(i) == 'I') && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X')){
//                    result = result -1;
//                }
//                if (s.charAt(i) == 'X' && s.charAt(i+1) != 'L' && s.charAt(i+1) != 'C'){
//                    result = result +10;
//                }
//                if ((s.charAt(i) == 'X') && (s.charAt(i+1) =='L' || s.charAt(i+1) == 'C')){
//                    result = result -10;
//                }
//                if (s.charAt(i) == 'L'){
//                    result = result +50;
//                }
//                if (s.charAt(i) == 'D'){
//                    result = result +500;
//                }
//                if (s.charAt(i) == 'M'){
//                    result = result +1000;
//                }
//                if (s.charAt(i) == 'V'){
//                    result = result +5;
//                }
//            }
//        }
//        if(s.charAt(s.length()-1) == 'I'){
//            result = result + 1;
//        }
//        if (s.charAt(s.length()-1) == 'V'){
//            result = result + 5;
//        }
//        if (s.charAt(s.length()-1) == 'X'){
//            result = result +10;
//        }
//        if (s.charAt(s.length()-1) == 'L'){
//            result = result +50;
//        }
//        if (s.charAt(s.length()-1) == 'C'){
//            result = result +100;
//        }
//        if (s.charAt(s.length()-1) == 'D'){
//            result = result +500;
//        }
//        if (s.charAt(s.length()-1) == 'M'){
//            result = result +1000;
//        }


        return result;
    }

}
