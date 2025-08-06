package regex;

import java.util.regex.*;


public class QuantifierExample {
    public static void main(String[] args) {
        String regex = "\\d{2,4}";  // Matches 2 to 4 digits
        Pattern pattern = Pattern.compile(regex);
        String input = "12 123 12345 1";
        
        Matcher matcher = pattern.matcher(input);
        
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}