package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateValidation {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}+[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
         String[] emails = {"AB1234", "1234AB", "us1234"};
         for (String email : emails) {
            Matcher matcher = pattern.matcher(email);
            System.out.println(email + " is valid: " + matcher.matches());
        }
    }
}
