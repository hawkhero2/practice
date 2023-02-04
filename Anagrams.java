import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var sample1 = scanner.next();
        var sample2 = scanner.next();
        scanner.close();

        if (isAnagram(sample1, sample2)){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
    }
    private static boolean isAnagram(String word1, String word2){
        var anagram = true;

//        if (!Arrays.equals(word1.toLowerCase().toCharArray(), word2.toLowerCase().toCharArray())){
//            return anagram = false;
//        }
//        var charrArray1 = word1.toLowerCase().toCharArray();
//        var charrArray2 = word2.toLowerCase().toCharArray();

        if (word1.toLowerCase().toCharArray().length != word2.toLowerCase().toCharArray().length){
            return anagram = false;
        }

        var word1Hash = hashing(word1);
        var word2Hash = hashing(word2);
        /*
        * pt optimizare
        * folosim un array de marimea n ( unde n are valorea 26, toate literele din alfabet)
        * scadem ordinalul literei - ordinalul de 'a'
        * si incrementam +1 pozitia obtinuta in urma scaderii ordinalelor
        * exemplu:{
        * int position = ordinal(charrArray[i]- ordinal('a')
        * anagramArray[position] ++
        * pt al doilea cuvant se procedeaza la fel, singura diferenta este ca scadem cu 1
        *
        * */

        if(word1Hash.size() != word2Hash.size()) {
            return anagram = false;
        }
        int passChecks = 0; // the number of passChecks should equal the number of entries in the hashMap
        if(passChecks <= 0){
            for (Map.Entry<Character, Integer> entry : word1Hash.entrySet()) {
                Character key = entry.getKey();
                Integer value = entry.getValue();
                if(word2Hash.containsKey(key) && value.equals(word2Hash.get(key))) {
                    passChecks++;
                } else {
                    return anagram = false;
                }
            }
        }
        if (passChecks == word1Hash.size()){
            return anagram;
        }

        return anagram;
    }

    private static HashMap<Character,Integer> hashing(String word){
        var hashedWord = new HashMap<Character,Integer>();
        String loweredCase = word.toLowerCase();
        char[] chars = loweredCase.toCharArray();
        for (char letter : chars){
            if (hashedWord.containsKey(letter) == false){
                hashedWord.put(letter,1);
            }
            else if (hashedWord.containsKey(letter)){
                hashedWord.computeIfPresent(letter,(k ,v) -> v+1);
            }
        }

        return hashedWord;
    }

}
