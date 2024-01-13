import java.util.Arrays;

public class T5 {

    public static boolean anagramCheck(String str, String str1){
        char[] charsArray = str.toCharArray();
        char[] charsArray1 = str1.toCharArray();

        if(str.length() != str1.length()){
            return false;
        }

        Arrays.sort(charsArray);
        Arrays.sort(charsArray1);

        return Arrays.equals(charsArray, charsArray1);
    }
    public static void main(String[] args) {

        String str = "listen";
        String str1 = "litene";
        if(anagramCheck(str, str1)){
            System.out.println("Anagram!");
        } else System.out.println("Not an Anagram");


    }
}
