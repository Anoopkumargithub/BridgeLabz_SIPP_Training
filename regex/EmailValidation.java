package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        String regex = "^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        String input = "Anoop234jns@xyz.com";      
        Matcher matcher = pattern.matcher(input);        
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
