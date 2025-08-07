package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9_.-]{5,15}$";
        Pattern pattern = Pattern.compile(regex);
         String[] emails = {"user_123", "123user", "us"};
         for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " is valid: " + matcher.matches());
        }
    }
}
