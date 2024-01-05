package T14;

import java.util.regex.Pattern;

public class Registration {
    private static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[yahoo.com]+", Pattern.CASE_INSENSITIVE);
    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        setUserName(userName);
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(VALID_EMAIL_ADDRESS_REGEX.matcher(email).matches()){
            this.email = email;
        } else throw  new IllegalArgumentException();

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.length()>6 && !password.equalsIgnoreCase(userName)){
            this.password = password;
        } else throw new IllegalArgumentException();


    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if(userName.length() > 6){
            this.userName = userName;
        } else throw new IllegalArgumentException();

    }
}

class TestRegistration{
    public static void main(String[] args) {
        Registration registration = new Registration("alesia@yahoo.com", "Alesia Sushchyk", "1234567");

        //registration.setEmail("alesia@gmail.com");
        //registration.setUserName("Alesia");
        //registration.setPassword("Alesia Sushchyk");
    }
}
