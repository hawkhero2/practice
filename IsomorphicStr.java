import java.util.HashMap;

public class IsomorphicStr {
    public static void main(String[] args) {
        String input = "badc";
        String input2 = "baba";

        System.out.println(isIsomorphic(input,input2));
    }

// TODO: 2/4/2023 Optimize the algorithm
    private static boolean isIsomorphic(String s, String t){
        if (s.length() != t.length()){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i)) == false){
                if (map.containsValue(t.charAt(i))){
                    return false;
                }
                map.put(s.charAt(i),t.charAt(i));
            }
            else if (map.containsKey(s.charAt(i))){
                if (map.get(s.charAt(i)) !=t.charAt(i)){
                    return false;
                }
            }
        }

        return true;
    }

}
