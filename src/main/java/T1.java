public class T1 {
    public static void main(String[] args) {
        String str1 = "Hello World!";
        String str2 = "My name is Alesia";

        str1 += str2;

        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println(str1);
        System.out.println(str2);

    }
}
