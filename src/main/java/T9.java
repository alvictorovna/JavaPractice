public class T9 {
    public static void main(String[] args) {
        String str = "abracadabra";

        for (int i = 0; i < str.length(); i++) {

            if(str.indexOf(str.charAt(i), i+1) == -1){
                System.out.println("First non repeated character " + str.charAt(i));
                break;
            }
        }
    }
}
