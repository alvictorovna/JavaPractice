public class T2 {

    public static void main(String[] args) {
        String str = "Hello world 123  jhfgd454 jh4jg5 jjk 454";

        int strAlphaCount = str.replaceAll("[^A-Za-z]", "").length();
        System.out.println(strAlphaCount);

    }
}
