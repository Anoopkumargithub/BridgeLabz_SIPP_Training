package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UsernameValidation {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z]+[a-zA-Z0-9_.-]{5,15}$";
        Pattern pattern = Pattern.compile(regex);
         String[] usernames = {"user_123", "123user", "us"};
         for (String username : usernames) {
            Matcher matcher = pattern.matcher(username);
            System.out.println(username + " is valid: " + matcher.matches());
        }
    }
}
