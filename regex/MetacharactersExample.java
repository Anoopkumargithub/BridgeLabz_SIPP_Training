package regex;

import java.util.regex.*;
public class MetacharactersExample {
    public static void main(String[] args) {
        String regex = "\\d\\D";  // Matches a digit followed by a non-digit
        Pattern pattern = Pattern.compile(regex);
        String input = "7a 8b 99";      
        Matcher matcher = pattern.matcher(input);        
        while (matcher.find()) {
            System.out.println("Matched: " + matcher.group());
        }
    }
}
