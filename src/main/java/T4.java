public class T4 {
    public static void main(String[] args) {
        String str = "madam";
        String strCheck = "";

        for(int i = str.length() - 1; i >= 0; i--){
            strCheck += str.charAt(i);
        }


        if(str.equalsIgnoreCase(strCheck)){
            System.out.println("Palindrome");
        }else System.out.println("Not a Palindrome");
    }
}
