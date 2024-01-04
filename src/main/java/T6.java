import java.util.ArrayList;

public class T6 {
    public static void main(String[] args) {
        String str = "Hello world";
        int count = 0;
        String vow = "aeiou";

        ArrayList<Character> vowList= new ArrayList<>();

        for (int i = 0; i < vow.length(); i++){
            vowList.add(vow.charAt(i));
        }

        for (int i = 0; i < str.length(); i++){
            if(vowList.contains(str.charAt(i))){
                count++;
            }
        }

        System.out.println(count);


    }
}
