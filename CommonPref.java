public class CommonPref {
    public static void main(String[] args) {
        String[] input = new String[]{"flower", "flow", "flight"};
        System.out.println(commonprefix(input));


    }
     private static String commonprefix(String[] input){
         String prefix = input[0];
         for(int index=1 ; index<input.length ; index++){
             while(input[index].indexOf(prefix) != 0){
                 prefix = prefix.substring(0,prefix.length()-1);
             }
         }
         return prefix;
     }
}

