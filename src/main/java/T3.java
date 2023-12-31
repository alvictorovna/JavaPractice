public class T3 {

    public static String reverseString(String str){
        String strResult = "";
        if (str.isEmpty() || str.length() == 1){
            return str;
        }
        for(int i = str.length()-1; i >= 0; i--){
            strResult += str.charAt(i);
        }

        return strResult;
    }
    public static void main(String[] args) {
        String reverse = reverseString("Hello world");

        System.out.println(reverse);
    }
}
