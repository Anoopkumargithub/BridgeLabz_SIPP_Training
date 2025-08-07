package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LicensePlateValidation {
    public static void main(String[] args) {
        String regex = "^[A-Z]{2}+[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
         String[] plates = {"AB1234", "1234AB", "us1234"};
         for (String plate : plates) {
            Matcher matcher = pattern.matcher(plate);
            System.out.println(plate + " is valid: " + matcher.matches());
        }
    }
}
